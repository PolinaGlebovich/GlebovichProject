package classwork.Lesson10.extrawork10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBestLoginPage extends JFrame{
    private JTextField loginField;
    private JButton button1;
    private JPanel panel;
    private JPasswordField passwordField1;

    public MyBestLoginPage() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    checkCredentials(loginField.getText(), passwordField1.getText());
                    JOptionPane.showMessageDialog(MyBestLoginPage.this, "Login and password are correct");
                } catch (WrongLoginException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(MyBestLoginPage.this, ex.getMessage(), "Something bad with login", JOptionPane.ERROR_MESSAGE);
                } catch (WrongPasswordException ex){
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(MyBestLoginPage.this, ex.getMessage(), "Something bad with password", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex){
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(MyBestLoginPage.this, ex.getMessage(), "Access denied!", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        MyBestLoginPage form = new MyBestLoginPage();
        form.setTitle("THIS IS MY APP");
        form.setContentPane(form.panel);
        form.setSize(270,120);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setVisible(true);
        form.setLocation(500, 300);
    }

    private static boolean checkCredentials(String login, String password) throws Exception {
        String correctLogin = "super";
        String correctPassword = "puper";
        if(login.length() < 3) throw new WrongLoginException("Login is too short!");
        if(password.length() < 3) throw new WrongPasswordException("Password is too short!");
        if(login.equals(correctLogin) && password.equals(correctPassword)) return true;
        throw new Exception("Login or password are incorrect!");
    }
}
