package pandoraunderattack;

/**
 * Se declara la clase Escudos.
 * @author cristhian
 * @version 17/09/15
 */

public class Escudos {
    // Se declara los atributos de la clase.
    
    int TiposRecursos;
    int CantidadRecursos;
    int Durabilidad;
    int CantidadJugadores;
    String NombreEscudo;
    boolean Comprobar;
    
    
    
    /**
     * Se crea el método comprobar.
     * Este método comprueba si un jugador tiene los recuros necesarios para crear un escudo.
     * @param jug , pues comprueba los recursos propios de cada jugador.
     */
    public void Comprobar( Jugador jug){
    
        if((NombreEscudo == "Armadura")&& (jug.CantidadOro == 20)&& (jug.CantidadHierro == 100)&& (jug.CantidadAcero == 20)){
            jug.setEscudos("Armadura");
            Comprobar = true;}
        if((NombreEscudo == "Escudo")&& (jug.CantidadOro == 5)&& (jug.CantidadHierro == 20)&& (jug.CantidadMadera == 100)){
            jug.setEscudos("Escudo");
            Comprobar = true;}
        if((NombreEscudo == "MagiaAbsorbente")&& (jug.PiedraMagica == 2)&& (jug.getEscudos() == "Armadura")&& (jug.getEscudos() == "Escudo")){
            jug.setEscudos("MagiaAbsorbente");
            Comprobar = true;}
         else {
            Comprobar = false;
        }
    }
    
    public void CrearEscudo(int TiposRecursos,int CantidadRecursos,int CantidadJugadores,String NombreArma){
        // este método solo imprime el resultado del método anterior.
        if(Comprobar = true){
            
            System.out.println("Escudo creado: " + NombreEscudo);
        }
        
      }
    
    
    public void CrearEscudoEspecial(int TiposRecursos,int CantidadRecursos,int CantidadJugadores,String NombreArma){
        // este método solo imprime el resultado del método anterior.
        if(Comprobar = true){
            
            System.out.println("Escudo creado: " + NombreEscudo);
        }
        
      }
}
