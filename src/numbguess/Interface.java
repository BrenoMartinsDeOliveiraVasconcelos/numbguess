package numbguess;
import java.util.Scanner;
import java.util.Random;

public class Interface {
	private static Scanner entrada = new Scanner(System.in); // Vari�vel scanner da calsse interface
	private static int pontos = 0;
	private static int numero = 0;
	private static int max = 10; //maximo
	private static boolean gerarNumero = true;
	
	String[] game() {
		/*
		 * Retorna um array com 2 elementos. Um com o input e o outro com o tipo do input
		 */
		String entradaUsuario = "";
		String[] saida = {"", ""}; //O que vai ser mandado para o output
		
		System.out.print("Chute: ");
		entradaUsuario = entrada.nextLine(); //Pega a entrada
		
		saida[0] = entradaUsuario; //o primeiro elemento � a entrada em si
		try {
			Integer.parseInt(entradaUsuario); //Vai tentar passar para inteiro
			saida[1] = "i"; //i � inteiro
		}catch (NumberFormatException e) {
			saida[1] = "s"; //s � String
		}
		
		return saida;
	}
	
	static void escape() {
		/*
		 * Quebra a linha do console
		 */
		System.out.print("\n");
	};
	
	void generateNumber() {
		/*
		 * Vai gerar o n�mero aleat�rio entre o zero e o m�ximo
		 */
		Random gerador = new Random();
		
		if (gerarNumero) {
			numero = gerador.nextInt(max+1);
		}
	};
	
	void guess(int chute) {
		/*
		 * Vai chutar
		 */
		
		if (chute == numero) {
			max += 10;
			pontos += 1;
			System.out.print("Voc� acertou!");
			gerarNumero = true;
		}else {
			System.out.print("Voc� errou!");
			gerarNumero = false;
		}
	}
	
	int points() {
		/*
		 * Getter para pontos
		 */
		return pontos;
	}
	
	int number() {
		return numero;
	}
	
	int maximum(){
		return max;
	}
}
