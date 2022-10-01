package Proyecto_Datos_1.src.Inicio_Sesión;

/**
 * Clase nodo, la cual es vital para la clase lista, los nodos son los contenidos de una lista, para este caso, son objetos
 * @param <T> Es cualquier objeto
 */
public class Nodo<T> {

    public T value;

    public Nodo<T> next;

    /**
     * Metodo para inicializar los nodos
     * @param _value El contenido de cada objeto
     */
    public Nodo(T _value){
        value = _value;
    }
}

