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



    public String toString(){
        return ("Usuario \n \t User: " + usuario + "\n \t  Password: " + contraseña);
    }

    public boolean validarDatos(String _user, String _password){
        return usuario.equals(_user) && contraseña.equals(_password);
    }
    public String getUsuario(){
        return usuario;
    }
}
