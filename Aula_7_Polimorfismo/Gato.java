/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author Acer
 */
public class Gato extends Animal{
    private String nome;
    private int numeroPatas;
    
    public Gato(){
        this.nome="gato";
        this.numeroPatas=4;
    }

    @Override
    public String emitirSom() {
        return "miau";
    }
    
}
