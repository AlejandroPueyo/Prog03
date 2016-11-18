import java.util.Scanner;

/*
 * Se define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1. 
 * Hacer un programa que lea un número N filtrando que debe ser mayor que cero y 
 * calcule su factorial.
 */
public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int contador=1;
		int resultado=1;
		int factorial=0;
		int N;
		
		System.out.print("Ingrese un numero: ");
		N=teclado.nextInt();
		
		
		if (N>0){
			while (contador<=N){
				resultado=resultado*contador;
				contador++;
			}
			factorial=resultado;
			System.out.print("El numero factorial es: " + resultado);
			}
				
		}		
	}


