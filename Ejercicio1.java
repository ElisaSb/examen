import java.util.Scanner;
/**Ejercicio 1
 * @author Elisa
 * @version 0.1 */
public class Ejercicio1 {
	public static void main (String[] args) {
	//int[] numeros = new int[3];
	System.out.println("Introduzca 3 numeros enteros");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	System.out.println(num1);
	mostrarNumero(num1, num2, num3);
	System.out.println("");
		sc.close();
	}
	public static void mostrarNumero(int valor, int inc, int col){
		for (int i=1;i<10;i++){
				//if (i % col == 0)
				System.out.println(valor += inc);
		}
	}	
}
		

