package br.com.alura.testes;

import br.com.alura.classes.Conta;
import br.com.alura.classes.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TesteArrayEquals {
    public static void main(String[] args) {

        //Generics
        //List<Conta> lista = new LinkedList<>();
        //List<Conta> lista = new Vector<>();
        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc1 = new ContaCorrente(22, 22);
        Conta cc2 = new ContaCorrente(22, 22);

        //Adicionei apenas o cc1 e não o cc2
        lista.add(cc1);

        for(Conta conta : lista){
            System.out.println(conta);
        }

        //Retorna falso, porém, cc1 e cc2 tem a mesma agencia e mesmo numero
        //Contains por padrão não entende isso, sendo assim, necessário mudar a regra de negócio de "contains"
        //Olhando no Javadoc, contains utiliza o "equals", sendo assim, iremos sobrescrever o método equals na classe Conta
        boolean existe = lista.contains(cc2);
        System.out.println("Já existe? " + existe);

    }
}
