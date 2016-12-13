import java.util.Scanner;
public class Ejercicio2 {
	public static void main (String[] args) {
	System.out.println("Introduzca una palabra:");
	Scanner sc = new Scanner(System.in);
	String palabra = sc.next();	
	sc.close();
	contarVocales(palabra);
	comprobarTildes(palabra);
	ponerMinuscula(palabra);
	ponerMayuscula(palabra);
	}
	public static void ponerMinuscula(String word){
		System.out.println("La palabra en minuscula es "+word.toLowerCase());
	}
	public static void ponerMayuscula(String word){
		System.out.println("La palabra en mayuscula es "+word.toUpperCase());
	}
	public static void contarVocales(String word){
		int contador = 0;
		for (int i=1;i<=word.length();i++){
			char letra = word.charAt(word.length()-i);
			switch (letra) {
				//vocales
				case 'a' : contador++;
					break;
				case 'e' : contador++;
					break;
				case 'i' : contador++;
					break;
				case 'o' : contador++;
					break;
				case 'u' : contador++;
					break;
				case 'A' : contador++;
					break;
				case 'E' : contador++;
					break;
				case 'I' : contador++;
					break;
				case 'O' : contador++;
					break;
				case 'U' : contador++;
					break;
			}
		}
		System.out.println("La palabra "+word+" tiene "+contador++ +" vocales.");
	}
	/*Esta parte me da error al compilar
	 * incluso dentro de un comentario
	 * y no he podido comprobar su funcionamiento
	 * pero el resto de partes funciona perfectamente
	 * public static boolean comprobarTildes(String word){
		for (int i=1;i<=word.length();i++){
			char letra = word.charAt(word.length()-i);
			switch (letra) {
				//tildes
				case 'á' : return true;
					break;
				case 'é' : return true;
					break;
				case 'í' : return true;
					break;
				case 'ó' : return true;
					break;
				case 'ú' : return true;
					break;
				case 'Á' : return true;
					break;
				case 'É' : return true;
					break;
				case 'Í' : return true;
					break;
				case 'Ó' : return true;
					break;
				case 'Ú' : return true;
					break;
				default : return false;
				break;
			}
		}
	}*/
}

