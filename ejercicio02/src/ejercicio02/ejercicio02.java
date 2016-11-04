/*
 * Leer un número N que debe filtrarse entre 1 y 100 y a continuación 
 * calcular y escribir la tabla de multiplicar de ese número con el siguiente 
 * formato:
TABLA DE MULTIPLICAR DE 8
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
......
.....
8 * 10 = 80
 */

package ejercicio02;
import java.util.Scanner;
public class ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int N;
		int multi = 1;
		int resultado;
		System.out.print("Ingrese un numero: ");
		N=teclado.nextInt();
		
		if ( 1 <= N && N <= 100 )
			while (multi <= 10) {
				resultado = multi * N;

				System.out.println(N + "*" + multi + "=" + resultado );
				multi++;
			}
		else
			System.out.println("El numero introducido debe de estar entre el 1 y el 100.");

	}

}
