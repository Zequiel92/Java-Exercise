package ejercicios01;

import java.util.Scanner;

public class ServicioVacacional {
	
	public static void main(String[] args) {
		
		// Entrada de datos del usuario
		Scanner entrada = new Scanner(System.in);
		
		// Nombre del empleado
		String nombre;
		
		// Clave del empleado en la empresa
		int clave;
		
		// Años de antiguedad del empleado en la empresa
		int antiguedad;
		
		
		System.out.println("----BIENVENIDO AL CENTRO VACACIONAL DE----");
		System.out.println("------------ COCA-COLA COMPANY -----------");
		
		System.out.println("Nombre del empleado");
		nombre = entrada.next();
		
		System.out.println("Numero de departamento");
		clave = entrada.nextInt();
		
		System.out.println("Antiguedad en la empresa");
		antiguedad = entrada.nextInt();
		
		
		if (clave == 1) {
			if (antiguedad == 1) {
				System.out.println("Tiene derecho a 6 dias de vacaciones");
				
			} else if (antiguedad >= 2 && antiguedad <= 6) {
				System.out.println("Tiene derecho a 14 dias de vacaciones");
				
			} else if (antiguedad == 7) {
				System.out.println("Tiene derecho a 20 dias de vacaciones");
				
			} else {
				System.out.println("Aun no tiene derecho a vacaciones");
			}
			
		} else if (clave == 2) {
			if (antiguedad == 1) {
				System.out.println("Tiene derecho a 7 dias de vacaciones");
				
			} else if (antiguedad >= 2 && antiguedad <= 6) {
				System.out.println("Tiene derecho a 15 dias de vacaciones");
				
			} else if (antiguedad == 7) {
				System.out.println("Tiene derecho a 22 dias de vacaciones");
				
			} else {
				System.out.println("Aun no tiene derecho a vacaciones");
			}
			
		} else if (clave == 3) {
			if (antiguedad == 1) {
				System.out.println("Tiene derecho a 10 dias de vacaciones");
				
			} else if (antiguedad >= 2 && antiguedad <= 6) {
				System.out.println("Tiene derecho a 20 dias de vacaciones");
				
			} else if (antiguedad == 7) {
				System.out.println("Tiene derecho a 30 dias de vacaciones");
				
			} else {
				System.out.println("Aun no tiene derecho a vacaciones");
			}
		}
	}

}
