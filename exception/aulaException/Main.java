package aulaException;

import aulaException.banco.Banco;
import aulaException.banco.ContaCorrente;
import aulaException.banco.exceptions.ContaInexistenteException;
import aulaException.banco.exceptions.ValorInvalidoException;

public class Main{

    public static void main(String[] args){

        Banco UCBank = new Banco();
        UCBank.abrirConta("conta1");
        try {
            UCBank.depositar("conta1", 20.0);
        } 
         catch (ContaInexistenteException e) {
            // TODO: handle exception
            System.out.println(/* "Conta não localizada. Verifique os dados."*/e);
        }
        catch (ValorInvalidoException e) {
            // TODO: handle exception
            System.out.println(/* "Algo deu errado. Tente novamente!"*/);
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Algo deu errado. Tente novamente!");
        }
        
    }
}