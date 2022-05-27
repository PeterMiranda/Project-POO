package PEntradas;

import PMain.Tv;

/**
 * Luis Gerardo Garcia Obispo (Documentador)
 * Implementación de la clase EntradaUSB que es una extención de Entrada
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
  /**
  * Luis Gerardo Garcia Obispo (Documentador)
  * Implementación del constructor EntradaUSB 
  * usando super llama al constructor de la clase Tv
  */
  //Luis Antonio Moreno Pacheco (Coder)
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
  /**
  * Luis Gerardo Garcia Obispo (Documentador)
  * Implementación de método execute, en donde ejecutara el método setEntrada
  */
  //Luis Antonio Moreno Pacheco (Coder)
  @Override
  public void execute() {
    setEntradaa();
  }
  /**
  * Luis Gerardo Garcia Obispo (Documentador)
  * Implementación del método setEntradaa en donde
  * hará una extensión de la clase tv y buscara el método USB
  * para posteriormente ejecutarlo
  */
  //Luis Antonio Moreno Pacheco (Coder)
  private void setEntradaa() {
    this.tv.usb();
  }
}
