package persistencia;

import entidades.Expediente;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Clase interfaz de los metodos de datos
 *
 * @author
 */
public interface IDatos {

    /**
     * Busca un expediente en la base de datos
     *
     * @param id
     * @return Regresa un estado en caso de que se haya encontrado
     */
    public Expediente getExpediente(UUID id);

    /**
     * Guarda un expediente en la base de datos
     *
     * @param expediente Recibe un estado el cual se guardara en la base de datos
     */
    public void saveExpediente(Expediente expediente);

    /**
     * Actualiza un expediente en la base de datos
     *
     * @param id
     * @param expediente Recibe un estado el cual se actualizara en la base de datos
     */
    public void updateExpediente(UUID id, Expediente expediente);

    /**
     * Elimnar un expediente de la base de datos
     *
     * @param expediente
     */
    public void removeExpediente(Expediente expediente);

    /**
     * Obtiene todos los expedientes de la base de datos mediante una consulta
     *
     * @return Regresa todos los expedientes que se hayan podido recuperar de la base de datos
     */
    public ArrayList<Expediente> getExpedientes();

    /**
     * Busca un usuario en la base de datos
     *
     * @param id
     * @return Regresa un usuario en caso de que se haya encontrado
     */
    public Usuario getUsuario(UUID id);

    /**
     * Guarda un usuario en la base de datos
     *
     * @param usuario Recibe un usuario el cual se guardara en la base de datos
     */
    public void saveUsuario(Usuario usuario);

    /**
     * Actualiza un usuario en la base de datos
     *
     * @param id
     * @param usuario Recibe un usuario el cual se actualizara en la base de datos
     */
    public void updateUsuario(UUID id, Usuario usuario);

    /**
     * Elimina un usuario de la base de datos
     *
     * @param usuario
     */
    public void removeUsuario(Usuario usuario);

    /**
     * Obtiene todos los usuarios de la base de datos mediante una consulta
     *
     * @return Regresa todos los usuarios que se hayan podido recuperar de la base de datos
     */
    public ArrayList<Usuario> getUsuarios();

}
