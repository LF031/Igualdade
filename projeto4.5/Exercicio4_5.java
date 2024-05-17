import java.util.*;
public class Exercicio4_5 {

	public static void main(String[] args) {
		// 1 - variaveis
		String jogador1;
		String jogador2;
		Scanner leia = new Scanner(System.in);
		
		do {
			// 2 - entrada de dados
			System.out.print("Digite a jogada do jogador 1: ");
			jogador1 = leia.next();			
			System.out.print("Digite a jogada do jogador 2: ");
			jogador2 = leia.next();	
			
			if ( ! jogador2.equals("pedra") && ! jogador2.equals("papel") && ! jogador2.equals("tesoura") ||
					! jogador1.equals("pedra") && ! jogador1.equals("papel") && ! jogador1.equals("tesoura")) {
				System.out.println("Jogo terminado");
				break;
			}
			
			// 3 - calculos
			if (jogador1.equals(jogador2)) {
				System.out.println("Empate!");
			} else {
				if (jogador1.equals("pedra") && jogador2.equals("tesoura") || 
						jogador1.equals("tesoura") && jogador2.equals("papel") || 
						jogador1.equals("papel") && jogador2.equals("pedra")) {
					System.out.println("Jogador 1 venceu o jogo!");
				} else {
					System.out.println("Jogador 2 venceu o jogo!");
				}
			}
			System.out.println();
		}while(true);

	}

}
