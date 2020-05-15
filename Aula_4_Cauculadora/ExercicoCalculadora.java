
package aulaorientaçãoaobjeto.ExercicioCalculadora;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ExercicoCalculadora {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operacao operacao = new Operacao();
        int opcao = 1;
        int num1, num2;
        String menu = "Cauculadora\n\n"
                 +"1 - Soma\n"
                 +"2 - Subtração\n"
                 +"3 - Multiplicação\n"
                 +"4 - Divisão\n"
                 +"5 - Sair\n\n"
                 +"Digite a opção desejada: ";
        
        while (opcao != 0){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,menu,"Exercicio de calculadora", JOptionPane.QUESTION_MESSAGE));
            switch (opcao){
                case 1:
                    num1  = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero","Exercicio de calculadora",JOptionPane.QUESTION_MESSAGE));
                    num2  = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero","Exercicio de calculadora",JOptionPane.QUESTION_MESSAGE));
                    JOptionPane.showMessageDialog(null,"O resultado da soma foi: "+ operacao.soma(num1, num2));
                    break;
                case 2:
                    num1  = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero","Exercicio de calculadora",JOptionPane.QUESTION_MESSAGE));
                    num2  = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero","Exercicio de calculadora",JOptionPane.QUESTION_MESSAGE));
                    JOptionPane.showMessageDialog(null,"O resultado da subtração foi: "+ operacao.subtracao(num1, num2));
                    break;
                case 3:
                    num1  = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero","Exercicio de calculadora",JOptionPane.QUESTION_MESSAGE));
                    num2  = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero","Exercicio de calculadora",JOptionPane.QUESTION_MESSAGE));
                    JOptionPane.showMessageDialog(null,"O resultado da multiplicação foi: "+ operacao.multiplicacao(num1, num2));
                    break;
                case 4:
                    num1  = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero","Exercicio de calculadora",JOptionPane.QUESTION_MESSAGE));
                    num2  = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero","Exercicio de calculadora",JOptionPane.QUESTION_MESSAGE));
                    if (num1>=num2){
                        JOptionPane.showMessageDialog(null,"O resultado da divisão foi: "+ (float)operacao.divisao(num1, num2));
                    }else{
                        JOptionPane.showMessageDialog(null,"O resultado da divisão foi: "+ (float)operacao.divisao(num2, num1));
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"A calculadora será encerrada!!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Esta opção é inválida!!");
                    
            }
        }
        
    }
    
}
