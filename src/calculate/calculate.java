package calculate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculate extends JFrame implements ActionListener {
    JTextField num1, num2, ans;
    JLabel plus, equals;
    JButton add,minus, divide, multiple, clear, history;
    public calculate(){
        super("calculate");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        num1 = new JTextField(5);
        num2 = new JTextField(5);
        ans = new JTextField(5);
        plus = new JLabel("+");
        equals = new JLabel("=");
        add = new JButton("add");
        minus = new JButton("minus");
        divide = new JButton("divide");
        multiple = new JButton("multiply");
        clear = new JButton("clear");
        history = new JButton("history"); //Jdbc needed here
        add.addActionListener(this);
        clear.addActionListener(this);
        minus.addActionListener(this);
        divide.addActionListener(this);
        multiple.addActionListener(this);
        history.addActionListener(this);//jdbc
        ans.setEditable(false);
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        add(num1);
        add(plus);
        add(num2);
        add(equals);
        add(ans);
        add(add);
        add(minus);
        add(divide);
        add(multiple);
        add(clear);
        add(history);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        try{
            int one = Integer.parseInt(num1.getText());
            int two = Integer.parseInt(num2.getText());
        if(source == add) {
            //int one = Integer.parseInt(num1.getText());
            //int two = Integer.parseInt(num2.getText());
            int s = one + two;
            ans.setText(String.valueOf(s));
        } else if (source == minus) {
            plus.setText("-");
            int mi = one - two;
            ans.setText(String.valueOf(mi));
        } else if (source == divide) {
            plus.setText("/");
            int d = one/ two;
            ans.setText(String.valueOf(d));
        }else if(source == multiple){
            plus.setText("*");
            int mu = one * two;
            ans.setText(String.valueOf(mu));
        } else if (source == clear) {
            num1.setText(" ");
            num2.setText(" ");
            ans.setText(" ");
        } else if (source == history) {
            ans.setText("add jdbc");
        }
        }catch (NumberFormatException nfe){
            ans.setText("null");
        } }

    public static void main(String[] args) {
        calculate ca = new calculate();
    }
}
