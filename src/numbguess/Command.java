package numbguess;

import java.util.Random;

public class Command {
	static void console(String comando, Interface jogo) {
	 if (comando.equals("e")) {
		 int pontos = jogo.points();
		 
		 System.out.print("Voc� consegiu "+pontos+" ponto(s)");
		 
		 System.exit(300);
	 	}else if (comando.equals("h")){
		 Random geradorNumero = new Random();
		 int opt = geradorNumero.nextInt(3); // Vai gerar a dica que ser� enviada
		 
		 if (opt == 0) {
			 System.out.print("O n�mero vai de 0 a "+jogo.maximum()); //dica 1: o range
		 }
		 
		 if (opt == 1) {
			 /*
			  * A quantidade de digitos no numero
			  */
			 String strDigito = ""+jogo.number();
			 
			 System.out.print("O n�mero tem "+strDigito.length()+" digito(s)");
		 }
		 
		 if (opt == 2) {
			 // Se o numero � par
			 System.out.print("O numero � ");
			 
			 if (jogo.number()%2==0) {
				 System.out.print("par!");
			 }else {
				 System.out.print("�mpar!");
			 }
		 }
	 }
	}
}
