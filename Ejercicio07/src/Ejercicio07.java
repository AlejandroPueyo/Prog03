/*
 * Escribir un programa que lea una secuencia de datos numéricos 
 * de longitud indefinida, de manera que cuando el número sea el 
 * cero cesará la entrada de dicha secuencia. El programa debe 
 * imprimirnos la media de todos ellos, el mayor y el menor.
 */
import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		int N;
		int media;
		int mayor=0;
		int resultado=0;
		int menor=0;
		int contador=0;

		System.out.print("Ingrese un numero: ");
		N=teclado.nextInt();
		mayor=menor=N;
		while (N!=0){

			resultado= N + resultado;

			System.out.print("Ingrese un numero: ");
			N=teclado.nextInt();

			contador++;

			if (N!=0){
				if (N > mayor){
					mayor=N;
				}
				if (N < menor){
					menor=N;

				}
			}
		}

		if (N==0){
			media=resultado/contador;
			System.out.println("La media es: " + media);
			System.out.println("El mayor es: " + mayor);
			System.out.println("El menor es: " + menor);

		}

	}

}


