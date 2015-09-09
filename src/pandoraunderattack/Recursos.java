
package pandoraunderattack;

public class Recursos {
    
    String NombreRecurso;
    int Meritocracia;
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
        
        recursos.insertarInicio(NombreRecurso); //No sé cual es más conveniente usar.
        
       
        
    }

    public void recursos(Jugador jug){
        
        if(NombreRecurso == "Oro"){
            jug.Meritocracia += 100;}
        if(NombreRecurso == "Plata"){
            jug.Meritocracia += 50;}
        if(NombreRecurso == "Cobre"){
            jug.Meritocracia += 25; }
        if(NombreRecurso == "Hierro"){
            jug.Meritocracia += 15; }
        if(NombreRecurso == "piedra"){
            jug.Meritocracia += 10; }
        if(NombreRecurso == "Acero"){
            jug.Meritocracia += 20; }
        if(NombreRecurso == "Madera"){
            jug.Meritocracia += 5; }
        if(NombreRecurso == "PiedraMagica"){
            jug.Meritocracia += 1500; }
        
    }
    
    public void Recolectar() {
        
        System.out.println("Recogiste" + NombreRecurso);
        System.out.println("Ganas" + Meritocracia + "pts");
    }
    
    public void Rangos(Jugador jug){
        
        if((jug.getRango() == "Novato")&& (jug.Meritocracia == 100)){
            jug.setRango("Soldado");
            SubeRango = true;}
        if((jug.getRango() == "Soldado")&& (jug.Meritocracia == 500)&& (jug.ExpBatalla == 5)){
            jug.setRango("Capitan");
             SubeRango = true;}
        if((jug.getRango() == "Capitan")&& (jug.Meritocracia == 1500)&& (jug.ExpBatalla == 15)){
            jug.setRango("Comandante");
             SubeRango = true;}
        if((jug.getRango() == "comandante")&& (jug.Meritocracia == 2500)&& (jug.ExpBatalla == 35)){
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

