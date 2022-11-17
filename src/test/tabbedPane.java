package test;

import javax.swing.*;

public class tabbedPane extends JFrame {
    public tabbedPane(){
        super("Tabbed Pane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setSize(480, 218);
        JButton mb = new JButton("Main settings");
        JPanel ms = new JPanel();
        ms.add(mb);
        JButton ab = new JButton("Advanced settings");
        JPanel as = new JPanel();
        as.add(ab);
        JButton pb = new JButton("Privacy settings");
        JPanel ps = new JPanel();
        ps.add(pb);
        JButton eb = new JButton("Email Settings");
        JPanel es = new JPanel();
        es.add(eb);
        JButton sb = new JButton("Security settings");
        JPanel ss = new JPanel();
        ss.add(sb);
        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Main", ms);
        tp.addTab("Advanced", as);
        tp.addTab("Privacy", ps);
        tp.addTab("Email", es);
        tp.addTab("Security", ss);
        add(tp);
        setVisible(true);
    }

    public static void main(String[] args) {
        tabbedPane tbp = new tabbedPane();
    }
}
