
package pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String vNome, int vIdade){
        nome = vNome;
        idade = vIdade;
        //Getters
    }
        public String getNome(){
            return nome;
        }
        public int getIdade(){
            return idade;
        }
        //Setters
        public void setNome(String value){
            if(!value.isEmpty()) nome = value;
        }
        public void setIdade(int value){
            if(value>=0) idade = value;
        }
        //Class pessoa
}
