import javax.swing.*;
public class Calculator extends JFrame
{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    Calculator()
    {
        l1=new JLabel("Enter first number");
        add(l1);
        setBounds(20,80,100,50);
        l2=new JLabel("Enter second number");
        add(l2);
        setBounds(20,150,100,50);
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Calculator();
    }

}
