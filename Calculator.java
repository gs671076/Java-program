import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Calculator extends JFrame
{
JLabel a1, a2,a3;
JTextField t1,t2;
JButton b1,b2,b3,b4;
Font f1=new Font("Arial",Font.BOLD,26);
Calculator(String s1)
{
super(s1);
}
void setComponents()
{
a1=new JLabel("First Integer");
a2=new JLabel("Second Integer");
a3=new JLabel();
t1=new JTextField();
t2=new JTextField();
b1=new JButton("ADD");
b2=new JButton("Subtract");
b3=new JButton("Multiply");
b4=new JButton("Devide");
setLayout(null);
add(a1);
add(a2);
add(a3);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);
a1.setBounds(100,100,250,50);
a2.setBounds(100,200,250,50);
t1.setBounds(200,100,200,30);
t2.setBounds(200,200,200,30);
b1.setBounds(300,300,100,50);
b2.setBounds(400,300,100,50);
b3.setBounds(500,300,100,50);
b4.setBounds(600,300,100,50);
a3.setBounds(100,600,500,50);
b1.addActionListener(new Add());
b2.addActionListener(new  Subtract());
b3.addActionListener(new Multiply());
b4.addActionListener(new Devide());
}
public static void main(String args[])
{
Calculator c1=new Calculator("Calculator");
c1.setSize(1366, 768);
 c1.setVisible(true);
 c1.setComponents();
c1.getContentPane().setBackground(Color.YELLOW);
 c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
class Add implements ActionListener{
public void actionPerformed(ActionEvent e1)
{
String s1=t1.getText();
String s2=t2.getText();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=a+b;
a3.setFont(f1);
a3.setText("Sum is "+Integer.toString(c));
}
}
class Subtract implements ActionListener{
public void actionPerformed(ActionEvent e1)
{
String s1=t1.getText();
String s2=t2.getText();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=a-b;
a3.setFont(f1);
a3.setText("Subtract is "+Integer.toString(c));
}
}
class Devide implements ActionListener{
public void actionPerformed(ActionEvent e1)
{
String s1=t1.getText();
String s2=t2.getText();
float a=Float.parseFloat(s1);
float b=Float.parseFloat(s2);
float c=a/b;
a3.setFont(f1);
a3.setText("Result of division F.I/S.I:  "+Float.toString(c));
}
}
class Multiply implements ActionListener{
public void actionPerformed(ActionEvent e1)
{
String s1=t1.getText();
String s2=t2.getText();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=a*b;
a3.setFont(f1);
a3.setText("Multiplication Of Two number is: "+Integer.toString(c));
}
}
}