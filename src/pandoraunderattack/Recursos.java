
package pandoraunderattack;

public class Recursos {
    
    String nombreRecurso;
    int meritocracia;
    boolean SubeRango;
    int ID;
    int x;
    int y;
    
    
    public Recursos(Jugador jug){
        
        DLList recursos = new DLList();
        
        recursos.insertarInicio("Oro");// No sé si así será como se usa la DLList.
        recursos.insertarInicio("Plata");
        recursos.insertarInicio("Madera");
        recursos.insertarInicio("Piedra");
        recursos.insertarInicio("Hierro");
        recursos.insertarInicio("Cobre");
        recursos.insertarInicio("Acero");
        recursos.insertarInicio("PiedraMagica");
        
        recursos.insertarInicio(nombreRecurso); //No sé cual es más conveniente usar.
        
       
        
    }

    public void recursos(Jugador jug){
        
        if(nombreRecurso == "Oro"){
            jug.meritocracia += 100;}
        if(nombreRecurso == "Plata"){
            jug.meritocracia += 50;}
        if(nombreRecurso == "Cobre"){
            jug.meritocracia += 25; }
        if(nombreRecurso == "Hierro"){
            jug.meritocracia += 15; }
        if(nombreRecurso == "piedra"){
            jug.meritocracia += 10; }
        if(nombreRecurso == "Acero"){
            jug.meritocracia += 20; }
        if(nombreRecurso == "Madera"){
            jug.meritocracia += 5; }
        if(nombreRecurso == "PiedraMagica"){
            jug.meritocracia += 1500; }
        
    }
    
    public void Recolectar() {
        
        System.out.println("Recogiste" + nombreRecurso);
        System.out.println("Ganas" + meritocracia + "pts");
    }
    
    public void Rangos(Jugador jug){
        
        if((jug.getRango() == "Novato")&& (jug.meritocracia == 100)){
            jug.setRango("Soldado");
            SubeRango = true;}
        if((jug.getRango() == "Soldado")&& (jug.meritocracia == 500)&& (jug.ExpBatalla == 5)){
            jug.setRango("Capitan");
             SubeRango = true;}
        if((jug.getRango() == "Capitan")&& (jug.meritocracia == 1500)&& (jug.ExpBatalla == 15)){
            jug.setRango("Comandante");
             SubeRango = true;}
        if((jug.getRango() == "comandante")&& (jug.meritocracia == 1500)&& (jug.ExpBatalla == 35)){
            jug.setRango("Caballero");
             SubeRango = true;}
        else {
             SubeRango = false;
        }
       
    }
    
    public void SubirRango(Jugador jug){
        
        if(SubeRango == true){
            System.out.println("Subes de Rango a: "+ jug.getRango());
        }
    }
    
    
    
}
