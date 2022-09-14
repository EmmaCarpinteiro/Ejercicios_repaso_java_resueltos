package ejercicios;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese su nombre: ");

    String nombre = sc.next();

    System.out.println("Ingrese su email: ");

    String email = sc.next();

    System.out.println("Su nombre es: " + nombre + " y tu email es: " + email);
    }
}
