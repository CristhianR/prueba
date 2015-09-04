
package pandoraunderattack;

public class Recursos {
    
    String nombreRecurso;
    int meritocracia;
    int resursos;
    
    
    
    public Recursos(){
        
        nombreRecurso = nombreRecurso;
        meritocracia = meritocracia;
        
    }
    public void recursos(){
        
        if(nombreRecurso == "oro"){
            meritocracia += 100;}
        if(nombreRecurso == "plata"){
            meritocracia += 50;}
        if(nombreRecurso == "cobre"){
            meritocracia += 25; }
        if(nombreRecurso == "hierro"){
            meritocracia += 15; }
        if(nombreRecurso == "piedra"){
            meritocracia += 10; }
        if(nombreRecurso == "acero"){
            meritocracia += 20; }
        if(nombreRecurso == "madera"){
            meritocracia += 5; }
        if(nombreRecurso == "piedraMagica"){
            meritocracia += 1500; }
        
    }
    
    public void Recolectar() {
        
        System.out.println("Recogiste" + nombreRecurso);
        System.out.println("Ganas" + meritocracia + "pts");
    }
    
    
    
}
