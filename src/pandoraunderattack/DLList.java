
package pandoraunderattack;

/**
 * Se declara la clase DLList.
 * Esta clase es una lista doblemente enlazada.
 * @author cristhian
 * @version 15/09/15
 */
public class DLList {
    // Se declaran los atributos de la clase.
    private nodo inicio;
    private nodo fin;
    
    /**
     * Se crea el constructor.
     */
    public DLList() {
        inicio = null;
        fin = null;
    }
    /**
     * Se crea el método de insertar.
     * Este método sirve más que todo para agregar objetos a la lista.
     * @param dato 
     */
    public void insertarInicio(Object dato) {
        
        if(inicio == null){
            
            inicio = new nodo(dato,null,null);
            fin = inicio;
        } 
        else {
            nodo nuevo = new nodo(dato,null,inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }
    /**
     * este modo es análogo al anterior solo que agrega datos al final de la lista.
     * @param dato 
     */
    public void insertarFin(Object dato) {
        
        if(inicio == null){
            
            fin = new nodo(dato,null,null);
            inicio = fin;
        } 
        else {
            nodo nuevo = new nodo(dato,fin,inicio);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    /**
     * Se crea el método extraer el cual sirve para eliminar datos al inicio de la lista.
     * @return 
     */
    public Object ExtraerInicio(){
        
        Object dato =inicio.getDato();
        inicio = inicio.getSiguiete();
        
        if(inicio != null) {
            
            inicio.setAnterior(null);
        }
        else {
            
            fin = null;
            
        }
        
        return dato;
    }
    
    /**
     * Análogo al anterior solo que elimina datos al final de la lista.
     * @return 
     */
    public Object ExtraerFin(){
        
        Object dato =fin.getDato();
        fin = fin.getAnterior();
        
        if(inicio != null) {
            
            fin.setSiguiente(null);
        }
        else {
            
            inicio = null;
            
        }
        
        return dato;
   }
    /**
     * Este y el siguiente método son solo para imprimir las lista, de adelante hacia atras y viceversa.
     */
    public void MostrarAdelante(){
        
        nodo temp = inicio;
        
        while(temp != null){
            
            
            System.out.println(temp.getDato());
            temp = temp.getSiguiete();
        }
        
        }
    
    
    
    public void MostrarInverso(){
        
        nodo temp = fin;
        
        while(temp != null){
            
            System.out.println(temp.getDato());
            temp = temp.getAnterior();
        }

    }
    
    /**
     * Se crea el método buscar.
     * Este método sirve para buscar un dato en específico.
     * @param dato
     * @return  un valor booleano
     */
    public Boolean buscar(String dato){
        
        nodo temp = inicio;
        
        while(temp != null){
            
            if(temp.getDato().equals(dato)){
                return true;
            }
           
            temp = temp.getSiguiete();
        }
        
        return false;
    }
            
    
}
