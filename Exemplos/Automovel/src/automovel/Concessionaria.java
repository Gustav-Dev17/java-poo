
package automovel;

public class Concessionaria {
    public static void imprime(Automovel a){
        tipoDeCarro(a);
        System.out.println("Seguem os dados do automóvel escolhido");
        System.out.print(a);
        System.out.println("Valor: "+a.quantoCusta());
        System.out.println(a.quantasPrestacoes()+" prestações de "+
         (a.quantoCusta()/a.quantasPrestacoes())+"\n");
    }
    public static void tipoDeCarro(Automovel a){
        if (a instanceof AutomovelDeLuxo)
            System.out.println("Automóvel de luxo");
        else if (a instanceof AutomovelBasico)
            System.out.println("Automóvel básico");
        else
            System.out.println("Automóvel comum");
    }
}
