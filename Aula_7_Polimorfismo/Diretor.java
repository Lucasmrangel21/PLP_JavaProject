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
public class Diretor extends Funcionario{
    @Override
    public double getSalario(int horas){
        return horas*200;
    }
}
