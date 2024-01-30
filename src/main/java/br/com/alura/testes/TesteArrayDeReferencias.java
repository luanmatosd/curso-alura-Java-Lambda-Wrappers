package br.com.alura.testes;

import br.com.alura.classes.Conta;
import br.com.alura.classes.ContaCorrente;
import br.com.alura.classes.ContaPoupanca;

public class TesteArrayDeReferencias {
    public static void main(String[] args) {

        //Criando Array
        Conta[] arrayContas = new Conta[5];

        //Criando Objeto do tipo br.com.alura.classes.Conta Corrente. Variável cc1 referencia para esse novo
        //Posição 0 do Array se referencia para o mesmo Objeto da variável cc1
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        arrayContas[0] = cc1;

        //Criando Objeto do tipo br.com.alura.classes.Conta Corrente. Variável cc2 referencia para esse novo Objeto
        //Posição 1 do Array se referencia para o mesmo Objeto da variável cc2
        ContaCorrente cc2 = new ContaCorrente(22, 22);
        arrayContas[1] = cc2;

        System.out.println(arrayContas[0].getNumero());
        System.out.println(cc1.getNumero());
        System.out.println();

        //cc1 e arrayContas[0] se referenciam para o mesmo Objeto
        //Para enxergar a referência de memória, deletar o toString() da classe Conta
        System.out.println(arrayContas[0]);
        System.out.println(cc1);
        System.out.println();

        //Criando Objeto do tipo Conta Poupanca. Variável cp1 referencia para esse novo Objeto
        //Posição 2 do Array se referencia para o mesmo Objeto da variável cp1
        ContaPoupanca cp1 = new ContaPoupanca(322, 256);
        arrayContas[2] = cp1;

        System.out.println(cp1.getNumero());
    }
}
