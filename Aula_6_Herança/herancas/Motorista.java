/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancas;

/**
 *
 * @author Acer
 */
public class Motorista extends Pessoa{
    private String cnh;
    
    public Motorista(String nome, String cpf, String _cnh) {
        super(nome, cpf);
        this.cnh = _cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    
    
}
