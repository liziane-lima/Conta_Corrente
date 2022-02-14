/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta_corrente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Conta {
    private Integer agencia;
    private Integer numero;
    private Double saldo;
    private Double limiteChequeEspecial;
    private List<Movimento> movimentos;
    
    public Conta(){
        this.saldo = 0D;
        this.movimentos = new ArrayList<>();
    }
    
    public Integer getAgencia(){
        return agencia;
    }
    
    public void setAgencia(Integer agencia){
        this.agencia = agencia;
    }
    
    public Integer getNumero(){
        return numero;
    }
    
    public void setNumero(Integer numero){
        this.numero = numero;
    }
    
    public Double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
    
    public Double getLimiteChequeEspecial(){
        return limiteChequeEspecial;
    }
    
    public void setLimiteChequeEspecial(Double limiteChequeEspecial){
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
    public List<Movimento> getMovimentos(){
        return movimentos;
    }
    
    public void setMovimentos(List<Movimento> movimentos){
        this.movimentos = movimentos;
    }
    
    public String toString(){
        return "Agencia:" + agencia +
                ", Número da conta: " + numero + 
                "\nSaldo atual: " + String.format("R$ %,.2f", saldo) +
                "\nMovimentos:" + movimentos;
                
    }

   
}
