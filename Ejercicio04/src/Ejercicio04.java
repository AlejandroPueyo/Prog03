/*
 * Hacer un programa que lea un n�mero N y nos escriba en la pantalla mediante 
 * un mensaje si es o no primo (NOTA: N�mero primo es aqu�l que es divisible 
 * solo por si mismo y por la unidad)
 */
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero;
		int divi=2;
		int resto;
		
		
		System.out.print("Ingrese un numero: ");
		numero=teclado.nextInt();
		
			while (divi<numero){
				resto=numero % divi;
			
					if (resto==0){
						
						System.out.println("No es primo");
						divi=numero;
					}
					else 
						System.out.println("Es primo");
						divi=numero;
						}
					
					divi++;
			}
		
			
	}
	



					
			
			
				
				
			
			
	


