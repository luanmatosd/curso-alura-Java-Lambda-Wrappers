package br.com.alura.testes;

import java.util.ArrayList;
import java.util.List;

public class TestePrimitivoEObjeto {
    public static void main(String[] args) {

        //Array tipo primitivo
        int[] idades = new int[5];

        //Array do tipo Referencia
        String[] nomes = new String[5];

        int idade = 29;

        List numeros = new ArrayList();

        //Esse código não deveria funcionar. Estou adicionando um tipo primitivo como se fosse um Objeto
        //No Java, para cada tipo primitivo existe um Objeto = Wrapper
        //Tipo primimitivo: int -------> wrapper: java.lang.Integer = Autoboxing
        //Tipo primimitivo: int <------- wrapper: java.lang.Integer = unboxing

        //Acontece que o Java faz essa conversão debaixo dos panos
        //Converte de primitivo para Objeto e de Objeto para primitivo
        numeros.add(idade);

        //O que realmente acontece é isso aqui:
        Integer idadeRef = Integer.valueOf(idade); //Método que cria Objeto a partir do primitivo - Autoboxing
        int valor = idadeRef.intValue(); //Com o Objeto em mão, eu quero o primitivo - Unboxing

        Double doubleRef = Double.valueOf(28.98); //Isso é igual a Double doubleRef = 28.98
        System.out.println(doubleRef.doubleValue());


        Float floatRef = Float.valueOf(50.09f); //Isso é igual a  Float floatRef = 50.09f
        System.out.println(floatRef.doubleValue());
    }
}
