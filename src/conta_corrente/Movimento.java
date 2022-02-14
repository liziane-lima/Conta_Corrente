/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta_corrente;

import enums.Tipo;

/**
 *
 * @author User
 */
public class Movimento {
    private Tipo tipo;
    private Double valor;
    private String descricao;
    
    public Tipo getTipo(){
        return tipo;
    }
    
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }
    
    public Double getValor(){
        return valor;
    }
    
    public void setValor(Double valor){
        this.valor = valor;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String toString(){
        return "\nMovimento de " + tipo +
               " no valor " + String.format("R$ %,.2f", valor) +
               " descricao " + descricao;
    }
}
