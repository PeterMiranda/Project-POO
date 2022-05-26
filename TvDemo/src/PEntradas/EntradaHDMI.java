package PEntradas;

import PMain.Tv;

/**
 * Luis Gerardo Garcia Obispo (Documentador)
 * Class EntradaHDMI
 * Implementación de la clase EntradaHDMI del paquete entradas
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
  /**
  * Luis Gerardo Garcia Obispo (Documentador)
  * Implementación del método entradas con extención a la superclase TVDEMO
  * Manda a llamar el método setEntrada en la clase TVDEMO
  */
  //Erik Isaias Ortiz Duarte (Coder)
   @Override
   public void execute() {
        setEntradab();
    }
  /**
  * Luis Gerardo Garcia Obispo
  * Implementación del método setEntrada
  * Llamando hdmi de la referencia Tv al que pertenece EntradaHDMI
  */
   //Erik Isaias Ortiz Duarte (Coder)
   private void setEntradab() {
        this.tv.hdmi();
        
    }

}
