package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       try{
       int test=args.length;
	       for(int i=0;i<test;i++){
	            int a = Integer. parseInt(args[i]);
	     float celsius = fahrenheitEnCelsius(a);
	    

      System.out.println( a + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
    }
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
         float c =  (f -32) ;
                 float s=10;
                 c=c*5;
                 c=c/9;
               c=c*10;
               c=(int)c;
               c=c/s;
		return c; 
     }

}
