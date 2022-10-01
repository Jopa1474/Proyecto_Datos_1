package Proyecto_Datos_1.src.General;

import Proyecto_Datos_1.src.Inicio_Sesión.Lista;

/**
 * Clase para el objeto Libreria, el cual contendra las canciones
 */
public class Libreria {
    String creador;
    String nombre;

    /**
     * Metodo constructor para libreria
     * @param _creador Es el usuario que creo la libreria
     * @param _nombre Es el nombre de la libreria
     */
    public Libreria(String _creador, String _nombre){
        creador = _creador;
        nombre = _nombre;
    }

    /**
     * Metodo para obtener el creador de la libreria
     * @return
     */
    public String getCreador(){
        return creador;
    }

    /**
     * Metodo para obtener el nombre de la lista
     * @return
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Metodo para verificar que la libreria sea valida
     * @return Retorna si la libreria es valida es valido
     */
    public boolean LibreriaValida(){
        return !nombre.isEmpty();
    }
    /**
     * Metodo para verificar que el nombre de la libreria sea valido
     * @return Retorna si el nombre es valido
     */
    public boolean NombreValido(String _nombre){
        return nombre.equals(_nombre);
    }

    /**
     * Imprime en la consola la libreria
     * @return Imprime la libreria + su creador + nombre
     */
    public String toString(){
        return("Libreria Musical \n \t Creador: " + creador + "\n \t Nombre: " + nombre);
    }
}
