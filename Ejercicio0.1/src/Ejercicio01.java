/*
 * Escribir un programa que calcule e imprima la suma de los números 
 * enteros comprendidos entre A y B que deben leerse por teclado y filtrarse 
 * para que A<=B. Los valores de A y B no deben incluirse en la suma.
 */
import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int A, B, suma, resta;
		int aux = 0;
		
		System.out.print("Ingrese primer numero:");
		A=teclado.nextInt();
		System.out.print("Ingrese segundo numero:");
		B=teclado.nextInt();
		
		for (int i= A + 1; i < B; i++)
			aux = i + aux;
			
			
			
			
			System.out.print("El resultado de la suma es: " + aux);

	
			
	}
	
}
