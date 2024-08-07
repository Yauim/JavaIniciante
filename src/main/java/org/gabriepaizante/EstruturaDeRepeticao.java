package org.gabriepaizante;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        //ListadePalavras();
        //forClassico();
        inverteString();
    }

    private static void ListadePalavras() {
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Zumba");
        palavrasList.add("Games");
        palavrasList.add("Jose");
        palavrasList.add("Lucas");

        for(String palavra : palavrasList){
            System.out.println(palavra);
        }

        palavrasList.forEach(palavra -> System.out.println(palavra));
    }

    private static void forClassico() {
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Zumba");
        palavrasList.add("Games");
        palavrasList.add("Jose");
        palavrasList.add("Lucas");

        for(int i = 0; i<palavrasList.size(); i++){
            System.out.println(palavrasList.get(i));
        }

        palavrasList.forEach(palavra -> System.out.println(palavra));
    }

    private static void inverteString() {
        String normal = "12345";

        String invertida = "";

        for(int posicao = normal.length() - 1; posicao >= 0; posicao = posicao - 1){
            invertida = invertida + normal.charAt(posicao);
        }

        System.out.println(invertida);
    }
}
