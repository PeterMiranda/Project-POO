package PEntradas;

import PMain.Tv;

import javax.swing.*;

/**
 * Class Entrada
 * Luis Gerardo Garcia Obispo (Documentador)
 * Implementación de la clase Entrada
 */
public abstract class Entrada extends JButton {

    protected Tv tv;
    protected String nombre;
  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement public Entrada () { };
  /**
  * Luis Gerardo Garcia Obispo (Documentador)
  * Implementación del Constructor Entrada correspondiente a la clase Entrada
  */
  //Erik Isaias Ortiz Duarte (Coder)
  public Entrada() {
    }

    ;
  /**
  * Luis Gerardo Garcia Obispo (Documentador)
  * Implementación de Entrada 
  * Llamando a tv que es igual a tv del main principal y obtenga valores
  */
  //Erik Isaias Ortiz Duarte (Coder)
    public Entrada(Tv tv) {
        this.tv = tv;
    }

    public Entrada(Tv tv, String nombre) {
        this.tv = tv;
        this.nombre = nombre;
        this.setText(nombre);
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
   /**
   * Luis Gerardo Garcia Obispo (Documentador)
   * Implementación de un método execute
   * Dependiendo de que elija (USB O HDMI) se ejecutara el método execute 
   */
   //Erik Isaias Ortiz Duarte (Coder)
    public abstract void execute();

}
