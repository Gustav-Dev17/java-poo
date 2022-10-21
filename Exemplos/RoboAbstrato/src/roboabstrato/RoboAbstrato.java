package roboabstrato;

abstract class RoboAbstrato {
    
    private String nomeDoRobo;
    private int posicaoXAtual, posicaoYAtual;
    private short direcaoAtual;
    
    RoboAbstrato(String n, int px, int py, short d){
        nomeDoRobo = n;
        posicaoXAtual = px;
        posicaoYAtual = py;
        direcaoAtual = d;
    }
    
    public void move(){
        move(1);
    }
    
    public abstract void move(int passos);
    
    public void moveX(int passos){
        posicaoXAtual += passos;
    }
    
    public void moveY(int passos){
        posicaoYAtual += passos;
    }
    
    public void mudaDirecao(short novaDirecao){
        direcaoAtual = novaDirecao;
    }
    
    public short qualDirecaoAtual(){
        return direcaoAtual;
    }
    
    public String toString(){
        String resultado = "Nome do robô: "+nomeDoRobo+"\n";
        
        resultado = resultado+"Posição do robô:("+posicaoXAtual+","+posicaoYAtual+")\n";
        resultado = resultado+"Direção do robô: "+direcaoAtual;
        
        return resultado;
    }
}
