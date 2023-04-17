package extrawork2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LoginForm extends JFrame {
    private JTextField textField1;
    private JButton loginButton;
    private JPanel Panel;

    private HelloForm helloForm;
    public LoginForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                System.out.println(text);

                LoginForm.super.setVisible(false);

                helloForm = new HelloForm(LoginForm.this, getDoctorByPlan(text));

            }
        });
    }

    public static void main(String[] args) {
        LoginForm form = new LoginForm();
        form.setTitle("THIS IS MY APP");
        form.setContentPane(form.Panel);
        form.setSize(300,200);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setVisible(true);
        form.setLocation(500, 300);
    }

    private static String getDoctorByPlan(String plan){
        if(plan.equals("1")) return "You need visit our Therapist";
        if(plan.equals("2")) return "You need visit our Dentist";
        if(plan.equals("3")) return "You need visit our Surgeon";
        return "you need to go Okulist, there is not a current option";
    }
}
