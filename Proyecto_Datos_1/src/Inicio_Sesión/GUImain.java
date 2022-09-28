package Proyecto_Datos_1.src.Inicio_Sesión;

import Proyecto_Datos_1.src.General.Libreria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public void getUsuario(String _user){
        mainUsuario.setText(_user);
    }

    public GUImain(){
        setContentPane(MainPanel);
        setTitle("Main");
        setSize(900,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        tabbedPane1.setVisible(false);

        addLibreriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setVisible(true);
                txtCreador.setText(mainUsuario.getText());

            }
        });

        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Libreria tmpLibrary = new Libreria(txtCreador.getText(),textNombreLibreria.getText());
                if(tmpLibrary.LibreriaValida()){
                    libreria.addNodo(tmpLibrary);
                    libreria.printList();
                }
                refresh(libreria);
                textNombreLibreria.setText("");
                tabbedPane1.setVisible(false);
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setVisible(false);
            }
        });
    }
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

