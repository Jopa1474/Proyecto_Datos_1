package Proyecto_Datos_1.src;

import Proyecto_Datos_1.src.Inicio_Sesión.Lista;
import Proyecto_Datos_1.src.Inicio_Sesión.Login;
import Proyecto_Datos_1.src.Inicio_Sesión.Usuario;

public class Main {
    public static void main(String[] args){
        Lista<Usuario> test = new Lista<>();
        test.addNodo(new Usuario("test", "123"));
        Login loginFrame = new Login();
        loginFrame.setUsuario(test);
    }
}
