/*
 * Realizar un programa que elija mediante un menú un tipo de figura:
 * - Triángulo
 * - Cuadrado
 * - Rectángulo
 * una vez elegida la opción nos pida en cada caso los datos 
 * necesarios para calcular su área y nos la muestre.
 */
 import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		String figura;
		int lado, base, altura;
		int resultado;
		
		
		System.out.println("De que figura quieres calcular su area:");
		System.out.print("Hay disponibles: cuadrado, rectangulo o triangulo: ");
		figura=teclado.next();
	
		
		if (figura.equals("cuadrado")){
			System.out.print("Cuanto mide su lado:");
			lado=teclado.nextInt();
			resultado=lado*lado;
			System.out.print("El area del cuadrado es: " + resultado);
		}
			else if (figura.equals("rectangulo")){
				System.out.print("Cuanto mide su base y su altura: ");
				base=teclado.nextInt();
				altura=teclado.nextInt();
				resultado=base*altura;
				System.out.print("El area del rectangulo es: " + resultado);
			}
			else
				System.out.print("Cuanto mide su base y su altura: ");
				base=teclado.nextInt();
				altura=teclado.nextInt();
				resultado=base*altura/2;
				System.out.print("El area del triangulo es: " + resultado);
	}

}
