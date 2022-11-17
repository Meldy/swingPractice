package test;

//import javax.awt.*;
import javax.swing.*;
import java.awt.*;

public class menu extends JFrame {
    public menu () {
        super("Menu bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setSize(300,100);
        JButton play = new JButton("Load");
        JButton stop = new JButton("Save");
        JButton rewind = new JButton("Subscribe");
        JButton fast_forward = new JButton("UnSubscribe");
        JToolBar bar = new JToolBar();
        bar.add(play);
        bar.add(stop);
        bar.add(rewind);
        bar.add(fast_forward);
        JMenuItem p = new JMenuItem("Play");
        JMenuItem s = new JMenuItem("stop");
        JMenuItem r = new JMenuItem("rewind");
        JMenuItem f = new JMenuItem("fast forward");
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("VDR");
        m.add(p);
        m.add(s);
        //m.addSeparator();
        m.add(r);
        m.add(f);
        mb.add(m);
        JTextArea ta = new JTextArea(20, 50);
        JScrollPane sp = new JScrollPane(ta);
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        add("North", bar);
        add("Center", sp);
        pack();
        setJMenuBar(mb);//adds menu bar to the Jpanel
        setVisible(true);
    }
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("Couldn't use the system "
                    + "look and feel: " + e);
        }
    }

    public static void main(String[] args) {
        menu me = new menu();
    }
}
