package org.gabriepaizante;

import java.text.SimpleDateFormat;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        numeroPar();
        //StringIgual();
    }

    private  static void numeroPar(){
        Integer numero = 3;

        if (numero % 2 == 0){
            // executo codigo aqui quando verdadeiro
            System.out.println("par");
        }else{
            // executo aqui quando falso
            System.out.println("impar");

        }
    }
}