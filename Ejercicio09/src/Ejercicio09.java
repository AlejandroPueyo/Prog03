import java.util.Scanner;

/*
 * Un n�mero se dice que es perfecto cuando la suma de sus 
 * divisores propios �todos los divisores a excepci�n del 
 * propio n�mero-, es igual a dicho n�mero. Hacer un programa 
 * que lea un n�mero y nos diga si es perfecto o no.
 */
public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		int N;
		int contador=1;
		int divisor=0;
		int resultado=0;




		System.out.print("Ingrese un numero: ");
		N=teclado.nextInt();
		if(N!=0){
			while(contador<N){
				if (N % contador==0){
					divisor=contador;
					resultado=resultado+divisor;
				}


				contador++;
			}
			if (resultado==N)

				System.out.print("Es perfecto");
			else
				System.out.print("No es perfecto");

		}
	}

}
