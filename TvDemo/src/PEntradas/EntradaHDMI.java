package PEntradas;

import PMain.Tv;

/**
 * Class EntradaHDMI
 */
public class EntradaHDMI extends Entrada {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement public EntradaHDMI () { };
    public EntradaHDMI (Tv tv) { 
        super(tv);
    };
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //
  //Erik Isaias Ortiz Duarte
   @Override
   public void execute() {
        setEntradab();
    }
   //Erik Isaias Ortiz Duarte
   private void setEntradab() {
        this.tv.hdmi();
        
    }

}
