package PMedidas;
import java.text.DecimalFormat;
import javax.swing.*;

public class ObtenerMedidas extends JFrame {

    //atributos para crear la ventana que mostrara las medidas de la tv
    private JPanel centPanel;
    private JPanel infPanel;

    private JLabel labelDiagonal;
    private JLabel labelLargo;
    private JLabel labelAncho;

    private JButton btnInt;
    private JButton btnCGS;
    private Dimension dim;

    //Angel Torres
    //constructor
    public ObtenerMedidas(){

    }

    //metodos

    //Jaqueline Cruz
    //implementar un metodo para actualizar los datos de las medidas a Internacional en pantalla
    private void actualizaMedidaInt(){

    }
    //implementar un metodo para actualizar los datos de las medidas a CGS en pantalla
    //Anotonio ibarra
    private void actualizaMedidaCGS(){

    }

    //implementar un metodo para obtener los cambios de medida desde un objeto de la clase Dimension
    //David Abner
    private void actualizaMedidas(String unidad) {
        DecimalFormat df = new DecimalFormat("0.00");
        labelDiagonal.setText("Diagonal :"+
                Double.toString(Double.parseDouble(df.format(dim.getDiagonal())))+" "+unidad);
        labelAncho.setText("Ancho: "
                +Double.toString(Double.parseDouble(df.format(dim.getAncho())))+" "+unidad);
        labelLargo.setText("Largo: "+
                Double.toString(Double.parseDouble(df.format(dim.getLargo())))+" "+unidad);
    }

    //autodemo
    public static void main(String[] args) {
        new ObtenerMedidas();
    }

}
