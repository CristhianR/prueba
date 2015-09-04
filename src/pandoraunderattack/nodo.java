
package pandoraunderattack;


public class nodo {
    
    private nodo siguiente;
    private nodo anterior;
    private String dato;
    
    
    public nodo(String dat, nodo ant, nodo sig){
        
        siguiente = sig;
        anterior = ant;
        dato = dat;
    }
    
    
    public nodo getSiguiete(){
        return siguiente;
    }
    
    
    public void setSiguiente(nodo siguiente){
        this.siguiente = siguiente;
    }
    
    
    public nodo getAnterior(){
        return anterior;
    }
    
    public void setAnterior(nodo anterior){
        this.anterior = anterior;
    }
    
    
    public String getDato() {
        return dato;
    }
    
    public void setdato(String dato) {
        this.dato = dato;
    }
    
}
