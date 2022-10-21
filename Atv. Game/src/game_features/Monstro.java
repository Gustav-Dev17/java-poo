package game_features;

public class Monstro extends Personagem implements AtaquesEspeciais{
	
	public static final byte ANIMAL = 1; //constante para aniaml
	public static final byte ROBO = 2; //constante para robô
	public static final byte MAGICO = 3; //constante para mágico
	private byte tipo;
	
	Monstro(String nome, int numeroJog, int vidaAtual, int vidaMaxima, int posicaoX, int posicaoY, int ataquePadrao, boolean modoDefesa, byte tip){
		super(nome, numeroJog, vidaAtual, vidaMaxima, posicaoX, posicaoY, ataquePadrao, modoDefesa);
		this.vidaMaxima = 120;
		this.ataquePadrao = 15;
		tipo = tip;
	}
	
	public void atacarMaior(int ataque){ //método que permite o monstro atacar com mais dano
		int ataqueMaior = 2*ataquePadrao;
		vidaAtual = vidaAtual-ataqueMaior;
		System.out.println(""+nome+" atacou, tirando cerca de "+ataqueMaior+" de vida do oponente\n");
		System.out.println("Vida restante: "+vidaAtual+" \n");
	}
	public String toString(){ //método que mostrará em tela as informações do monstro
		String resultado = "Jogador: "+numeroJog+" \n";
		resultado += "Personagem: Monstro\n";
		switch(tipo){
			case 1:
				resultado += "Tipo de Monstro: Animal\n";
				break;
			case 2:
				resultado += "Tipo de Monstro: Robô\n";
				break;
			case 3:
				resultado += "Tipo de Monstro: Mágico\n";
				break;
			default: //nenhum outro número além daqueles das constantes poderá ser atribuido
				resultado = "Tipo inválido";
		}	
		resultado += super.toString();
		resultado += "Vida máxima: "+vidaMaxima+" \n";
		resultado += "Ataque padrão: "+ataquePadrao+" \n";
		return resultado;
	}
}