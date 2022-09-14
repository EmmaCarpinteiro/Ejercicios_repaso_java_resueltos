package ejercicios;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa tu edad: ");

    int idade1 = sc.nextInt();
        if(idade1 > 18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}

