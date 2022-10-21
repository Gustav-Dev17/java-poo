package game_features;

public class Luta {

	public static final int xMaximo =  30;
	public static final int xMinimo = -30;
	
	public static void iniciaLuta(Personagem jogador1, Personagem jogador2){ //m�todo que atribui os padr�es definidos e inicia
		jogador1.numeroJog = 1;
		jogador2.numeroJog = 2;
		jogador1.vidaAtual = jogador1.vidaMaxima;
		jogador2.vidaAtual = jogador2.vidaMaxima;
		jogador1.posicaoX = -10;
		jogador2.posicaoX = 10;
		jogador1.posicaoY = 0;
		jogador2.posicaoY = 0;
		
		System.out.println(jogador1.toString());
		System.out.println(jogador2.toString());
		System.out.println("A batalha come�ou!\n");
	}
	
	public static void verificar(Personagem jogador1, Personagem jogador2) { //m�todo que verifica a situa��o da luta e dos participantes
		if(jogador1.vidaAtual<=0){
			System.out.println("Vida de" + jogador1.nome+": "+ jogador1.vidaAtual+" \n");
			System.out.println("Personagem" +jogador1.nome+" foi derrotado\n");
			}
		if(jogador2.vidaAtual<=0){
			System.out.println("Vida de" + jogador2.nome+": "+ jogador2.vidaAtual+" \n");
			System.out.println("Personagem " +jogador2.nome+" foi derrotado\n");
			}
		else {System.out.println("A batalha ainda n�o terminou!");
		}
	}
}
	
	
