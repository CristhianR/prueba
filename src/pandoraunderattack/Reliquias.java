
package pandoraunderattack;

public class Reliquias {
    
    String NombreReliquia;
    int reliquias;
    int peso;
    int x;
    int y;

    
    
    public void AddReliquias(){
        
        DLList reliquias = new DLList();
        reliquias.insertarInicio(NombreReliquia);   
    }



	public String getNombreReliquia() {
		return this.NombreReliquia;
	}



	public void setNombreReliquia(String nombreReliquia) {
		this.NombreReliquia = nombreReliquia;
	}



	public int getReliquias() {
		return this.reliquias;
	}



	public void setReliquias(int reliquias) {
		this.reliquias = reliquias;
	}



	public int getPeso() {
		return this.peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}



	public int getX() {
		return this.x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return this.y;
	}



	public void setY(int y) {
		this.y = y;
	}
    
}
