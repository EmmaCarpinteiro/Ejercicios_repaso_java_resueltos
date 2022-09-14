package ejercicios;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    do
    {
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
    }
    while(numero != 5);

    System.out.println("Fin del programa");
    }
}

