package kauhanen;

//import java2.HelloWorld;

/**
 * 
 * @author Lari-Mikko Kauhanen
 *
 */
public class HelloWorld {

	
	/**
	 * @param nimi nimi, jota huudetaan
	 */
	public void yellToWorld (String nimi){
		System.out.println("Hello there " + nimi);
	}
	/**
	 * Metodi muuttaa parametrina sy�tetyn nimen isoiksi kirjaimiksi
	 * 
	 * @param nimi annettava nimi
	 * @return nimi isolla kirjoitettuna
	 */
	public String muutaIsoksi(String mjono){
		return mjono.toUpperCase();
	}
	
	/**
	 * P��ohjelma, jossa k�ynnistet��n ohjelma
	 * @param args ei k�yt�ss�
	 */
	
	public static void main(String[] args) {

		//Luodaan HelloWorld olio
		HelloWorld olio = new HelloWorld();
		
		
		//Kutsutaan olion yellToWorld metodia
		olio.yellToWorld("Arska");
		
		//Muutetaan nimi isoiksi kirjaimiksi
		String isoNimi = olio.muutaIsoksi("Arska");
		olio.yellToWorld(isoNimi);
	}

}

