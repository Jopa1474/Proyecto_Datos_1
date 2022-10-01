package Proyecto_Datos_1.src;

import javax.swing.*;

public class Canciones extends JFrame{
    private JList ListaCanciones;
    private JButton btnagregarcancion;
    private JPanel SongPanel;

    public Canciones(){
        setContentPane(SongPanel);
        setTitle("Canciones");
        setSize(900,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }



}
