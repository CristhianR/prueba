
package pandoraunderattack;
/**
 * Se declara la clase Recursos.
 * @author cristhian
 * @version 17/09/15
 */
public class Recursos {
    //Se declaran los atributos de la clase.
    String NombreRecurso;
    int Meritocracia;
    boolean SubeRango;
    int ID;
    int x;
    int y;
    
    /**
     * Se crea el constructor de la clase.
     * @param jug 
     * El parámetro que recibe es el jugador, pues de el proviene la información para los métodos.
     */
    public Recursos(Jugador jug){
        // Se instancia la clase de la lista doblemente enlazada.
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

    /**
     * Se crea el método recursos.
     * Este método otorga los puntos de meritocracia según el recurso obtenido.
     * @param jug, pues es al jugador al que se le está otorgando la meritocracia.
     */
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
        // Este método solo imprime el resultado del método anterior.
        System.out.println("Recogiste" + NombreRecurso);
        System.out.println("Ganas" + Meritocracia + "pts");
    }
    
    /**
     * Se crea el método rango.
     * Este método compara la cantidad de meritocracia del jugador para saber si es posible ascenderlo de rango.
     * @param jug, pues son los puntos del jugador lo que serán comparados para el ascenso de rango. 
     */
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
        if((jug.getRango() == "Comandante")&& (jug.Meritocracia == 2500)&& (jug.ExpBatalla == 35)){
            jug.setRango("Caballero");
             SubeRango = true;}
        else {
             SubeRango = false;
        }
       
    }
    
    public void SubirRango(Jugador jug){
        // Este método solo imprime le resultado del método anterior.
        if(SubeRango == true){
            System.out.println("Subes de Rango a: "+ jug.getRango());
        }
    }
    
    
}

