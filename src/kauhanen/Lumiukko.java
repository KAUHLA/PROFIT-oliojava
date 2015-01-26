package kauhanen;

//import java2.Lumiukko;

import fi.jyu.mit.graphics.EasyWindow;

/**
 * Harjoitellaan piirtely‰ ja kuormittamista
 * @author Lari-Mikko Kauhanen
 *
 */
public class Lumiukko {
	
	/**
	 * Piirt‰‰ lumiukon annettuun paikkaan
	 * 
	 * @param w
	 * @param x
	 * @param y
	 * @param isonPallonSade
	 * @param keskipallonSade
	 * @param pikkupallonSade
	 */
	public void piirraLumiukko(EasyWindow w,double x, double y,double isonPallonSade, double keskipallonSade, double pikkupallonSade) {

	        double keskiPallonY = y + isonPallonSade + keskipallonSade; //ratkaise t‰h‰n keskiPallonY
	        double pikkuPallonY = y + isonPallonSade + 2 * keskipallonSade + pikkupallonSade;//ratkaise t‰h‰n pikkuPallonY
	        
	        w.addCircle(x,y,isonPallonSade); //piirt‰‰ ison pallon
	        w.addCircle(x,keskiPallonY,keskipallonSade); //piirt‰‰ keskipallon
	        w.addCircle(x,pikkuPallonY,pikkupallonSade); //piirt‰‰ pikkupallon
	        
	}
	
	public static void lumiukko(EasyWindow w,double x, double y){

		//double keskiPallonY = y + 35 + 25; //ratkaise t‰h‰n keskiPallonY
        //double pikkuPallonY = y + 35 + 2 * 25 + 10;
        
        //w.addCircle(x,y,35); //piirt‰‰ ison pallon
        //w.addCircle(x,keskiPallonY,25); //piirt‰‰ keskipallon
        //w.addCircle(x,pikkuPallonY,10); //piirt‰‰ pikkupallon
		
		Lumiukko olio1 = new Lumiukko();	
		olio1.piirraLumiukko(w, x, y, 35, 25, 10);
	}
	
	public static void lumiukko(EasyWindow w,double x, double y,double isonPallonSade){

		Lumiukko olio2 = new Lumiukko();	
		olio2.piirraLumiukko(w, x, y, isonPallonSade, 25, 10);
	}
	
	public static void lumiukko(EasyWindow w,double x, double y,double isonPallonSade, double keskiPallonSade){
		
		
		Lumiukko olio3 = new Lumiukko();	
		olio3.piirraLumiukko(w, x, y, isonPallonSade, keskiPallonSade, 10);
	}
	
	public static void lumiukko(EasyWindow w,double x, double y,double isonPallonSade, double keskiPallonSade, double pikkuPallonSade){
		
		Lumiukko olio4 = new Lumiukko();	
		olio4.piirraLumiukko(w, x, y, isonPallonSade, keskiPallonSade, pikkuPallonSade);
	}
	
    public static void main(String[] args) {
    	//Luodaan uusi ikkuna
        EasyWindow window = new EasyWindow();
        
        window.scale(0, 0, 1000, 1000);
        
        //Luodaan lumiukko-olio
        Lumiukko lumiukko = new Lumiukko ();
        
        // Piirret‰‰n lumiukko (ikkuna, johon piirret‰‰n,x,y,alimman pallon s‰de, keskipallon s‰de, ylimm‰n pallon s‰de)
        lumiukko.piirraLumiukko(window,100,100,35,25,10);
        
        /**
         *Pist‰ alla olevat toimimaan
         * 
    	 *lumiukko(window, x, y); // piirt‰‰ standardikokoisen lumiukon
    	 *lumiukko(window, x, y, isonPallonSade);
    	 *lumiukko(window, x, y, isonPallonSade, keskiPallonSade); 
    	 *lumiukko(window, x, y, isonPallonSade, keskiPallonSade, pienenPallonSade);
         **/
        lumiukko(window, 200, 200);
        lumiukko(window, 300, 300, 35);
        lumiukko(window, 400, 400, 35, 25);
        lumiukko(window, 500, 500, 35, 25, 10);

        // N‰ytet‰‰n ikkuna
        window.showWindow();
    }

}
