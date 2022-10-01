package Proyecto_Datos_1.src.Inicio_Sesión;

/**
 * Clase para crear un objeto llamado ususario con diferentes propiedades
 */
public class Usuario {
    String usuario;
    private String contraseña;

    /**
     * Metodo constructor de Usuario
     * @param _usuario Es el nombre del usuario
     * @param _contraseña Es la contraseña del usuario
     */
    public Usuario(String _usuario, String _contraseña){
        usuario = _usuario;
        contraseña = _contraseña;
    }

    /**
     * Imprime el usuario
     * @return Imprime en la consola Usuario + usuario + contraseña
     */

    public String toString(){
        return ("Usuario \n \t Usuario: " + usuario + "\n \t  Password: " + contraseña);
    }

    /**
     * Metodo para validar que los datos del usuario sean válidos
     * @param _user El nombre de usuario
     * @param _password La contraseña del usuario
     * @return Si el usuario es igual a _user y se la contraseña es igual a _contraseña
     */
    public boolean validarDatos(String _user, String _password){
        return usuario.equals(_user) && contraseña.equals(_password);
    }

    /**
     * Metodo para obtener un usuario
     * @return Retorna el usuario
     */
    public String getUsuario(){
        return usuario;
    }
}
