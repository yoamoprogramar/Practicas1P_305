package practicas;

import java.util.Scanner;

public class Practica04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Cual es tu edad??");
        int edad = in.nextInt();
        if (edad >= 18) {
            System.out.println("SOY ADULTO");
        } else {
            System.out.println("SOY JOVEN");
        }
    }
}
