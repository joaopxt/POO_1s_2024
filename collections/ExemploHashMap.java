package collections;
import java.util.HashMap;

public class ExemploHashMap{

    public static void main(String[] args){
        HashMap<String, String> capitais = new HashMap<>();

        capitais.put("Brasil", "Brasilia");
        capitais.put("Irlanda", "Dublin");
        capitais.put("Africa do Sul", "Cabo Verde");

        System.out.println(capitais.get("Brasil"));

        if(capitais.containsKey("Irlanda")){
            System.out.println("A chave ESTÁ no mapa");
        }else{
            System.out.println("A chave NÃO está no mapa");
        }

        for (String chave : capitais.keySet()){
            System.out.println(chave + " - " + capitais.get(chave));
        }
    }
}