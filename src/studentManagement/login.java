package studentManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class login extends JFrame implements ActionListener {
    JTextField email;
    JLabel emailLab, passwordLab, result;
    JButton login, forgotPassword;
    JPasswordField password;
    public login(){
        super("login");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        emailLab = new JLabel("Enter Email: ");
        email = new JTextField(10);
        passwordLab = new JLabel("Enter password: ");
        password = new JPasswordField(10);
        login = new JButton("login");
        forgotPassword = new JButton("forgot password?");
        result = new JLabel(" ");
        login.addActionListener(this);
        forgotPassword.addActionListener(this);
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
        setLayout(fl);
        add(emailLab);
        add(email);
        add(passwordLab);
        add(password);
        add(login);
        add(forgotPassword);
        add(result);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        try{
           String em = email.getText();
           String pw = String.valueOf(password.getPassword());
           if(source == login){
               if ((Objects.equals(em, "emelda")) && (pw.equals("1234"))){
                   result.setText("logged in!!");
               } else if ((!Objects.equals(em, "emelda")) || (!pw.equals("1234"))) {
                   result.setText("incorrect password or email");
               }
           }
           if (source == forgotPassword){
               result.setText("password reset");
               JOptionPane.showConfirmDialog(null, "reset password");
           }
        }catch (NumberFormatException ie){
            result.setText("an error occurred");
            //int resp = JOptionPane.showConfirmDialog(null,"reset password");

        }
    }
    public static void main(String[] args) {
        newAccount li = new newAccount();
    }
}
