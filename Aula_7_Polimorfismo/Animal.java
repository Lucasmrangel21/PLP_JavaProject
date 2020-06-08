
package Polimorfismo;

public abstract class Animal {
    public String nome;
    public int numeroPatas;
    
    public abstract String emitirSom();
    
    public String toString(){
        return "A " + this.nome +" que tem "+this.numeroPatas+" patas, faz "+this.emitirSom();
}
    
}

