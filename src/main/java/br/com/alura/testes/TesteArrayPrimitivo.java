package br.com.alura.testes;

public class TesteArrayPrimitivo {
    public static void main(String[] args) {

        //Forma clássica
        int[] idades = new int[5];

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        //Forma literal
        int[] refs = {1,2,3,4,5};

        for (int i = 0; i < refs.length; i++) {
            refs[i] = i * 2;
        }

        System.out.println("-------------------");

        for (int i = 0; i < refs.length; i++) {
            System.out.println(refs[i]);
        }
    }
}
