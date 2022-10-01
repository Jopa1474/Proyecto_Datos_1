package Proyecto_Datos_1.src.General;

import Proyecto_Datos_1.src.Inicio_Sesión.Lista;

public class Libreria {
    String creador;
    String nombre;

    public Libreria(String _creador, String _nombre){
        creador = _creador;
        nombre = _nombre;
    }

    public String getCreador(){
        return creador;
    }
    public String getNombre(){
        return nombre;
    }
    public boolean LibreriaValida(){
        return !nombre.isEmpty();
    }

    public boolean NombreValido(String _nombre){
        return nombre.equals(_nombre);
    }

    public String toString(){
        return("Libreria Musical \n \t Creador: " + creador + "\n \t Nombre: " + nombre);
    }
}
