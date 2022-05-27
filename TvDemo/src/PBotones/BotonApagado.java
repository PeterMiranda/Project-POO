package PBotones;

import PMain.Tv;



/**
 * Luis Gerardo Garcia Obispo (Documentador)
 * Implementación de la clase BotonApagado que es una 
 * extención del botón.
 * Class BotonApagado
 */
// Daniel Suárez Nava (Coder)
// Juan Manuel Melchor Gaspar (Coder)
public class BotonApagado extends Boton {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement 
    public BotonApagado (Tv tv) { 
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
   * Implementación del patrón comando
   * desacoplamiento del método execute hacia el método apagarTv
   */
   // Daniel Suárez Nava (Coder)
   // Juan Manuel Melchor Gaspar (Coder)

    @Override
    public void execute() {
        apagarTv();
    }
  
    /**
     * Luis Gerardo Garcia Obispo (Documentador)
     * Implementación de apagarTv
     * Llamando apagar de la referencia Tv a la que pertenece BotonApagado
     * BotonApagado mantienen una referencia local a Tv
     */
     // Daniel Suárez Nava (Coder)
     // Juan Manuel Melchor Gaspar (Coder)
    private void apagarTv() {
        this.tv.apagar();
    }
  
}
