package Proyecto_Datos_1.src.Inicio_Sesión;


/**
 * Es una lista enlazada en la cu[al podemos agregar diferentes objetos
 * @param <T> Es el objeto que queremos meter en la lista
 * @autor https://www.digitalocean.com/community/tutorials/java-linkedlist-linkedlist-java
 */
public class Lista<T> {
    public Nodo<T> head;
    public Nodo<T> tail;
    private Nodo<T> actual;

    /**
     * Metodo para anadir nodos a la lista
     * @param _value Es el objeto que deseamos agregar jun con sus caracteristicas que lo componen
     */
    public void addNodo(T _value) {
        Nodo<T> newValue = new Nodo<T>(_value);
        if(head == null){
            head = newValue;
            actual = head;
        }else{
            tail.next = newValue;
        }
        tail = newValue;
    }

    /**
     * Metodo mediante el cual se puede obtener el contenido de un nodo
     * @return Retorna tmp, el cual es el contenido del nodo
     */
    public Nodo<T> getNodo(){
        if(head == null || actual == null){
            return null;
        }
        Nodo<T> tmp = actual;
        if(actual.next != null){
            actual = actual.next;
        }else{
            actual = null;
        }
        return tmp;
    }

    /**
     * Para resetear una lista
     */
    public void reset(){
        actual = head;
    }
}
