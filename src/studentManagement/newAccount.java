package studentManagement;
//read msq doc,,ssd, core i5, later gen, 8gb ram.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class newAccount extends JFrame implements ActionListener {
    JTextField email, username;
    JLabel emailLab,usernameLab, passwordLab, confirmpasswordLab, result;
    JButton haveAccount, register;
    JPasswordField password, confirmpassword;
    public newAccount(){
        super("login");
        setSize(380,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        usernameLab = new JLabel("User name");
        username = new JTextField(10);
        emailLab = new JLabel("Enter Email: ");
        email = new JTextField(10);
        passwordLab = new JLabel("Enter password: ");
        password = new JPasswordField(10);
        confirmpasswordLab = new JLabel("Confirm password");
        confirmpassword = new JPasswordField(10);
        haveAccount = new JButton("Already have an account?");
        register = new JButton("register");
        result = new JLabel(" ");
        haveAccount.addActionListener(this);
        register.addActionListener(this);
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        setLayout(fl);
        add(usernameLab);
        add(username);
        add(emailLab);
        add(email);
        add(passwordLab);
        add(password);
        add(confirmpasswordLab);
        add(confirmpassword);
        add(haveAccount);
        add(register);
        add(result);
        setVisible(true);
        pack();
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        try{
            String em = email.getText();
            String pw = String.valueOf(password.getPassword());
            if(source == haveAccount){
                result.setText("go to login page instead");//navigate to login.java
            }
            if (source == register){
                result.setText("you have been registered");// save to users table in db
                //JOptionPane.showConfirmDialog(null, "reset password");
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
