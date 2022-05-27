package PBotones;

import PMain.Tv;



/**
 * Luis Gerardo Garcia Obispo (Documentador)
 * Implementación de la clase BotonSubirVolumen que es
 * una extención de la clase Boton
 * Class BotonSubirVolumen
 */
// Juan Manuel Melchor Gaspar (Coder)
public class BotonSubirVolumen extends Boton {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement 
    public BotonSubirVolumen () {
        super();
    };
    public BotonSubirVolumen (Tv tv) {
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

    @Override
    public void execute() {
        subirVolumen();
    }
  /**
   * Luis Gerardo Garcia Obispo (Documentador)
   * Implementación del método subirVolumen en donde se hace una
   * comparación de los parámetros de la clase Tv y la clase boton para 
   * determinar si el volúmen es mayor al permitido dentro de un rango de 10 a 0
   * y si no mostrar un mensaje en donde diga "Es lo máximo que se puede subir". 
   */
  // Juan Manuel Melchor Gaspar (Coder) 
    private void subirVolumen() {
        if (this.tv.getVolumen() >= MAX_VOLUME) {
            System.out.println("Es lo maximo que se puede subir ");
        } else {
            this.tv.subirVolumen();
            System.out.println("Subir volumen = " + this.tv.getVolumen());
            //this.tv.bajarVolumen(total); 

        }

    }

}
