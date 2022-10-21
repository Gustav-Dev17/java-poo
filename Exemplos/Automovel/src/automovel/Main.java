
package automovel;

public class Main {
    public static void main(String args[]){
        Automovel a1 = new Automovel("Onix", "prata", (byte) 1);
        Automovel a2 = new AutomovelBasico("Gol", "preto", (byte) 2);
        Automovel a3 = new AutomovelDeLuxo("Hilux", "azul", (byte) 3);
        Automovel a4 = new AutomovelDeLuxo("Civic", "branco", (byte) 4,
        true, true, false, true, false, true);
        
        Concessionaria.imprime(a1);
        Concessionaria.imprime(a2);
        Concessionaria.imprime(a3);
        Concessionaria.imprime(a4);
    }
}
