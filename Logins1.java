import javax.swing.*;
import java.awt.event.*;

class Logins1 extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;

    Logins1(String s1) {
        super(s1);
    }

    void setComponents() {
        l1 = new JLabel("Welcome to RK WORLDS");
        l2 = new JLabel("USERNAME");
        l3 = new JLabel("PASSWORD");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        b2 = new JButton("Clear");
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        l1.setBounds(100, 50, 300, 30);
        l2.setBounds(100, 200, 100, 30);
        l3.setBounds(100, 350, 100, 30);
        l4.setBounds(100, 550, 300, 30);
        t1.setBounds(350, 200, 100, 30);
        t2.setBounds(350, 350, 100, 30);
        b1.setBounds(200, 450, 100, 30);
        b2.setBounds(300, 450, 100, 30);
        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());
    }

    public static void main(String args[]) {
        Logins1 j1 = new Logins1("Welcome to Gaurav");
        j1.setSize(1366, 768);
        j1.setVisible(true);
        j1.setComponents();
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Log implements ActionListener {
        public void actionPerformed(ActionEvent e1) {
            String s1 = t1.getText();
            String s2 = t2.getText();
            if (s1.equals("Gaurav") && s2.equals("1234")) {
                l4.setText("Login Successful");
            } else {
                l4.setText("Login Unsuccessful");
            }
        }
    }

    class Clear implements ActionListener {
        public void actionPerformed(ActionEvent e1) {
            t1.setText("");
            t2.setText("");
        }
    }
}