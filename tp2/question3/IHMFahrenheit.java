package question3;

import question1.*;
import question2.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degr� Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * m�thode d�clench�e lorsque le bouton de conversion est appuy�. 
   * remarquer que le champs de droite (les degr�s Celsius) n'est pas �ditable.
   * @param ae l'�v�nement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
      String fahrenheit = entree.getText();
      int f = Integer.parseInt(fahrenheit);
	     float celsius = fahrenheitEnCelsius(f);
   
sortie.setText( Float.toString( celsius));
     
    }catch(NumberFormatException nfe){
      sortie.setText("error ! ");
    }
  }
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
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
}
