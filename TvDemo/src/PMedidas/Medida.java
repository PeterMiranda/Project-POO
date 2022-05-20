package PMedidas;



/**
 * Class Medida
 */
abstract public class Medida {
 //David Abner Bautista Ayala
 
private double tipo_medida;
  //
  // Fields
  //

  
  //
  // Constructors
  public Medida () { };
  //Herrera improvement
   
  
  //
  // Methods
  boolean comapre (Medida m){
    return this.getClass().equals(m.getClass());
   }
   

  //
  // Accessor methods
  //

  //
  // Other methods
  //

}
