package kauhanen;

import fi.jyu.mit.graphics.EasyWindow;

/**
 * Ohjelma piirt‰‰ viisi porrasta alkaen origosta p‰‰ttyen
 * pisteesen (5,5)
 * @author // Lari-Mikko Kauhanen
 * @version // 01-00
 */
public class Portaat {

    /**
     * Aliohjelma piirt‰‰ ikkunaan yhden nousevan portaan
     * alkaen pisteest‰ (x,y) ja p‰‰ttyen pisteeseen (x+1,y+1)
     * <pre>
     *    |-------(x+1,y+1)
     *    |
     *    |
     *    |
     *   (x,y) 
     * </pre>
     * @param window
     * @param x portaan alkupisteen x
     * @param y portaan alkupisteen y
     */
    public static void porrasYlos(EasyWindow window,double x,double y) {
        // T‰ydenn‰ t‰h‰n
    	window.addLine(x, y, x, y+1);
    	window.addLine(x, y+1, x+1, y+1);
    }
    
    public static void porrasAlas(EasyWindow window,double x,double y){
    	window.addLine(x, y, x+1, y);
    	window.addLine(x+1, y, x+1, y-1);
    }
    
    public static void piirraPorras(EasyWindow window,double x,double y,int lkm,String suunta){
    	for (int i = 0; i < lkm; i++){
    		//window.addLine(x, y, x, y+1);
    		//window.addLine(x, y+1, x+1, y+1);
    		if (suunta == "ylos"){
    			porrasYlos(window,x,y);
        		x++;
        		y++;
    		}
    		else{
    			porrasAlas(window,x,y);
    			x++;
            	y--;
    		}
    	}
    }
    	
    public static void piirraPortaat(EasyWindow window,double x,double y,int lkm){
        //for (int i = 0; i < lkm; i++){
        	//window.addLine(x, y, x, y+1);
        	//window.addLine(x, y+1, x+1, y+1);
        	//porrasYlos(window,x,y);
        	//x++;
        	//y++;
        //}
        	
        //for (int i = 0; i < lkm; i++){
        	//window.addLine(x, y, x+1, y);
        	//window.addLine(x+1, y, x+1, y-1);
        	//x++;
        	//y--;
    	
    	piirraPorras(window,x,y,lkm,"ylos");
    	x += lkm - 1;
    	y += lkm;
    	piirraPorras(window,x,y,lkm,"alas");
    }
    /**
     * @param args ei k‰ytˆss‰
     */
    public static void main(String[] args) {
        EasyWindow window = new EasyWindow();
        window.scale(0,0,20,20);
        //Kaksi porrasta ylˆs
        porrasYlos(window,0,0);
        porrasYlos(window,1,1);
        
        //Sitten alas
        porrasAlas(window,2,2);
        porrasAlas(window,3,1);
        
        //Ja lopulta metodi, joka piirt‰‰ halutun m‰‰r‰n portaita alkaen tietyst‰ koordinaatista
        piirraPorras(window,3,3,7,"ylos");
        // eli piirraPortaat(ikkuna johon piirret‰‰n, x-koord, y-koord, montako porrasta
        
        piirraPortaat(window,1,10,7);
        
        window.showWindow();
    }
}
