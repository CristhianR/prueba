
package pandoraunderattack;


/**
 * Se declara la clase Armas.
 * @author cristhian
 * @version 17/09/15
 */

public class Armas {
    // Se declara los atributos de la clase.
    
    int TiposRecursos;
    int CantidadRecursos;
    int Durabilidad;
    int CantidadJugadores;
    String NombreArma;
    boolean Comprobar;
    
    
    
    /**
     * Se crea el método comprobar.
     * Este método comprueba si un jugador tiene los recuros necesarios para crear un arma.
     * @param jug , pues comprueba los recursos propios de cada jugador.
     */
    public void Comprobar( Jugador jug){
        
        if((NombreArma == "Espada")&& (jug.CantidadPlata == 25)&& (jug.CantidadHierro == 30)){
            jug.setArmas("Espada");
            Comprobar = true;}
        if((NombreArma == "Daga")&& (jug.CantidadPlata == 10)&& (jug.CantidadHierro == 15)){
            jug.setArmas("Daga");
            Comprobar = true;}
        if((NombreArma == "Maza")&& (jug.CantidadPlata == 10)&& (jug.CantidadMadera == 5)&& (jug.CantidadPiedra == 5)){
            jug.setArmas("Maza");
            Comprobar = true;}
        if((NombreArma == "Arco")&& (jug.CantidadPlata == 15)&& (jug.CantidadHierro == 15)&& (jug.CantidadMadera == 15)){
            jug.setArmas("Arco");
            Comprobar = true;}
        if((NombreArma == "Varita")&& (jug.CantidadCobre == 50)&& (jug.CantidadMadera == 2)){
            jug.setArmas("Varita");
            Comprobar = true;}
        if((NombreArma == "Armadura")&& (jug.CantidadOro == 20)&& (jug.CantidadHierro == 100)&& (jug.CantidadAcero == 20)){
            jug.setArmas("Armadura");
            Comprobar = true;}
        if((NombreArma == "Escudo")&& (jug.CantidadOro == 5)&& (jug.CantidadHierro == 20)&& (jug.CantidadMadera == 100)){
            jug.setArmas("Escudo");
            Comprobar = true;}
        if((NombreArma == "Claymore")&& (jug.CantidadOro == 200)&& (jug.CantidadAcero == 100)&& (jug.getArmas() == "Espada")){
            jug.setArmas("Claymore");
            Comprobar = true;}
        if((NombreArma == "Martillo")&& (jug.CantidadOro == 150)&& (jug.CantidadHierro == 50)&& (jug.CantidadAcero == 50)&& (jug.getArmas() == "Maza")){
            jug.setArmas("Martillo");
            Comprobar = true;}
        if((NombreArma == "Rifle")&& (jug.CantidadOro == 175)&& (jug.CantidadHierro == 100)&& (jug.getArmas() == "Arco")){
            jug.setArmas("Rifle");
            Comprobar = true;}
        if((NombreArma == "Baston")&& (jug.CantidadOro == 250)&& (jug.PiedraMagica == 1)&& (jug.getArmas() == "Varita")){
            jug.setArmas("Baston");
            Comprobar = true;}
        if((NombreArma == "MagiaAbsorbente")&& (jug.PiedraMagica == 2)&& (jug.getArmas() == "Armadura")&& (jug.getArmas() == "Escudo")){
            jug.setArmas("MagiaAbsorbente");
            Comprobar = true;}
         else {
            Comprobar = false;
        }
    }
    
    public void CrearArmar(int TiposRecursos,int CantidadRecursos,int CantidadJugadores,String NombreArma){
        // este método solo imprime el resultado del método anteiror.
        if(Comprobar = true){
            
            System.out.println("Arma creada: " + NombreArma);
        }
        
      }
    
    
    public void CrearArmarEspecial(int TiposRecursos,int CantidadRecursos,int CantidadJugadores,String NombreArma){
        // este método solo imprime el resultado del método anteiror.
        if(Comprobar = true){
            
            System.out.println("Arma creada: " + NombreArma);
        }
        
      }
    
}
