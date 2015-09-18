
package pandoraunderattack;

/**
 * Se declara la clase nodo.
 * Esta clase sirve como puntero para la clase DLList, contiene los métodos para 
 * @author cristhian
 * @version 15/09/15
 */
public class nodo {
    // Se Declaran los atributos de la clase. 
    private nodo siguiente;
    private nodo anterior;
    private Object dato;
    
    
    /**
     * Se crea el constructor de la clase.
     * @param dat es el objeto que se "movilizara" en las listas es decir, se agrega o se elimina.
     * @param ant es un apuntador hacia atras.
     * @param sig  es un apuntador hacia adelante.
     */
    public nodo(Object dat, nodo ant, nodo sig){
        
        siguiente = sig;
        anterior = ant;
        dato = dat;
    }
    
    
    public nodo getSiguiete(){
        return siguiente;
    }
    
    /**
     * Este set mueve el puntero hacia adelante
     * @param siguiente 
     */
    public void setSiguiente(nodo siguiente){
        this.siguiente = siguiente;
    }
    
    
    public nodo getAnterior(){
        return anterior;
    }
    
    /**
     * Este set mueve el puntero hacia atras
     * @param anterior 
     */
    public void setAnterior(nodo anterior){
        this.anterior = anterior;
    }
    
    
    public Object getDato() {
        return dato;
    }
    
    /**
     * Este set mueve el dato.
     * @param dato 
     */
    public void setdato(Object dato) {
        this.dato = dato;
    }
    
}
