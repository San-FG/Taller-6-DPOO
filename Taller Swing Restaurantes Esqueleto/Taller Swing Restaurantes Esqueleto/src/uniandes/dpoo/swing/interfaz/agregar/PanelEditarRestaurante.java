package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar

            JPanel panelNombre = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
            JLabel labNombre = new JLabel( "Nombre" );
            txtNombre = new JTextField( 12 );
            panelNombre.add( labNombre );
            panelNombre.add( txtNombre );

        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar

            JPanel panelCalificacion = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
            JLabel labCalificacion = new JLabel( "Calificación" );
            cbbCalificacion = new JComboBox<String>( );
            cbbCalificacion.addItem( "1" );
            cbbCalificacion.addItem( "2" );
            cbbCalificacion.addItem( "3" );
            cbbCalificacion.addItem( "4" );
            cbbCalificacion.addItem( "5" );
            panelCalificacion.add( labCalificacion );
            panelCalificacion.add( cbbCalificacion );

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar

            JPanel panelVisitado = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
            JLabel labVisitado = new JLabel( "Visitado" );
            cbbVisitado = new JComboBox<String>( );
            cbbVisitado.addItem( "Sí" );
            cbbVisitado.addItem( "No" );
            panelVisitado.add( labVisitado );
            panelVisitado.add( cbbVisitado );

        // Agregar todos los elementos al panel
        // TODO completar

            add( panelNombre );
            add( panelCalificacion );
            add( panelVisitado );
         

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar
            String visitado = ( String )cbbVisitado.getSelectedItem( );
            return visitado.equals( "Sí" );
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODO completar
            return txtNombre.getText( );
    }
}
