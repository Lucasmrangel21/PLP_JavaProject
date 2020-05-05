package aluguel_carro;

public class Cliente {
   int idCliente;
   String cpf;
   String nome;
   String cnh;

    public Cliente() {
    }

    public Cliente(int idCliente, String cpf, String nome, String cnh) {
        this.idCliente = idCliente;
        this.cpf = cpf;
        this.nome = nome;
        this.cnh = cnh;
    }

    public Cliente(int idCliente, String cpf) {
        this.idCliente = idCliente;
        this.cpf = cpf;
    }
    
   
}
