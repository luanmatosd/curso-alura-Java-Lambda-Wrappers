package br.com.alura.classes;

public class ContaPoupanca extends Conta{

    //Invocando o construtor da Classe Super: Conta
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    //Invocando um método abstrato da Classe Conta
    @Override
    void deposita(double valor) {
        super.saldo += valor;
    }
}
