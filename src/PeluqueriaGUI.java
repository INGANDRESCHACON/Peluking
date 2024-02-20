import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class PeluqueriaGUI extends JFrame {
    private JButton btnCrear, btnActualizar, btnEliminar;
    private JTable tablaDatos;
    private DefaultTableModel modeloTabla;

    public PeluqueriaGUI() {
        setTitle("Gestión de Peluquería");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Crear componentes
        btnCrear = new JButton("Crear");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");

        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        tablaDatos = new JTable(modeloTabla);

        // Agregar componentes al contenedor
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(new JScrollPane(tablaDatos), BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnCrear);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);
        container.add(panelBotones, BorderLayout.SOUTH);

        // Agregar listeners
        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para crear un nuevo registro
                modeloTabla.addRow(new Object[]{"ID", "Nombre", "Apellido"});
            }
        });

        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para actualizar un registro seleccionado
                int filaSeleccionada = tablaDatos.getSelectedRow();
                if (filaSeleccionada != -1) {
                    modeloTabla.setValueAt("NuevoNombre", filaSeleccionada, 1);
                    modeloTabla.setValueAt("NuevoApellido", filaSeleccionada, 2);
                }
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar un registro seleccionado
                int filaSeleccionada = tablaDatos.getSelectedRow();
                if (filaSeleccionada != -1) {
                    modeloTabla.removeRow(filaSeleccionada);
                }
            }
        });

        // Mostrar la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PeluqueriaGUI();
            }
        });
    }
}
