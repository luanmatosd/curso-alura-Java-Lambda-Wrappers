package br.com.alura.classes;

public class ContaCorrente extends Conta{

    //Invocando o construtor da Classe Super: onta
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    //Invocando um método abstrato da Classe Conta
    @Override
    void deposita(double valor) {
        super.saldo += valor;
    }

    //Sobrescrevendo o método "saca" da Classe Super
    //Agora o saque tem um custo de 20 centavos para CC
    @Override
    boolean saca(double valor) {
        double valorDeSaque = valor + 0.2;
        return super.saca(valorDeSaque);
    }
}