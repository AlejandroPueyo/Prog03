/*
 * Hacer un programa que lea un número N y nos escriba en la pantalla mediante 
 * un mensaje si es o no primo (NOTA: Número primo es aquél que es divisible 
 * solo por si mismo y por la unidad)
 */
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero;
		int multi=1;
		
		System.out.print("Ingrese un numero: ");
		numero=teclado.nextInt();
		
		//while (multi<=numero){
			
			if (numero % multi == 0)
				System.out.println("Es primo");
			
			
			
				
			else 
				
				System.out.println("No es primo");
			
				multi++;
			}
			
	}

//}
