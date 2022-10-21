
package personagem;

public class Main {
    public static void main(String[] args) {
       Personagem p1 = new Personagem("Mario");
       Personagem p2 = new Personagem("Maria");
       
       System.out.println(p1.equals(p2));
    }
    
}
