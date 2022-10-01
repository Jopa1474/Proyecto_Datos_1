package Proyecto_Datos_1.src.Inicio_Sesión;

import Proyecto_Datos_1.src.Canciones;
import Proyecto_Datos_1.src.General.Libreria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase encargada de la creacion de la segunda ventana en la cual van a estar las librerias
 */
public class GUImain extends JFrame{

    public Lista<Libreria> libreria = new Lista<>();
    private DefaultListModel listModel = new DefaultListModel();
    int index = 0;
    private JList lstlibrerias;
    private JButton addLibreriaButton;
    private JTabbedPane tabbedPane1;
    private JLabel txtCreador;
    private JTextField textNombreLibreria;
    private JButton btnCrear;

    private JButton btnCancelar;
    private JPanel MainPanel;
    private JLabel mainUsuario;
    private JButton openLibreriabtn;

    /**
     * Metodo para obtener el usuario
     * @param _user El usuario
     */
    public void getUsuario(String _user){
        mainUsuario.setText(_user);
    }

    /**
     * Metodo constructor de GUImain
     */
    public GUImain(){
        setContentPane(MainPanel);
        setTitle("Main");
        setSize(900,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        tabbedPane1.setVisible(false);

        /**
         * Boton para añadir librerias
         */
        addLibreriaButton.addActionListener(new ActionListener() {
            /**
             * Metodo que se ejecuta al presionar el boton, el cual en este caso abre una ventana en la cual se pueden agregar los datos para la libreria que deseamos agregar
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setVisible(true);
                txtCreador.setText(mainUsuario.getText());

            }
        });

        /**
         * Boton para crear libreria
         */
        btnCrear.addActionListener(new ActionListener() {
            /**
             * A lla hora de presionar el boton, la libreria se agrega en una lista
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Libreria tmpLibrary = new Libreria(txtCreador.getText(),textNombreLibreria.getText());
                if(tmpLibrary.LibreriaValida()){
                    libreria.addNodo(tmpLibrary);

                }
                refresh(libreria);
                textNombreLibreria.setText("");
                tabbedPane1.setVisible(false);
            }
        });
        /**
         * Boton para cancelar la creacion de la libreria
         */
        btnCancelar.addActionListener(new ActionListener() {
            /**
             * A la hora de estripar el boton, se cierra la ventana para crear libreria
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setVisible(false);

            }
        });
        openLibreriabtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Canciones songFrame = new Canciones();
                setVisible(false);
            }
        });
    }


    /**
     * Metodo para refrescar la lista libreria
     * @param _libreria
     */
    private void refresh(Lista<Libreria> _libreria){
        _libreria.reset();
        listModel.clear();
        index = 0;
        Nodo<Libreria> tmp = _libreria.getNodo();
        while(tmp != null) {
            //listModel.addElement(index + "- " + tmp.value.getName() + " ~~ [" + tmp.value.getCreator() + "]");
            listModel.addElement(tmp.value.getNombre());
            index += 1;
            tmp = _libreria.getNodo();
        }
        lstlibrerias.setModel(listModel);
    }

}

