/*
 * Hacer un programa que lea una serie de n�meros por teclado
 *  de manera que cuando el n�mero le�do sea el cero ya no se
 *   introduzcan m�s, el programa debe calcular y escribir la
 *    suma de los n�meros de la serie y cu�ntos se han introducido en total.
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


