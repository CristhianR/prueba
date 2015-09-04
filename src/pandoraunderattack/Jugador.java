package pandoraunderattack;

public class Jugador {

    String nombre;
    int maeritocracia;
    int CantidadMadera;
    int CantidadOro;
    String TipoArma;
    String Rango;

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
    
    public void setRango(){
        this.Rango = Rango;
    }
}
