import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Username{
    public static void main(String[] args){
        JFrame frame = new JFrame("Login GUI");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); 
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel){
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(100, 80, 80, 25);
        panel.add(cancelButton);

        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                if("admin".equals(username) && "123456".equals(password)){
                    JOptionPane.showMessageDialog(panel, "Login Berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } else{
                    JOptionPane.showMessageDialog(panel, "Username atau Password Salah!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        cancelButton.addActionListener(e -> System.exit(0));
    }
}
