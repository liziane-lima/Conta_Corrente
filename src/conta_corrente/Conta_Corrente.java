/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta_corrente;

import enums.Tipo;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Conta_Corrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TransacaoException {
        // TODO code application logic here
        Conta conta = new Conta();
        conta.setAgencia(12);
        conta.setNumero(123456);
        conta.setLimiteChequeEspecial(200d);
        
        Correntista correntista = new Correntista();
        correntista.setConta(conta);
        correntista.setNome("Testando programa");
        
        leMovimentos(correntista);
    }
    
    public static void leMovimentos(Correntista correntista) throws TransacaoException{
        String operacao;
        
        ControleTransacao controleTransacao = new ControleTransacao(correntista.getConta());
        
        do{
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe a operação a realizar (d - Débito, c - Crédito, i - Imprimir extrato e s - Sair)");
                operacao = scanner.nextLine().toLowerCase().trim();
                Movimento movimento = new Movimento();
                switch (operacao) {
                    case "d":
                        movimento.setTipo(Tipo.DEBITO);
                        break;
                    case "c":
                        movimento.setTipo(Tipo.CREDITO);
                        break;
                    case "i":
                        imprime(correntista.getConta());
                        continue;
                    case "s":
                        System.out.println("Operação inválida");
                        continue;
                        
                }
                
                System.out.println("Infome o valor do movimento");
                scanner = new Scanner(System.in);
                Double valor = scanner.nextDouble();
                movimento.setValor(valor);
                
                System.out.println("Informe a descrição do movimento");
                scanner = new Scanner(System.in);
                String descricao = scanner.nextLine();
                movimento.setDescricao(descricao);
                
                controleTransacao.validaTransacao(movimento);
                controleTransacao.movimenta(movimento);
                
            } catch (InputMismatchException e){
                operacao = "";
                System.out.println("O valor informado é inválido" + e.getMessage());
            } catch (Exception e){
                operacao = "";
                System.out.println("Houve um erro ao processar sua solicitação \n" + e.getMessage());
            }
        } while (!operacao.equalsIgnoreCase("s"));
        System.out.println("Saiu");
    }
    
    private static void imprime(Conta conta){
        List<Movimento> movimentos = conta.getMovimentos();
        
        for (int i = 0; i < movimentos.size() ; i++) {
            Movimento movimento = movimentos.get(i);
            System.out.printf("Movimento de %s no valor de R$ %,.2f referente a %s \n", movimento.getTipo(), movimento.getValor(), movimento.getDescricao());
        }
        System.out.printf("Saldo atual em conta corrente é de R$ %,.2f \n", conta.getSaldo());
    }
    
}
