package Proyecto_Datos_1.src.Inicio_Sesión;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que crea la ventana inicial para introducir los datos del usuario
 * @author
 */
public class Login extends JFrame{
    private JLabel Usuario;
    private JTextField txtUsuario;
    private JLabel Contraseña;
    private JTextField txtContraseña;
    private JButton btnLogin;
    private JPanel mainPanel;
    private Lista<Usuario> usuarios = new Lista<>();

    /**
     * Metodo constructor de la clase Login
     */
    public Login(){
        setContentPane(mainPanel);
        setTitle("Login");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        /**
         * Boton de login
         */
        btnLogin.addActionListener(new ActionListener() {
            /**
             * Metodo para poder identificar que los datos introducidos sean iguales a los datos predeterminados del usuario
             * @param e the event to be processed
             * @author https://www.youtube.com/watch?v=iDqpJbpw10k&ab_channel=CodLearn
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Usuario: " + txtUsuario.getText());
                usuarios.reset();
                Nodo<Usuario> tmp = usuarios.getNodo();
                while(tmp != null){
                    if(tmp.value.validarDatos(txtUsuario.getText(), txtContraseña.getText())){
                        break;
                    }else{
                        tmp = usuarios.getNodo();
                    }
                }
                if(tmp == null){
                    System.out.println("Datos incorrectos");
                    JOptionPane.showMessageDialog(txtUsuario,"Datos incorrectos","Error",JOptionPane.ERROR_MESSAGE);
                }else{
                    GUImain mainFrame = new GUImain();
                    mainFrame.getUsuario(tmp.value.getUsuario());
                    setVisible(false);
                }
                txtUsuario.setText("");
                txtContraseña.setText("");

            }
        });

    }

    /**
     * Metodo para poner el usuario en el tope de la ventana
     * @param _users Es el usuario
     */
    public void setUsuario(Lista<Usuario> _users){
        usuarios = _users;
    }
}
