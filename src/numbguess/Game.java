package numbguess;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Inicia o jogo
		Interface jogo = new Interface(); // Pede o input do usuário
		
		while (true){
			jogo.generateNumber(); //Gerar o numero antes do chute é algo importante
			String[] entrada = jogo.game();
			
			if (entrada[1].equals("s")) {
				Command.console(entrada[0], jogo); //codigo do comando
			}else if (entrada[1].equals("i")){
				jogo.guess(Integer.parseInt(entrada[0])); // Chuta o número
			}
			
			Interface.escape();
		}
	}

}
