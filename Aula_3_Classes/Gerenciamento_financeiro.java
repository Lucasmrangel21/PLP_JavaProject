/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel_carro;
/**
 *
 * @author Acer
 */
public class Gerenciamento_financeiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta_corrente conta1 = new Conta_corrente();
        
        conta1.numeroConta = 52123;
        conta1.nomeCliente = "Jose Pereira";
        conta1.nomeBanco = "Caixa";
        conta1.nomeAgencia = "2132";
        conta1.saldo = 9221.33;
        
        System.out.printf("Informações da conta\n nome do cliente: %s\n numero da conta: %d\n nome do banco: %s\n nome da agencia: %s\n saldo: R$%f\n",conta1.nomeCliente,conta1.numeroConta,conta1.nomeBanco,conta1.nomeAgencia,conta1.saldo);
    }
    
}
