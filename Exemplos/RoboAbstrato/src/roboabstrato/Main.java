package roboabstrato;

public class Main {
    
    public static void main(String[]args){
        
        RoboSimples exp = new RoboSimples("Explorer", 0, 0, (short) 90);
        
        exp.move(10);
        exp.mudaDirecao((short) 180);
        exp.move();
        exp.move();
        System.out.println(exp);
        
        RoboABateria walk = new RoboABateria("Walker", 0, 0, (short) 90, 111);
        
        walk.move(10);
        walk.mudaDirecao((short)180);
        walk.move();
        walk.move();
        System.out.println(walk);
    }
}
