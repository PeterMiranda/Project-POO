package PBotones;

import PMain.Tv;

/**
 * Luis Gerardo Garcia Obispo (Documentador)
 * Implementación de la clase Boton
 * Se agregarón las variables de MIN_VOLUME y MAX_VOLUME para
 * denotar cuando se sube y baja el volumen en tv, asignandoles un 
 * volúmen definido. 
 * Class Boton
 */
//Daniel Suárez Nava (Coder)
//Juan Manuel Melchor Gaspar (Coder)
    public abstract class Boton {
    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 10;
    //public int volume = 6;
    public int total;
    protected Tv tv;

    //
    // Fields
    //
    //
    // Constructors
    //
    //Herrera improvement 
    public Boton() {
    }

    ;
    
    public Boton(Tv tv) {
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
    public abstract void execute();
}
