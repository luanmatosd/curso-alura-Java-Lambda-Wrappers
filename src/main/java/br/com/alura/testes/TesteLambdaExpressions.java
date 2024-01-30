package br.com.alura.testes;

import br.com.alura.classes.Conta;
import br.com.alura.classes.ContaCorrente;
import br.com.alura.classes.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLambdaExpressions {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Conta cc2 = new ContaPoupanca(22, 44);
        Conta cc3 = new ContaCorrente(22, 11);
        Conta cc4 = new ContaPoupanca(22, 22);

        List<Conta> lista = new ArrayList<>();

        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        //Percorrendo array sem ordenação
        for (Conta conta : lista) {
            System.out.println(conta);
        }

        System.out.println("---------");

        //Método de ordenação
        //lista.sort(new NumeroDaContaComparator());

        //Lambda Expressions usando "->"
        lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

        /*Percorrendo array sem ordenação
        for (Conta conta : lista) {
            System.out.println(conta);
        }*/

        //Percorrendo o Array com Lambda Expression
        lista.forEach(conta -> System.out.println(conta));
    }
}

/*
Necessário implementar a Classe "Comparator" para definir nossa regra de comparação

Essa classe foi comentada porque não há usos expressivos dela
apenas uma vez no métodolista.sort(new NumeroDaContaComparator())
Sendo assim, como é chamada apenas uma vez, basta criar uma Lambda Expression

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        /*Forma robusta de se fazer
        if (c1.getNumero() < c2.getNumero()) {
            return -1;
        }
        if (c1.getNumero() > c2.getNumero()) {
            return 1;
        }
        return 0;

        //Forma inteligente
        return Integer.compare(c1.getNumero(), c2.getNumero());
    }
}
*/