package PEntradas;

import PMain.Tv;

/**
 * Class EntradaUSB
 */
public class EntradaUSB extends Entrada {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement public EntradaUSB () { }; 
  //Luis Antonio Moreno Pacheco 
  public EntradaUSB (Tv tv) {
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
  //Luis Antonio Moreno Pacheco
  @Override
  public void execute() {
    setEntradaa();
  } 
  //Luis Antonio Moreno Pacheco
  private void setEntradaa() {
    this.tv.usb();
  }
}
