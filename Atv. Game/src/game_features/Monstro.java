package game_features;

public class Monstro extends Personagem implements AtaquesEspeciais{
	
	public static final byte ANIMAL = 1; //constante para aniaml
	public static final byte ROBO = 2; //constante para rob�
	public static final byte MAGICO = 3; //constante para m�gico
	private byte tipo;
	
	Monstro(String nome, int numeroJog, int vidaAtual, int vidaMaxima, int posicaoX, int posicaoY, int ataquePadrao, boolean modoDefesa, byte tip){
		super(nome, numeroJog, vidaAtual, vidaMaxima, posicaoX, posicaoY, ataquePadrao, modoDefesa);
		this.vidaMaxima = 120;
		this.ataquePadrao = 15;
		tipo = tip;
	}
	
	public void atacarMaior(int ataque){ //m�todo que permite o monstro atacar com mais dano
		int ataqueMaior = 2*ataquePadrao;
		vidaAtual = vidaAtual-ataqueMaior;
		System.out.println(""+nome+" atacou, tirando cerca de "+ataqueMaior+" de vida do oponente\n");
		System.out.println("Vida restante: "+vidaAtual+" \n");
	}
	public String toString(){ //m�todo que mostrar� em tela as informa��es do monstro
		String resultado = "Jogador: "+numeroJog+" \n";
		resultado += "Personagem: Monstro\n";
		switch(tipo){
			case 1:
				resultado += "Tipo de Monstro: Animal\n";
				break;
			case 2:
				resultado += "Tipo de Monstro: Rob�\n";
				break;
			case 3:
				resultado += "Tipo de Monstro: M�gico\n";
				break;
			default: //nenhum outro n�mero al�m daqueles das constantes poder� ser atribuido
				resultado = "Tipo inv�lido";
		}	
		resultado += super.toString();
		resultado += "Vida m�xima: "+vidaMaxima+" \n";
		resultado += "Ataque padr�o: "+ataquePadrao+" \n";
		return resultado;
	}
}