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
public class Aluguel_carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        cliente1.idCliente = 1;
        cliente1.nome = "Gabriel Ferraz";
        cliente1.cpf = "37281924721";
        cliente1.cnh = "17223217016";
        
        cliente2.idCliente = 2;
        cliente2.cpf = "82914362719";
        cliente2.nome = "Juvenal de Almeida";
        cliente2.cnh = "37261425321";
        
        carro1.idCarro = 1;
        carro1.placa = "JKL-5862";
        carro1.fabricante = "Fiat";
        carro1.modelo = "Argo";
        carro1.ano = 2019;
        carro1.cor = "vermelho";
        carro1.valorDiaria = (float) 250.32;
        
        carro2.idCarro = 2;
        carro2.placa = "GHT-4162";
        carro2.fabricante = "Fiat";
        carro2.modelo = "Cronos";
        carro2.ano = 2019;
        carro2.cor = "branco";
        carro2.valorDiaria = 300;
        
        System.out.println("O nome do primeiro cliente é "+cliente1.nome+" e ele quer alugar o carro "+carro1.modelo+" de placa "+carro1.placa);
        System.out.println("O nome do segundo cliente é "+cliente2.nome+" e ele quer alugar o carro "+carro2.modelo+" de placa "+carro2.placa);
    }
    
}
