/*
 * Dado un numero N imprimir la lista de todos los 
 * numero primos hasta dicho numero N.
 */
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero;
		int resto;
		int contador=2;
		int contadorN=3;
		boolean primo=false;

		System.out.print("Ingrese un numero: ");
		numero=teclado.nextInt();


		System.out.println("1 Es primo");
		System.out.println("2 Es primo");
		while (contadorN<numero ){

			while (contador<contadorN){
				resto=contadorN % contador;

				if (resto==0){
					primo=false;
					contador=contadorN;
				}
				else{
					primo=true;
				}

				contador++;
			}


			if (primo==true){

				System.out.println(contadorN + " Es primo");
			}


			contadorN++;
			contador=2;

		}
	}
}

