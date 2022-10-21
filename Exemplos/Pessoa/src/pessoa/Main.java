
package pessoa;

public class Main {
        public static void main(String[] args) {
            Pessoa p = new Pessoa("Ayrton",22);
            
            System.out.println(p.getNome());
            System.out.println(p.getIdade());
            p.setIdade(35);
            p.setNome("Gabriela");
            System.out.println(p.getNome());
           System.out.println(p.getIdade());
    }
}
