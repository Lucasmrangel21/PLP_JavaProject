/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteHeranca;

import herancas.Motorista;

public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motorista objetomotorista = new Motorista("Jose", "55555555555", "6666666666");
        objetomotorista.setNome("Lucas");
        objetomotorista.setCpf("99999999999");
        
        System.out.println("Nome: "+objetomotorista.getNome()+" CPF: "+objetomotorista.getCpf());
    }
    
}
