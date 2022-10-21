package game_features;

public class Main{

	public static void main(String[] args){
		
		Humano h = new Humano("Marcos", 1, 50, 100, 15, 20, 10, false, (byte) 1); //informações atribuidas (podem ser alteradas)
		Monstro m = new Monstro("XyKNb-Monstro", 2, 30, 120, -5, 15, 15, true, (byte) 2);
		
		//abaixo estão as ações que ocorrerão no jogo conforme os métodos
		
		Luta.iniciaLuta(h, m);  //onde do método iniciaLuta não deve ser alterada
			h.recuperarVida(); m.andar("esquerda"); h.atacar(m); m.atacar(h);
			m.desarmarDefesa(); h.recebeAtaque(m.ataquePadrao);
			h.andar("direita"); m.cair(); m.andar("esquerda");
			h.recebeAtaqueMenor(m.ataquePadrao);
			m.atacarMaior(h.ataquePadrao); m.pular();
			h.atacar(m);
			m.atacar();
		Luta.verificar(h, m); //onde do método verificar não deve ser alterada
	}

}
