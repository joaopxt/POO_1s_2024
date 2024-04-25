package aula_heranca;


import aula_heranca.empresa.Engenheiro;
import aula_heranca.empresa.Gerente;
import aula_heranca.empresa.Diretor;


public class Sistema{

    public static void main(String[] args){
        
        Engenheiro eng1 = new Engenheiro("Joao", 890614113, 982477725, "MEUCREA", "Projeto 1", 5000.00 );
        Engenheiro eng2 = new Engenheiro("Pedro", 890615175, 982609080, "MEUCREA2", "Projeto 2", 8000.00 );
        Gerente gr1 = new Gerente("JV", 123, 123, 10000.00, 5);
        Diretor dr1 = new Diretor("Cris", 124, 124, 20000.00, 4);


        System.out.println(eng1);
        System.out.println(eng2);
        System.out.println(gr1);
        System.out.println(dr1);


    }
}