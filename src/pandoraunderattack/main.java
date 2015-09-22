package json;

//importacion de la libreria gson.
import com.google.gson.Gson;

/**
 * Se declara la clase Main.
 * @author roberto
 * @version 18/09/15
 */

public class main {
	/**
	 * Convierte objetos de Java a un arreglo de json
	 * @param args
	 * @throws java.io.IOException
	 */
	public static void main(String args[]) throws java.io.IOException {
		//Se crea una nueva instancia gson
	    Gson gson = new Gson();
	    
	    /**se crean instancias de las clases y tener la opcion de cambiar los atributos 
	     * de cada una y por consiguiente los agrega a un arreglo.
	     */
        Jugador jog = new Jugador() ;
        String jsonString2 = gson.toJson(jog);
        System.out.println("JSON: " + jsonString2);
        
        Clan cl = new Clan() ;
        String jsonString3 = gson.toJson(cl);
        System.out.println("JSON: " + jsonString3);
        
        Reliquias reli = new Reliquias() ;
        reli.setX(5);
        String jsonString4 = gson.toJson(reli);
        System.out.println("JSON: " + jsonString4);
        
        
	}

}
