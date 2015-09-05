package pandoraunderattack;

public class Jugador {

    String nombre;
    int meritocracia;
    int CantidadMadera;
    int CantidadOro;
    int CantidadHierro;
    int CantidadPiedra;
    int CantidadPlata;
    int CantidadAcero;
    int CantidadCobre;
    int PiedraMagica;
    String TipoArma;
    String Rango;
    String Recursos;
    int ExpBatalla;

    public void Jugador() {
        
        Rango = "Novato";

    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void SetArmas(String TipoArmas) {
        this.TipoArma = TipoArmas;

    }

    public String GetArmas() {
        return TipoArma;
    }
    
    public String getRango(){
        return Rango;
    }
    
    public void setRango(String Rango){
        this.Rango = Rango;
    }
}
