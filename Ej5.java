package ejercicios;

import java.util.Scanner;
import until.EjercicioCinco;

public class Ej5 extends EjercicioCinco {

	public static int numero; 
	
    public static void main(String[] args) {
    	
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Escribe un número entre 1 al 50: ");
    numero = sc.nextInt();

    if(numero < 5 || numero > 50) {
    	System.out.println("Número no válido");
    }
 
    parImpar(numero);
    
   }
}