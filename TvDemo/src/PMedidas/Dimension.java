package PMedidas;


import PMedidas.Medida;



/**
 * Class Dimension
 * Almacena la medida en diagonal. Pero al ser objeto se tiene largo, ancho,
 * unidades de medida
 */
public class Dimension {

  //
  // Fields
  //

  /**
   * la medida en diagonal
   */
  private double diagonal;
  private double largo;
  private double ancho;
  private Medida medida;
  
  //
  // Constructors
  //
  /**
     * Implementacion del constructor por
     * defecto(vacio) para la clase Dimension
     */
  public Dimension () { };
  
  /**
   * Implementacion del constructor con parametros
   */
    public Dimension(double diagonal, double largo, double ancho, Medida medida) {
        this.diagonal = diagonal;
        this.largo = largo;
        this.ancho = ancho;
        this.medida = medida;
    }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Fija el valor de diagonal
   * la medida en diagonal
   * @param newVar el nuevo valor de diagonal
   */
  public void setDiagonal ( double newVar ) {
    diagonal = newVar;
  }

  /**
   * Devuelve el valor de diagonal
   * la medida en diagonal
   * @return el valor de diagonal
   */
  public double getDiagonal ( ) {
    return diagonal;
  }

  /**
   * Fija el valor de largo
   * @param newVar el nuevo valor de largo
   */
  public void setLargo ( double newVar ) {
    largo = newVar;
  }

  /**
   * Devuelve el valor de largo
   * @return el valor de largo
   */
  public double getLargo ( ) {
    return largo;
  }

  /**
   * Fija el valor de ancho
   * @param newVar el nuevo valor de ancho
   */
  public void setAncho ( double newVar ) {
    ancho = newVar;
  }

  /**
   * Devuelve el valor de ancho
   * @return el valor de ancho
   */
  public double getAncho ( ) {
    return ancho;
  }

  /**
   * Fija el valor de medida
   * @param newVar el nuevo valor de medida
   */
  public void setMedida ( Medida newVar ) {
    medida = newVar;
  }

  /**
   * Devuelve el valor de medida
   * @return el valor de medida
   */
  public Medida getMedida ( ) {
    return medida;
  }

  //
  // Other methods
  //
  
  /**
   * Implementacion del metodo para cambiar la medida
   *
   */
  public void cambiarMedida(){
      if (this.medida instanceof MedidaInternacional) {
          //realizamos la conversion de unidades
          //cambiamos a CGS
          this.diagonal = this.diagonal / 2.45;
          this.ancho = this.ancho / 2.45;
          this.largo = this.largo / 2.45;
      } else if (this.medida instanceof MedidaCGS) {
          //realizamos la conversion de unidades
          //cambiamos a Internacional
          this.diagonal = this.diagonal * 2.45;
          this.ancho = this.ancho * 2.45;
          this.largo = this.largo * 2.45;
      }
  }

}
