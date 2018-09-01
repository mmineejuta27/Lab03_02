import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txtUserLogin;
    private JPasswordField pwdUserPass;
    private JButton btnSubmit;
    private JButton btnClear;
    private JPanel mainPanel;

    public Login() {
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, txtUserLogin.getText()+ " " + new String(pwdUserPass.getPassword()));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtUserLogin.setText("");
                pwdUserPass.setText("");
            }
        });
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}
