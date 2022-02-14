/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta_corrente;

/**
 *
 * @author User
 */
public class Correntista {
    private String nome;
    private Conta conta;
    
    public Correntista(){}
    
    public Correntista(Conta conta){
        this.conta = conta;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Conta getConta(){
        return conta;
    }
    
    public void setConta(Conta conta){
        this.conta = conta;
    }
}
