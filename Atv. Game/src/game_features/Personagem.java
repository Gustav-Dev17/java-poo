package game_features;

public abstract class Personagem{
	
	String nome;
	int numeroJog, vidaAtual, vidaMaxima, posicaoX, posicaoY, ataquePadrao;
	boolean modoDefesa;
	
	Personagem(String nome, int numeroJog, int vidaAtual, int vidaMaxima, int posicaoX, int posicaoY, int ataquePadrao, boolean modoDefesa){
		this.nome = nome;
		this.numeroJog = numeroJog;
		this.vidaAtual = vidaAtual;
		this.vidaMaxima = vidaMaxima;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.ataquePadrao = ataquePadrao;
		this.modoDefesa = false; //o modo defesa inicia desativado
	}
	
	public String getNome(){ //m�todo get para nome
		return nome;
	}
	public void setnome(String value){
		if(!value.isEmpty()) nome = value; //m�todo set para nome
	}
	public int getNumeroJog(){ //m�todo get para n�mero do jogador
		return numeroJog;
	}
	public void setNumeroJog(int num){ //m�todo set para n�mero do jogador
		if((num==1)||(num==2)) numeroJog = num;
	}
	public int getVidaAtual(){ //m�todo get para vida atual
		return vidaAtual;
	}	
	public void recuperarVida(){ //m�todo para recupera��o de vida
		this.vidaAtual = vidaMaxima;
	}
	public void armarDefesa(){ //m�todo que ativa o modo defesa do personagem
		this.modoDefesa = true;
		System.out.println("O modo defesa de "+nome+" foi ativado\n");
	}
	public void desarmarDefesa(){ //m�todo que desativa o modo defesa do personagem
		this.modoDefesa = false;
		System.out.println("O modo defesa de "+nome+" foi desativado\n");
	}
	public void recebeAtaque(int ataque){ //m�todo para receber ataqye
		if(modoDefesa){
			int ataqueMenor = ataque*10/100;
			vidaAtual -= ataqueMenor;
			System.out.println(""+nome+" recebeu um ataque no modo defesa, perdendo "+ataqueMenor+" unidades de vida\n");
			System.out.println("Vida restante: "+vidaAtual+" \n");
			}
		else {
			vidaAtual = vidaAtual - ataquePadrao;
			System.out.println(""+nome+" recebeu um ataque sem se defender, perdendo "+ataque+" unidades de vida\n");
			System.out.println("Vida restante: "+vidaAtual+" \n");
			}
	}
	public void atacar(){
		System.out.println( ""+nome+" fez um gesto e ataque\n");
	}
	public void atacar(Personagem jogador) { //m�todo para ataque
		
		if(jogador.modoDefesa){
			float ataqueMenor = (int) ataquePadrao * 10/100;
			System.out.println(""+nome+ " atacou e causou a perda de " +ataqueMenor+ " unidade de vida do oponente\n");	
			jogador.vidaAtual -= ataqueMenor;
			System.out.println("Vida restante: "+jogador.vidaAtual+" \n");
		}
		else{
			System.out.println(""+ nome+" atacou e retirou cerca de "+ataquePadrao+" do rival\n");
			jogador.vidaAtual -= ataquePadrao;
			System.out.println("Vida restante: "+jogador.vidaAtual+" \n");
		}
	}
		
	public void andar(String coordenada){	 //m�todo que desloca o personagem no mapa cartesiano	
		if (coordenada=="direita"){
			if(posicaoX<Luta.xMaximo){
				posicaoX += 5;
				System.out.println(""+nome+" deslocou-se para a direita\n");
					}
			else{System.out.println(""+nome+" n�o se deslocou por estar no limite do mapa\n");}
		if (coordenada=="esquerda") {
			if(posicaoX>Luta.xMinimo) {
				posicaoX -= 5;
				System.out.println(""+nome+" deslocou-se para a esquerda\n");}
		else {System.out.println(""+nome+" n�o se deslocou por estar no limite do mapa\n");}		
			}
		}			
	}
			
	public void pular(){ //m�todo que faz o personagem pular
		this.posicaoY = posicaoY + 5;
		System.out.println(""+nome+" pulou\n");
	}
	public void cair() { //m�todo que faz o personagem cair
		posicaoY = 0;
		System.out.println(""+nome+" caiu\n");
	}
	
	public String toString(){ //m�todo que mostra dados em tela
		String resultado;
		resultado = "Nome do personagem: "+nome+" \n";
		resultado += "N�mero de Jogador: "+numeroJog+" \n";
		resultado += "Vida: "+vidaAtual+" \n";
		resultado += "Defesa: "+modoDefesa+" \n";
		resultado += "Coordenadas: "+posicaoX+", "+ posicaoY+" \n";
		return resultado;
	}	
}