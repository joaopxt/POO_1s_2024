package collections;

import java.util.ArrayList;

public class ExemploArrayList{

    public static void main (String[] args){
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Joao");
        nomes.add("Pedro");
        nomes.add("Cris");

        System.out.println(nomes.get(0));

        for (String n : nomes){
            System.out.println(n);
        }

        if(nomes.contains("Cris")){
            System.out.println("O nome ESTÁ na lista");
        }else{
            System.out.println("O nome NÃO está na lista");
        }

        nomes.remove(2);

        if(nomes.contains("Cris")){
            System.out.println("O nome ESTÁ na lista");
        }else{
            System.out.println("O nome NÃO está na lista");
        }

    }
}