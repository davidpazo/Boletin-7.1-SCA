package Boletin71;
//@author dpazolopez

import java.util.Scanner;

public class Boletin71 {

    public static void main(String[] args) {
        short num1, num2;
        Numeros obxecto = new Numeros();
        //num1= obxecto.pedirDato();
        //num2= obxecto.pedirDato();
        Scanner dato = new Scanner(System.in);
        System.out.println("Numero 1:");
        obxecto.setNum1(dato.nextShort());
        System.out.println("Numero 2:");
        obxecto.setNum2(dato.nextShort());
        obxecto.getNum1();
        obxecto.getNum2();
        obxecto.Condicion();
    }

}
