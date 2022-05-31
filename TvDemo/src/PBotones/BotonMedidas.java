package PBotones;

import PMain.Tv;
import PMedidas.ObtenerMedidas;

import javax.swing.*;

public class BotonMedidas extends Boton {
    //constructor
    //Implementar el constructor de esta clase
    //Angel Torres
    public BotonMedidas(Tv tv){
        super(tv);
        this.addActionListener(e->execute());
    }

    //Crear una instnacia de la clase ObtnerMedias
    //Angel Torres
    @Override
    public void execute() {
        new ObtenerMedidas();
    }
}
