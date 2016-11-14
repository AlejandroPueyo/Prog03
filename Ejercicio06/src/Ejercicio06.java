/*
 * Hacer un programa que vaya leyendo números por el teclado 
 * hasta que lea el cero, que indicará el fin de la entrada de 
 * datos. El programa debe calcular y escribir la suma de los números 
 * introducidos en lugar par y de los introducidos en lugar impar, es decir 
 * los introducidos primero, tercero, quinto, etc. y la suma de los introducidos 
 * segundo, cuarto, sexto, etc.
 */
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int N;
		boolean detener = false;
		int resultadoPar=0;
		int resultadoImpar=0;
		int contador=1;

		while (! detener){
			
			if (contador%2==0){ // Calcula si el numero que divide por 2 da resto 0 y si es asi, es par.
				System.out.print("Ingrese un numero: ");
				N=teclado.nextInt();
				resultadoPar= N + resultadoPar;
				contador++;
			}
			else {
				System.out.print("Ingrese un numero: ");
				N=teclado.nextInt();
				resultadoImpar= N + resultadoImpar;
				contador++;
			}
			if (N==0){
				detener=true;
				System.out.println("El resultado de los numeros pares es: " + resultadoPar);
				System.out.print("El resultado de los numeros impares es: " + resultadoImpar);

			}

		}
	}}
