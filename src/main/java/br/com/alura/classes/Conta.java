package br.com.alura.classes;

public abstract class Conta {

    protected double saldo; //Protected - As classes filhas enxergam
    private int agencia;
    private int numero;
    private String titular;
    private static int contadorDeTotal;

    //Construtor
    public Conta(int agencia, int numero) {
        Conta.contadorDeTotal++;
        this.agencia = agencia;
        this.numero = numero;
    }

    //Método abstrato
    abstract void deposita(double valor);

    //Métodos
    boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //Exemplo de uso do Polimorfismo
    boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }

    //toString()
    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }

    //Sobrescrevendo o método equals da classe Object com a minha regra de negócio para utilizar no método "contains"
    @Override
    public boolean equals(Object ref){

        Conta outra = (Conta) ref; //Casting

        if(this.agencia != outra.agencia){
            return false;
        }

        if(this.numero != outra.numero){
            return false;
        }

        return true;
    }
}
