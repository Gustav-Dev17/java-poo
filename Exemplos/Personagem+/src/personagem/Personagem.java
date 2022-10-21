/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagem;

public class Personagem {
    String nome;
    
    public Personagem (String s){
        nome = s;
    }
    public String getNome(){
        return nome;
    }
@Override
    public boolean equals (Object obj){
        Personagem p = (Personagem) obj;
        return this.nome.equals(p.getNome());
    }
}

