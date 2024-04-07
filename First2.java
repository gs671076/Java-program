import java.awt.*;
class First2
{
First2()
{
Frame f=new Frame();
Button b=new Button("Click me");
b.setBounds(20,30,50,100);
f.setVisible(true);
f.setSize(300,300);
f.add(b);
f.setLayout(null);
}
public static void main(String args[])
{
new  First2();
}
}