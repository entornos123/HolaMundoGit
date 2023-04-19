package adivina;
import java.util.Scanner;
public class adivina {
    public static final int rangoNumeros = 10;
	static int result;
    private static int intentos = 2;
	public static boolean t;
    public static boolean Comprobacion(int a) {
        t = true;
        if (a == adivina.result) {
            t = true;
        } else {
            t = false;
        }
        return t;
    }
    public static void main(String[] args) {

        int numero;
        String entrada;
        Scanner scan = new Scanner(System.in);
        result = (int) (Math.random() * rangoNumeros);
  
        do {
            System.out.print("Introduzca un número entero del 1 al 10: ");
            entrada = scan.nextLine();
            numero = Integer.parseInt(entrada);
            if (adivina.Comprobacion(numero) == true) {
                System.out.println("Lo has logrado jefe");
                break;

            }
            setIntentos(getIntentos() - 1);
            System.out.printf("Fallaste. Te quedan %d intentos.", getIntentos());

        } while (getIntentos() > 0);
    }
	static int getIntentos() {
		return intentos;
	}
	static void setIntentos(int intentos) {
		adivina.intentos = intentos;
	}
}