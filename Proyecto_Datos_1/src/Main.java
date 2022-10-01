package Proyecto_Datos_1.src;

import Proyecto_Datos_1.src.Inicio_Sesión.Lista;
import Proyecto_Datos_1.src.Inicio_Sesión.Login;
import Proyecto_Datos_1.src.Inicio_Sesión.Usuario;

/**
 * Clase main, encargada de iniciar el programa
 */
public class Main {
    public static void main(String[] args){
        Lista<Usuario> user = new Lista<>();
        user.addNodo(new Usuario("test", "123"));
        user.addNodo(new Usuario("CR7", "777"));
        Login loginFrame = new Login();
        loginFrame.setUsuario(user);
    }
}
