package Proyecto_Datos_1.src.Inicio_Sesión;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JLabel Usuario;
    private JTextField txtUsuario;
    private JLabel Contraseña;
    private JTextField txtContraseña;
    private JButton btnLogin;
    private JPanel mainPanel;
    private Lista<Usuario> usuarios = new Lista<>();
    public Login(){
        setContentPane(mainPanel);
        setTitle("Login");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("User: " + txtUsuario.getText());
                usuarios.reset();
                Nodo<Usuario> tmp = usuarios.getNodo();
                while(tmp != null){
                    if(tmp.value.validarDatos(txtUsuario.getText(), txtContraseña.getText())){
                        System.out.println("Datos incorrectos");
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

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public void setUsuario(Lista<Usuario> _users){
        usuarios = _users;
    }
}
