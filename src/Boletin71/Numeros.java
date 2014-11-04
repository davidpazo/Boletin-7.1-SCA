package Boletin71;
// @author dpazolopez/

import javax.swing.JOptionPane;

public class Numeros {

    private short num1;
    private short num2;

    public Numeros() {
    }
    public Numeros(short n1, short n2) {
        num1 = n1;
        this.num2 = n2;
    }
    public void setNum1(short n1) {
        num1 = n1;
    }
    public void setNum2(short n2) {
        num2 = n2;
    }
    public short getNum1() {
        return num1;
    }
    public short getNum2() {
        return num2;
    }

    public void Condicion() {
        System.out.println("suma= "+(num1+num2));
        // JOptionPane.showMessageDialog(null,num1+num2);
        if (num1 >= num2) // JOptionPane.showMessageDialog(null,num1-num2);
        {
            System.out.println("resta= "+(num1-num2));
        }
    }
}
