
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
        
        if((NombreArma == "Espada")&& (jug.CantidadPlata == 25)&& (jug.CantidadHierro == 30)){
            jug.SetArmas("Espada");
            comprobar = true;}
        if((NombreArma == "Daga")&& (jug.CantidadPlata == 10)&& (jug.CantidadHierro == 15)){
            jug.SetArmas("Daga");
            comprobar = true;}
        if((NombreArma == "Maza")&& (jug.CantidadPlata == 10)&& (jug.CantidadMadera == 5)&& (jug.CantidadPiedra == 5)){
            jug.SetArmas("Maza");
            comprobar = true;}
        if((NombreArma == "Arco")&& (jug.CantidadPlata == 15)&& (jug.CantidadHierro == 15)&& (jug.CantidadMadera == 15)){
            jug.SetArmas("Arco");
            comprobar = true;}
        if((NombreArma == "Varita")&& (jug.CantidadCobre == 50)&& (jug.CantidadMadera == 2)){
            jug.SetArmas("Varita");
            comprobar = true;}
        if((NombreArma == "Armadura")&& (jug.CantidadOro == 20)&& (jug.CantidadHierro == 100)&& (jug.CantidadAcero == 20)){
            jug.SetArmas("Armadura");
            comprobar = true;}
        if((NombreArma == "Escudo")&& (jug.CantidadOro == 5)&& (jug.CantidadHierro == 20)&& (jug.CantidadMadera == 100)){
            jug.SetArmas("Escudo");
            comprobar = true;}
        if((NombreArma == "Claymore")&& (jug.CantidadOro == 200)&& (jug.CantidadAcero == 100)&& (jug.GetArmas() == "Espada")){
            jug.SetArmas("Claymore");
            comprobar = true;}
        if((NombreArma == "Martillo")&& (jug.CantidadOro == 150)&& (jug.CantidadHierro == 50)&& (jug.CantidadAcero == 50)&& (jug.GetArmas() == "Maza")){
            jug.SetArmas("Martillo");
            comprobar = true;}
        if((NombreArma == "Rifle")&& (jug.CantidadOro == 175)&& (jug.CantidadHierro == 100)&& (jug.GetArmas() == "Arco")){
            jug.SetArmas("Rifle");
            comprobar = true;}
        if((NombreArma == "Baston")&& (jug.CantidadOro == 250)&& (jug.PiedraMagica == 1)&& (jug.GetArmas() == "Varita")){
            jug.SetArmas("Baston");
            comprobar = true;}
        if((NombreArma == "MagiaAbsorbente")&& (jug.PiedraMagica == 2)&& (jug.GetArmas() == "Armadura")&& (jug.GetArmas() == "Escudo")){
            jug.SetArmas("MagiaAbsorbente");
            comprobar = true;}
         else {
            comprobar = false;
        }
    }
    
    public void CrearArmar(int TiposRecursos,int CantidadRecursos,int CantidadJugadores,String NombreArma){
        
        if(comprobar = true){
            
            System.out.println("Arma creada: " + NombreArma);
        }
        
      }
    
    
    public void CrearArmarEspecial(int TiposRecursos,int CantidadRecursos,int CantidadJugadores,String NombreArma){
        
        if(comprobar = true){
            
            System.out.println("Arma creada: " + NombreArma);
        }
        
      }
    
}
