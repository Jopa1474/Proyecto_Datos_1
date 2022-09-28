package Proyecto_Datos_1.src.Inicio_Sesión;

public class Usuario {
    String usuario;
    private String contraseña;

    public Usuario(String _usuario, String _contraseña){
        usuario = _usuario;
        contraseña = _contraseña;
    }

    public boolean validarUsuario(){
        return !usuario.isEmpty() && !contraseña.isEmpty();
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
