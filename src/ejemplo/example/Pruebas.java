package ejemplo.example;

import java.util.Scanner;

public class Pruebas {
	
	public static void Recorrido(int v1){
			
		for(int i=1; i<=v1; i++){
			for(int j=1; j<=10; j++){
				System.out.println(i + " X " + j + " = " + i*j);		
			}
			System.out.println("");
		}
	}
	
	public static void porcentaje(float p1, float v2){
		
		double k = (p1 * v2)/100;
		System.out.println("La cantidad a descontar es de: "+ k);
	}
	public static void main(String[] args) {
		
//		System.out.println("Introduce un numero: ");
//		Scanner var1 = new Scanner(System.in);
//		int valor = var1.nextInt();
//		System.out.println("El valor seleccionado por el usuario es: " + valor);
//		Recorrido(valor);
		
		
		System.out.println("Ingresa el porcentaje de descuento");
		Scanner descuento = new Scanner(System.in);
		float porc = descuento.nextFloat();
		System.out.println("Ingresa el total");
		Scanner total = new Scanner(System.in);
		float cant = total.nextFloat();
		
		porcentaje(porc, cant);

	}

}
