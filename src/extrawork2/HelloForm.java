package extrawork2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton backToLoginFormButton;
    private LoginForm loginForm;

    public HelloForm(LoginForm loginForm, String text){
        this.setTitle("THIS IS MY APP");
        this.setContentPane(this.panel);
        this.setSize(300,200);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.label.setText(text);
        this.loginForm = loginForm;

        this.setVisible(true);
        this.setLocation(500, 300);
        backToLoginFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HelloForm.super.setVisible(false);
                loginForm.setVisible(true);
            }
        });
    }
}
