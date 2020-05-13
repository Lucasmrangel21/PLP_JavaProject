package aulaorientaçãoaobjeto.exerciciocontacorrente;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ExemploContaCorrente {

    
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        Scanner input = new Scanner(System.in);
        conta.definirSaldoInicial(1000);
        int opcao = 1;
        float valor = (float)0.0;
        String menu = "Programa de conta corrente\n\n"
                 +"1 - Sacar valor\n"
                 +"2 - Depositar valor\n"
                 +"3 - Consultar saldo\n"
                 +"4 - Finalizar\n\n"
                 +"Digite a opção desejada: ";
        
        while (opcao != 0){
            
            opcao=Integer.parseInt(JOptionPane.showInputDialog(null, menu,"Exercício de Conta Corrente", JOptionPane.QUESTION_MESSAGE));
            switch(opcao){
                case 1:
                    valor =Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor que deseja sacar: ", "Exercicio conta corrente", JOptionPane.QUESTION_MESSAGE));
                    boolean temSaldo = conta.sacar(valor);
                    if (temSaldo==true){
                        JOptionPane.showMessageDialog(null,"O saque foi realizado com sucesso!\nO saldo atual é: "+conta.saldo);
                    }else{
                        JOptionPane.showMessageDialog(null,"O saque não foi realizado! Saldo insuficiente!\nO saldo atual é: "+conta.saldo);
                    }
                    break;
                case 2:
                    valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor que deseja depositar: ", "Exercicio conta corrente",JOptionPane.QUESTION_MESSAGE));
                    conta.depositar(valor);
                    JOptionPane.showMessageDialog(null,"O deposito foi realizado com sucesso!\nO saldo atual é: "+conta.saldo);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"O saldo atual é: "+conta.saldo);
                    //System.out.println("O saldo atual é: " +conta.saldo);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"O programa será finalizado");
                    System.exit(0);
                    break;
                default:
                     JOptionPane.showMessageDialog(null, "Opção Inválida\nSelecione uma opção do Menu","Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        System.out.println("Programa Finalizado");
    }
    
}
