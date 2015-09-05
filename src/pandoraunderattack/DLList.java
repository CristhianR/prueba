
package pandoraunderattack;


public class DLList {
    
    private nodo inicio;
    private nodo fin;
    
    
    public DLList() {
        inicio = null;
        fin = null;
    }
    
    public void insertarInicio(String dato) {
        
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
    
    public void insertarFin(String dato) {
        
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
    
    public String ExtraerInicio(){
        
        String dato =inicio.getDato();
        inicio = inicio.getSiguiete();
        
        if(inicio != null) {
            
            inicio.setAnterior(null);
        }
        else {
            
            fin = null;
            
        }
        
        return dato;
    }
    
    
    public String ExtraerFin(){
        
        String dato =fin.getDato();
        fin = fin.getAnterior();
        
        if(inicio != null) {
            
            fin.setSiguiente(null);
        }
        else {
            
            inicio = null;
            
        }
        
        return dato;
   }
    
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
