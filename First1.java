import java.awt.*;
class First1 extends Frame
{
First1()
{
Button b=new Button("Click me");
b.setBounds(20,30,50,100);
setVisible(true);
setSize(300,300);
add(b);
setLayout(null);
}
public static void main(String args[])
{
new  First1();
}
}