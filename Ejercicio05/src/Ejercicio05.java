/*
 * Hacer un programa que lea una serie de números por teclado
 *  de manera que cuando el número leído sea el cero ya no se
 *   introduzcan más, el programa debe calcular y escribir la
 *    suma de los números de la serie y cuántos se han introducido en total.
 */
import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int N;
		int resultado=0;
		boolean detener = false;
		int contador=0;
	
		
		while (! detener){
			
			System.out.print("Ingrese un numero: ");
			N=teclado.nextInt();
			resultado= N + resultado;
			contador++;
			if (N==0){
				detener=true;
				contador--;
				System.out.print("El resultado es: " + resultado + " y se han introducido: " + contador + " numeros");
			}
		
			}
		}
	}


