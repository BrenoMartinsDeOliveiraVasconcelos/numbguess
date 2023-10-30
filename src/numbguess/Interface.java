package numbguess;
import java.util.Scanner;
import java.util.Random;

public class Interface {
	private static Scanner entrada = new Scanner(System.in); // Vari�vel scanner da calsse interface
	private static int pontos = 0; //� do tipo double por causa que divide em uma parte do c�digo
	private static int numero = 0;
	private static int max = 10; //maximo
	private static boolean gerarNumero = true;
	private static int tentativas = 0;
	private static int pontosAdicionados = 10; //Pontos adicionados. Come�a com 10 e vai aumetando de 10 em 10.
	
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
			pontos += (pontosAdicionados - tentativas); //Quanto mais tentativas, menos adiciona.
			System.out.print("Voce acertou!");
			tentativas = 0;
			gerarNumero = true;
			pontosAdicionados += max; //A cada acerto, o n�mero de pontos adicionados aumenta.
		}else {
			System.out.print("Voce errou!");
			gerarNumero = false;
		}
		
		tentativas++; //Cada chamada para a fun��o aumenta uma tentativa
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
