package practica0;

/*Escribir un método static String sinRepetidos(String s) que dada una cadena, devuelve
una nueva cadena donde cada uno de los caracteres que aparecían en s, aparecen sólo una vez.
Se debe mantener la posición relativa de los caracteres: para aquellos que se encuentren repetidos
puede conservarse cualquiera de sus apariciones. Por ejemplo, para la palabra ‘‘casos’’ puede
devolver ‘‘caso’’ o ‘‘caos’’, conservando la primera o la segunda letra s respectivamente.*/

import java.util.Scanner;

public class Ejercicio22 {
	
	public static String sinRepetidos (String s) {
		
		s = s.toLowerCase();
		
		String revisados = "";
		
		String cadnew="";
		
		for (int i = 0; i<=s.length()-1;i++) {
			if (! revisados.contains(""+ s.charAt(i))) {
				revisados += s.charAt(i);
				cadnew += s.charAt(i);
			}
		}
		return cadnew;
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		
		System.out.println(sinRepetidos(palabra));
		
		scan.close();

	}

}
