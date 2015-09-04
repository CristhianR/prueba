
package pandoraunderattack;


public class Armas {
    
    
    int TiposRecursos;
    int CantidadRecursos;
    int durabilidad;
    int CantidadJugadores;
    String NombreArma;
    boolean comprobar;
    
    public Armas(Jugador jug){
        
        //if((jug.GetArmas() == "EspadaN1")&& (jug.CantidadOro == 10)&& (jug.CantidadMadera == 10)){
          //  jug.SetArmas("Espada2");
            //comprobar = true;
        //} else {
          //  comprobar = false;
        //}        
        
        }
    
    
    public void Comprobar( Jugador jug){
        
        if((jug.GetArmas() == "EspadaN1")&& (jug.CantidadOro == 10)&& (jug.CantidadMadera == 10)){
            jug.SetArmas("Espada2");
            comprobar = true;
        } else {
            comprobar = false;
        }
    }
    
    public void CrearArmar(int TiposRecursos,int CantidadRecursos,int CantidadJugadores){
        
        if(comprobar = true){
            
            System.out.println("Arma creada: " + NombreArma);
        }
        
        
        
        
        
        
    }
    
}
