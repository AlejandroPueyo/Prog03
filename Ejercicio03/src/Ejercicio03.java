/*
 * Escribir un programa que una vez que lea un número N 
 * por teclado calcule y escriba sus divisores por la 
 * pantalla (sin incluirse a si mismo).
 */
import java.util.Scanner;
public class Ejercicio03 {
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero;
		int divisor = 1;
		
		
		System.out.print("Ingrese un numero: ");
		numero=teclado.nextInt();
		
		while (divisor < numero){
			
			if(numero % divisor == 0){
			
				
				System.out.println("Los divisores de " + numero + " son: " + divisor);
			}	
			divisor++;
		
					
		}
	}

}
