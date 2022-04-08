package persistencia;

import Control.PasswordEncrypt;
import Exceptions.DAOException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.UUID;
import org.bson.Document;

/**
 *
 * metodos para crud de usuarios normales
 */
public class RepUsuario extends BaseDAO<Usuario> {

    /**
     *
     * @return Regresa todos los datos que se hayan encontrado en la base de datos
     * @throws DAOException Regresa una excepcion en caso de que no se hayan podido recuperar los datos de la base de datos
     */
    @Override
    public ArrayList<Usuario> retrieveAll() throws DAOException {
        MongoCollection<Usuario> coleccion = this.getCollection();
        FindIterable<Usuario> usuarios = coleccion.find();
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        return usuarios.into(listaUsuarios);
    }

    /**
     *
     * @param usuario
     * @throws DAOException Regresa una excepcion en caso de que no se haya podido insertar los datos a la base de datos
     */
    @Override
    public void save(Usuario usuario) throws DAOException {
        MongoCollection<Usuario> coleccion = this.getCollection();
        coleccion.insertOne(usuario);
    }

    /**
     * Busca y elimina una entidad en la base de datos
     *
     * @param usuario
     * @throws DAOException Regresa una excepcion en caso de que ocurriera un error al intentar remove una entidad en la base de datos
     */
    @Override
    public void remove(Usuario usuario) throws DAOException {
        MongoCollection<Usuario> coleccion = this.getCollection();
        Document filtroEliminacion = new Document("_id", usuario.getId());
        coleccion.deleteOne(filtroEliminacion);
    }

    /**
     *
     * @param usuario
     * @throws DAOException
     */
    @Override
    public void update(Usuario usuario) throws DAOException {
        MongoCollection<Usuario> coleccion = this.getCollection();
        Document filtroActualizacion = new Document("_id", usuario.getId());

        Document datosActualizados = new Document("$set",
                new Document("nombre", usuario.getNombre())
                        .append("correo", usuario.getCorreo())
                        .append("contrasena", usuario.getContrasena())
                        .append("edad", usuario.getEdad())
                        .append("tutor", usuario.getTutor()));

        coleccion.findOneAndUpdate(filtroActualizacion, datosActualizados);
    }

    /**
     *
     * @param id
     * @return
     * @throws DAOException
     */
    @Override
    public Usuario get(UUID id) throws DAOException {
        MongoCollection<Usuario> coleccion = this.getCollection();
        Document filtroBusqueda = new Document("_id", id);
        FindIterable<Usuario> usuarios = coleccion.find(filtroBusqueda);
        Usuario usuario = usuarios.first();
        return usuario;
    }

    /**
     *
     * @param correo
     * @return
     */
    public Usuario getByEmail(String correo) {
        MongoCollection<Usuario> coleccion = this.getCollection();
        Document filtroBusqueda = new Document("correo", correo);
        FindIterable<Usuario> usuarios = coleccion.find(filtroBusqueda);
        Usuario usuario = usuarios.first();
        return usuario;
    }

    /**
     *
     * @param correo
     * @param password
     * @return
     */
    public Usuario getByLoginCredentials(String correo, String password) {
        MongoCollection<Usuario> coleccion = this.getCollection();
        Document filtroBusqueda = new Document("correo", correo);

        FindIterable<Usuario> usuarios = coleccion.find(filtroBusqueda);

        Usuario usuario = usuarios.first();
        if (usuario != null) {
            if (PasswordEncrypt.validatePassword(password, usuario.getContrasena())) {
                return usuario;
            }
        }

        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public MongoCollection<Usuario> getCollection() {
        MongoDatabase bd = this.getDatabase();
        MongoCollection<Usuario> coleccion = bd.getCollection("users", Usuario.class);
        return coleccion;
    }

}
