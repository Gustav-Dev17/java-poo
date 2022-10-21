package game_features;

public class Humano extends Personagem implements DefesasEspeciais{
	
	public static final byte MASCULINO = 1; //constante para masculino
	public static final byte FEMININO = 2; //constante para feminino
	public byte genero; //atributo que assumir� o valor de uma das constantes acima
	
	Humano(String nome, int numeroJog, int vidaAtual, int vidaMaxima, int posicaoX, int posicaoY, int ataquePadrao, boolean modoDefesa, byte gen){
		super(nome, numeroJog, vidaAtual, vidaMaxima, posicaoX, posicaoY, ataquePadrao, modoDefesa);
		this.vidaMaxima = 100;
		this.ataquePadrao = 10;
		genero = gen;
	}
	
	public void recebeAtaqueMenor(int ataque){ //m�todo onde o humano recebe somente 20% do dano convencional
		int ataqueMenor = 20/100*ataquePadrao;
		vidaAtual = vidaAtual-(int) ataqueMenor;
		System.out.println(""+nome+" recebeu um ataque mais fraco, e perdeu "+ataqueMenor+" de vida\n");
		System.out.println("Vida restante: "+vidaAtual+" \n");
	}
	public String toString(){ //m�todo que mostrar� em tela as informa��es do humano
		String resultado = "Jogador: "+numeroJog+" \n";
		resultado += "Personagem: Ser humano\n";
		switch(genero){
			case 1:
				resultado += "G�nero: Masculino\n";
				break;
			case 2:
				resultado += "G�nero: Feminino\n";
				break;
			default: //nenhum outro n�mero al�m daqueles das constantes poder� ser atribuido
				resultado = "G�nero inv�lido";
		}	
		resultado += super.toString();
		resultado += "Vida m�xima: "+vidaMaxima+" \n";
		resultado += "Ataque padr�o: "+ataquePadrao+" \n";
		return resultado;
	}
}
