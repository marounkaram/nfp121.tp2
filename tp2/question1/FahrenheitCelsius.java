package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
import java.util.Scanner;
public class FahrenheitCelsius {

	/**
	 * le point d'entr�e de cette application, dont le commentaire est �
	 * compl�ter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
	   
	
	    
	       int test=args.length;
	       for(int i=0;i<test;i++){
	            int a = Integer. parseInt(args[i]);
	     float celsius = fahrenheitEnCelsius(a);
	    

      System.out.println( a + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
    
	   
    }															// format
																				// impos�s
																				
	}

	/**
	 * la m�thode � compl�ter.
	 * 
	 * @param f
	 *            la valeur en degr� Fahrenheit
	 * @return la conversion en degr� Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
                 float c =  (f -32) ;
                 float s=10;
                 c=c*5;
                 c=c/9;
               c=c*10;
               c=(int)c;
               c=c/s;
		return c; // � compl�ter en rempla�ant ce return 0.F par la fonction
					// de conversion
	}

}
