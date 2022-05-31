package PMedidas;
import java.awt.*;
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
        this.dim = new Dimension(100,50,25, new MedidaInternacional());
        centPanel = new JPanel(new GridLayout(3,0));
        infPanel = new JPanel(new FlowLayout());

        btnCGS = new JButton("Medida CGS");
        btnCGS.addActionListener(e->actualizaMedidaCGS());
        btnInt = new JButton("Medida internacioanl");
        btnInt.addActionListener(e->actualizaMedidaInt());

        infPanel.add(btnInt);
        infPanel.add(btnCGS);

        labelDiagonal = new JLabel();
        labelAncho = new JLabel();
        labelLargo = new JLabel();

        labelDiagonal.setFont(new Font(labelDiagonal.getName(),Font.PLAIN,50));
        labelAncho.setFont(new Font(labelAncho.getName(),Font.PLAIN,50));
        labelLargo.setFont(new Font(labelLargo.getName(),Font.PLAIN,50));
        actualizaMedidas("CM");
        labelDiagonal.setHorizontalAlignment(0);
        labelAncho.setHorizontalAlignment(0);
        labelLargo.setHorizontalAlignment(0);


        centPanel.add(labelDiagonal);
        centPanel.add(labelAncho);
        centPanel.add(labelLargo);

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(centPanel, BorderLayout.CENTER);
        this.getContentPane().add(infPanel, BorderLayout.SOUTH);
        this.setSize(800,600);
        this.setTitle("Obtener medidas");
        this.setLocationRelativeTo(null);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    //metodos

    //Jaqueline Cruz
    //implementar un metodo para actualizar los datos de las medidas a Internacional en pantalla
    private void actualizaMedidaInt(){
        System.out.println("Cambiando a internacional");
            dim.cambiarMedida(new MedidaInternacional());
            actualizaMedidas("CM");

    }
    //implementar un metodo para actualizar los datos de las medidas a CGS en pantalla
    //Anotonio ibarra
    private void actualizaMedidaCGS(){
        System.out.println("Cambiando a CGS");
        dim.cambiarMedida(new MedidaCGS());
        actualizaMedidas("ln")<
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
