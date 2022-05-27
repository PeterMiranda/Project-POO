package PMain;

import PMedidas.Dimension;
import PSonido.Altavoz;
import PConexiones.ConexionWifi;
import PEntradas.Entrada;
import PApps.App;
import PResoluciones.Resolucion;
import PBotones.Boton;
import PBotones.BotonApagado;
import PBotones.BotonBajarVolumen;
import PBotones.BotonEncendido;
import PBotones.BotonSubirVolumen;
import java.util.ArrayList;
import java.util.List;


/**
 * Class Tv
 */
public class Tv {

  //
  // Fields
  //

  /**
   * La dimension estandar refiere a la medida en diagonal. Pero al ser objeto se busca tener largo, ancho, unidades de medida
   */
  private Dimension dimension;
  private List<Altavoz> altavoces;
  private int volumen;
  private Resolucion resolucion;
  private List<Boton> botones;
  /**
   * El estado de apagado/encendido como cadena
   */
  private String estado;
  private List<Entrada> entradas;
  private List<App> apps;
  private ConexionWifi wifi;
  private boolean estadoWifi;
  private String entradaA="USB DESCONECTADO";
  private String entradaB="HDMI DESCONECTADO";
  //
  // Constructors
  //
  //Herrera improvement 
  public Tv () { 
      
      botones = new ArrayList<Boton>();
      Boton ba = new BotonApagado(this);
      Boton be = new BotonEncendido(this);
      Boton bs = new BotonSubirVolumen(this);
      Boton bb = new BotonBajarVolumen(this);
      
      botones.add(ba);
      botones.add(be);
      botones.add(bs);
      botones.add(bb);
      
      be.execute();
      this.print();
      ba.execute();
      this.print();
      bs.execute();
      this.print();
      bb.execute();
      this.print();
      
      for(int i = 0; i < botones.size(); i++) {
          Boton bx = botones.get(i);
          bx.execute();
          this.print();
      }
      /**
      * Luis Gerardo Garcia Obispo (Documentador)
      * Implementación de los objetos eh y eu correspondientes
      * a la EntradaHDMI y EntradaUSB.
      * y depués se manda a llamar a los metodos de execute y print
      * para mostrar la conexion de HDMI y USB
      */
      //Luis Antonio Pacheco Moreno (Coder)
      //Erik Isaias Ortiz Duarte (Coder)
      Entrada eh = new EntradaHDMI(this);
      Entrada eu = new EntradaUSB(this);
      
      eh.execute();
      this.print();
      eu.execute();
      this.print();
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Fija el valor de dimension
   * La dimension estandar refiere a la medida en diagonal. Pero al ser objeto se
   * busca tener largo, ancho, unidades de medida
   * @param newVar el nuevo valor de dimension
   */
  public void setDimension ( Dimension newVar ) {
    dimension = newVar;
  }

  /**
   * Devuelve el valor de dimension
   * La dimension estandar refiere a la medida en diagonal. Pero al ser objeto se
   * busca tener largo, ancho, unidades de medida
   * @return el valor de dimension
   */
  public Dimension getDimension ( ) {
    return dimension;
  }

  /**
   * Fija el valor de altavoces
   * @param newVar el nuevo valor de altavoces
   */
  public void setAltavoces ( List<Altavoz> newVar ) {
    altavoces = newVar;
  }

  /**
   * Devuelve el valor de altavoces
   * @return el valor de altavoces
   */
  public List<Altavoz> getAltavoces ( ) {
    return altavoces;
  }

  /**
   * Fija el valor de volumen
   * @param newVar el nuevo valor de volumen
   */
  public void setVolumen ( int newVar ) {
    volumen = newVar;
  }

  /**
   * Devuelve el valor de volumen
   * @return el valor de volumen
   */
  public int getVolumen ( ) {
    return volumen;
  }

  /**
   * Fija el valor de resolucion
   * @param newVar el nuevo valor de resolucion
   */
  public void setResolucion ( Resolucion newVar ) {
    resolucion = newVar;
  }

  /**
   * Devuelve el valor de resolucion
   * @return el valor de resolucion
   */
  public Resolucion getResolucion ( ) {
    return resolucion;
  }

  /**
   * Fija el valor de botones
   * @param newVar el nuevo valor de botones
   */
  public void setBotones ( List<Boton> newVar ) {
    botones = newVar;
  }

  /**
   * Devuelve el valor de botones
   * @return el valor de botones
   */
  public List<Boton> getBotones ( ) {
    return botones;
  }

  /**
   * Fija el valor de estado
   * @param newVar el nuevo valor de estado
   */
  public void setEstado ( String newVar ) {
    estado = newVar;
  }

  /**
   * Devuelve el valor de estado
   * @return el valor de estado
   */
  public String getEstado ( ) {
    return estado;
  }

  /**
   * Fija el valor de entradas
   * @param newVar el nuevo valor de entradas
   */
  public void setEntradas ( List<Entrada> newVar ) {
    entradas = newVar;
  }

  /**
   * Devuelve el valor de entradas
   * @return el valor de entradas
   */
  public List<Entrada> getEntradas ( ) {
    return entradas;
  }

  /**
   * Fija el valor de apps
   * @param newVar el nuevo valor de apps
   */
  public void setApps ( List<App> newVar ) {
    apps = newVar;
  }

  /**
   * Devuelve el valor de apps
   * @return el valor de apps
   */
  public List<App> getApps ( ) {
    return apps;
  }

  /**
   * Fija el valor de wifi
   * @param newVar el nuevo valor de wifi
   */
  public void setWifi ( ConexionWifi newVar ) {
    wifi = newVar;
  }

  /**
   * Devuelve el valor de wifi
   * @return el valor de wifi
   */
  public ConexionWifi getWifi ( ) {
    return wifi;
  }

  /**
   * Fija el valor de estadoWifi
   * @param newVar el nuevo valor de estadoWifi
   */
  public void setEstadoWifi ( boolean newVar ) {
    estadoWifi = newVar;
  }

  /**
   * Devuelve el valor de estadoWifi
   * @return el valor de estadoWifi
   */
  public boolean getEstadoWifi ( ) {
    return estadoWifi;
  }

  //
  // Other methods
  //

  /**
   * Cambiar el estado de la TV a encendido
   */
  public void encender(  )
  {
      this.estado = "encendido";
  }


  /**
   * Apaga la Tv cambiando su estado a apagado
   */
  public void apagar(  )
  {
      this.estado = "apagado";
  }


  /**
   * instancia un objecto Wifi con las credenciales y cambia el estadoWifi a
   * conectadoWifi
   */
  public void conectarWifi(  )
  {
  }


  /**
   * Sube el volumen en 1
   * Verificar el rango de 0 - 100
   */
  public void subirVolumen(  )
  {
      this.volumen++;
  }


  /**
   * Baja el volumen en 1
   * Verificar el rango de 0 - 100
   */
  public void bajarVolumen(  )
  {
      this.volumen--;
  }
  /** Luis Gerardo Garcia Obispo (Documentador)
  * Implementación del método usb donde se modifica
  * el estado en el que se encuentra, si está conectado o
  * desconectado, cada vez que sea llamado. 
  */
  //Luis Antonio Moreno Pacheco (Coder)
  public void usb (){
      if(entradaA.equals("USB CONECTADO")){
          this.entradaA = "USB DESCONECTADO";
      }else
      {
          if(entradaA.equals("USB DESCONECTADO"))
              this.entradaA = "USB CONECTADO";
      }
  }
  /** Luis Gerardo Garcia Obispo (Documentador)
  * Implementación del método hdmi donde se modifica
  * el estado en el que se encuentra, si está conectado o
  * desconectado, cada vez que sea llamado. 
  */
  //Erik Isaias Ortiz Duarte (Coder)
  public void hdmi (){
      
      if(entradaB.equals("HDMI CONECTADO")){
          this.entradaB = "HDMI DESCONECTADO";
      }else
      {
          if(entradaB.equals("HDMI DESCONECTADO"))
              this.entradaB = "HDMI CONECTADO";
      }
  }
  public void print() {
      System.out.println("" + this.toString());
  }
  /** Luis Gerardo Garcia Obispo (Documentador)
  * Implementación del método String donde se agregaron
  * los objetos de estado, como lo es el propio estado, volumen,
  * entradaA y entradaB. 
  */
  //Erik Isaias Ortiz Duarte (Coder)
  public String toString() {
      String s = "";
      s += this.estado;
      s += this.volumen;
      s += this.entradaA;
      s += this.entradaB;
      return s;
  }
}
