package paquete;

public class Jugador {

    String Nombre;
    int Meritocracia;
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
    boolean PandoraUnderAttack;

    public void Jugador() {
        
        Rango = "Novato";
        Meritocracia = 0;
        CantidadMadera = 0;
        CantidadOro = 0;
        CantidadHierro = 0;
        CantidadPiedra = 0;
        CantidadPlata = 0;
        CantidadAcero = 0;
        CantidadCobre = 0;
        PiedraMagica = 0;
        ExpBatalla = 0;
        PandoraUnderAttack = false;
        

    }
    
    public String getNombre() {
        return this.Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    public String getArmas() {
        return this.TipoArma;	
    }

    public void setArmas(String TipoArma) {
        this.TipoArma = TipoArma;
    }
    
     
    public String getRango(){
        return this.Rango;
    }
    
    public void setRango(String Rango){
        this.Rango = Rango;
    }
    
    
    public String getRecursos(){
    	return this.Recursos;
    }
    
    public void setRecursos(String Recursos){
    	this.Recursos = Recursos;
    }
    
    
    public int getMeritocracia(){
    	return this.Meritocracia;
    }
    
    public void setMeritocracia(int Meritocracia) {
		this.Meritocracia = Meritocracia;
    }
    

	public int getCantidadMadera() {
		return this.CantidadMadera;
	}

	public void setCantidadMadera(int cantidadMadera) {
		this.CantidadMadera = cantidadMadera;
	}
	

	public int getCantidadOro() {
		return this.CantidadOro;
	}

	public void setCantidadOro(int cantidadOro) {
		this.CantidadOro = cantidadOro;
	}
	

	public int getCantidadHierro() {
		return this.CantidadHierro;
	}

	public void setCantidadHierro(int cantidadHierro) {
		this.CantidadHierro = cantidadHierro;
	}

	
	public int getCantidadPiedra() {
		return this.CantidadPiedra;
	}

	public void setCantidadPiedra(int cantidadPiedra) {
		this.CantidadPiedra = cantidadPiedra;
	}

	
	public int getCantidadPlata() {
		return this.CantidadPlata;
	}

	public void setCantidadPlata(int cantidadPlata) {
		this.CantidadPlata = cantidadPlata;
	}
	

	public int getCantidadAcero() {
		return this.CantidadAcero;
	}

	public void setCantidadAcero(int cantidadAcero) {
		this.CantidadAcero = cantidadAcero;
	}

	
	public int getCantidadCobre() {
		return this.CantidadCobre;
	}

	public void setCantidadCobre(int cantidadCobre) {
		this.CantidadCobre = cantidadCobre;
	}

	
	public int getPiedraMagica() {
		return this.PiedraMagica;
	}

	public void setPiedraMagica(int piedraMagica) {
		this.PiedraMagica = piedraMagica;
	}
	

	public int getExpBatalla() {
		return this.ExpBatalla;
	}

	public void setExpBatalla(int ExpBatalla) {
		this.ExpBatalla = ExpBatalla;
	}

	
		
	
}
