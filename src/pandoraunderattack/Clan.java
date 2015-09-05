
package pandoraunderattack;


public class Clan {
    
    String NombreClan;
    int CantidadJugadores;
    int RecursosTotales;
    String Lider;
    int Reliquias;
    int DiasDesdeCreacion;
    int x;
    int y;
    

    
    public static void main(String[] args) {
        
        Jugador jugador1,jugador2,jugador3;
        jugador1= new Jugador();
        Reliquias r = new Reliquias();
        //Armas armas = new Armas(jugador1);
        //Recursos recursos = new Recursos(jugador1);
        
        DLList reliquias = new DLList();
        DLList jugadores = new DLList();
        DLList armas = new DLList();
        DLList recursos = new DLList();
        
        Clan clan = new Clan();
        
        
        
        
        DLList ld = new DLList();
        
        ld.insertarInicio("a");
        ld.insertarFin("b");
        ld.insertarFin("c");
        
        ld.MostrarAdelante();
    }
    
    
    
}
