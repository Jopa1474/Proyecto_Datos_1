package Proyecto_Datos_1.src;

import jaco.mp3.player.MP3Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Clase para la ventana en la que estan las canciones
 * @author https://stackoverflow.com/questions/40577425/jaco-mp3-player. en lo que a reproduccion de canciones se refiere
 */
public class Canciones extends JFrame{
    private JList ListaCanciones;
    private JButton btnagregarcancion;
    private JPanel SongPanel;
    private JButton playbtn;
    private JButton stopbtn;
    private JButton nextbtn;
    private JButton backbtn;
    File f = new File ("Playboi Carti - Stop Breathing (Official Audio)(MP3_320K).mp3");
    MP3Player mp3 = new MP3Player(f);

    /**
     * Metodo constructor para inicializar la clase canciones
     */
    public Canciones(){
        setContentPane(SongPanel);
        setTitle("Canciones");
        setSize(900,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        /**
         * Boton para darle play a las canciones
         */
        playbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mp3.play();
            }
        });
        /**
         * Boton para parar la reproduccion de canciones
         */
        stopbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mp3.pause();
            }
        });
        /**
         * Boton para siguiente cancion
         */
        nextbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

    }
}



