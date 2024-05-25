package aulaException.banco.exceptions;

public class ContaInexistenteException extends Exception {
    public ContaInexistenteException(){
        super("Conta não localizada. Verifique os dados.");
    }
}
