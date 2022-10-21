package contabancaria;


public class ContaBancaria{
    //atributos (dados da conta)
    String nomeDoCorrentista;
    float saldo;
    boolean contaEspecial;
    //métodos
    void abreConta(String nome, float deposito, boolean especial) {
        this.nomeDoCorrentista = nome;
        this.saldo = deposito;
        this.contaEspecial = especial;
    }
    void abreConta(String nome){
        this.nomeDoCorrentista = nome;
        this.saldo = 0;
        this.contaEspecial = false;
    }
    void deposita(float valor) {
        this.saldo = this.saldo + valor;
    }
    void retira(float valor) {
        if (contaEspecial == false){
            if (saldo < valor)
                System.out.println("Saldo Insuficiente");
            else
                this.saldo = this.saldo - valor;
            }
        else
            this.saldo = this.saldo - valor;
    }
    void mostraDados() {
        System.out.println("O nome do corretista é: "+this.nomeDoCorrentista);
        System.out.println("O saldo é: "+this.saldo);
        if (this.contaEspecial)
            System.out.println("A conta é especial");
        else
            System.out.println("A conta não é especial");
    }
0
