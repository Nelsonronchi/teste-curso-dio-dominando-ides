package br.com.dio;


import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O Problema", 300);
        System.out.println(livro1);
        //        int a = 5;
//        int b = 3;
//        System.out.println("Hellow word" + (a + b));
    }


}
