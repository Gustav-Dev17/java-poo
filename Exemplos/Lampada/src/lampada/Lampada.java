package lampada;

public class Lampada{
    boolean estadoDaLampada = false; //indica se a lampada esta ligada (inicia desligada)

    void acende() {//acende a lampada
        estadoDaLampada = true;
    }

    void apaga() {//apaga a lampada
        estadoDaLampada = false;
    }

    void mostraEstado() {
        if (this.estadoDaLampada) {//mostra o estado da lampada
            System.out.println("A lampada esta acesa");
        } else {
            System.out.println("A lampada esta apagada");
        }
    }
        public static void main(String[] args) {
            Lampada lampada=new Lampada();
            
            lampada.mostraEstado();
            lampada.acende();
            lampada.mostraEstado();
            lampada.apaga();
            lampada.mostraEstado();
        
    }
}


