/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteHeranca;

import herancas.Cachorro;
import herancas.Gato;

/**
 *
 * @author Acer
 */
public class testeHerancaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        
        cachorro.setNome("Lupy");
        cachorro.setRaca("Fox");
        gato.setNome("Yuki");
        
        System.out.println("O cachorro "+cachorro.getNome()
                           +" da raça "+cachorro.getRaca()
                           +" faz "+cachorro.late());
    }
    
}
