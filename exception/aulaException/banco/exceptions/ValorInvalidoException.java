package aulaException.banco.exceptions;

public class ValorInvalidoException  extends Exception{
    
    public ValorInvalidoException(){
        super("Valor do depósio inválido. Informe um número positivo.");
    }

}
