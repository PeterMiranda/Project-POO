package PEntradas;

import PMain.Tv;

/**
 * Class Entrada
 */
public abstract class Entrada implements InterfaceEntrada {

  protected Tv tv;
  
  //
  // Fields
  //

  //
  // Constructors
  //
  //Herrera improvement public Entrada () { };
  //Erik Isaias Ortiz Duarte
  public Entrada() {
    }

    ;
    //Erik Isaias Ortiz Duarte
    public Entrada(Tv tv) {
        this.tv = tv;
    }

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
    public abstract void execute();

}
