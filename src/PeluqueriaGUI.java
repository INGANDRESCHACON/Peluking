import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class PeluqueriaGUI extends JFrame {
    private JButton btnCrear, btnActualizar, btnEliminar;
    private JTable tablaDatos;
    private JScrollPane scrollPane;

    public PeluqueriaGUI() {
        setTitle("Gestión de Peluquería");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Crear componentes
        btnCrear = new JButton("Crear");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");

        tablaDatos = new JTable();
        scrollPane = new JScrollPane(tablaDatos);

        // Agregar componentes al contenedor
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(scrollPane, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnCrear);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);
        container.add(panelBotones, BorderLayout.SOUTH);

        // Agregar listeners
        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para crear un nuevo registro
            }
        });

        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para actualizar un registro seleccionado
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar un registro seleccionado
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
