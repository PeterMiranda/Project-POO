package PBotones;

import PMain.Tv;

/**
 * Luis Gerardo Garcia Obispo (Documentador)
 * Implementación de la clase BotonBajarVolumen que es una
 * extención de la clase Boton
 * Class BotonBajarVolumen
 */
// Daniel Suárez Nava (Coder)
public class BotonBajarVolumen extends Boton {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement 
    public BotonBajarVolumen () {
        super();
    };
    public BotonBajarVolumen (Tv tv) { 
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
        bajarVolumen();
    }
  /**
   * Luis Gerardo Garcia Obispo (Documentador)
   * Implementación del método bajarVolumen en donde se hace una comparación
   * de los parámteros de la clase Tv y la clase boton para determinar si el volúmen 
   * es menor al permitido dentro de un rango de 10 a 0. y si no mostrar un mensaje
   * en donde diga "es lo máximo que se puede bajar"
   */
  // Daniel Suárez Nava (Coder)
    private void bajarVolumen() {
               
      if (this.tv.getVolumen() > MIN_VOLUME) {
          this.tv.bajarVolumen();
          System.out.println("Bajar volumen = " + this.tv.getVolumen());
        }else{
             System.out.println("es lo maximo que se puede bajar");
             }
   }

}
