/*
 * Dado un numero N leído por teclado encontrar el 
 * numero P primo mas cercano a él por exceso.
 */
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int contador=2;
		int numero;
		int resto;
		int mayor=0;


		System.out.print("Ingrese un numero: ");
		numero=teclado.nextInt();
		numero++;

		while (contador<numero){

			resto=numero % contador;

			if (resto==0){
				numero++;
				contador=2;
			}
			else {
				mayor=numero;

			}

			contador++;
		}
		System.out.print("El primo mas cercano es: " + mayor);



	}
}