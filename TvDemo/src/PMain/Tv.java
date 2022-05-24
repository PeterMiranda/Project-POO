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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * Class Tv
 */
public class Tv extends JFrame{

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
  
  //Angel TH
  private JPanel panelDisplay;
  private JPanel panelBotones;
  
  //
  // Constructors
  //
  //Herrera improvement 
  public Tv () {
      initTvJframe();
      /*
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
      }*/
  };
  
  //
  // Methods
  //
  //Angel
  private void initTvJframe(){
      //
      getContentPane().setLayout(new BorderLayout());
      
      //ajustes del panel display
      panelDisplay = new JPanel();
      //ver los bordes de este panel
      panelDisplay.setBorder(BorderFactory.createLineBorder(Color.RED));
      //poniendo de color negro este panel
      panelDisplay.setBackground(Color.BLACK);
      panelDisplay.setLayout(new BorderLayout());
      
      //ajustes del panel para los botones
      panelBotones = new JPanel();
      panelBotones.setBorder(BorderFactory.createLineBorder(Color.BLUE));
      panelBotones.setLayout(new FlowLayout());
      //añadir botones a este panel
      /*for(Boton btn : botones){
          panelBotones.add(btn);
      }*/
      
      //ajustes para el JFrame
      //añadiendo paneles al jframe
      getContentPane().add(panelDisplay, BorderLayout.CENTER);
      getContentPane().add(panelBotones, BorderLayout.SOUTH);
      //ajustes del panel
      this.setSize(800,600);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("TV");
      this.setVisible(true);
  }

  //Angel
  private void initAplicaciones(){
      //inicializamos el atributo de la clase
        apps = new ArrayList<>();
        //Inicializando las apps dinamicamente
        //cambiar esta implementacion
        ArrayList<String> appList = new ArrayList<>();
        appList.add("Musica");
        appList.add("Streaming");

        for (int i = 0; i < appList.size(); i++) {
            try {
                String nombre = appList.get(i);
                Class clase = Class.forName("PApps.App" + nombre);
                Object obj = clase.newInstance();
                App app = (App) obj;
//              System.out.println(app);
//              apps.add(app);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
  }

  //David
  private void initiBotones(){

  }

  //Anotonio
  private void initAltavoces(){

  }

  //Jaqueline
  private void initEntradas() {
  }

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

  public void print() {
      System.out.println("" + this.toString());
  }
  
  public String toString() {
      String s = "";
      s += this.estado;
      s += this.volumen;
      return s;
  }
}
