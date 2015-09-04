
package pandoraunderattack;


public class Clan {
    
    String NombreClan;
    int CantidadJugadores;
    int RecursosTotales;
    String Lider;
    

    
    public static void main(String[] args) {
        
        Jugador jugador1,jugador2,jugador3;
        jugador1= new Jugador();
        Armas armas = new Armas(jugador1);
      
        
        
        listaDoble ld = new listaDoble();
        
        ld.insertarInicio("a");
        ld.insertarFin("b");
        ld.insertarFin("c");
        
        ld.MostrarAdelante();
    }
    
}
