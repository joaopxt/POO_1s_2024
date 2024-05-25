package aulaException.banco;

import java.util.ArrayList;

import aulaException.banco.exceptions.ContaInexistenteException;
import aulaException.banco.exceptions.ValorInvalidoException;

public class Banco {
    
    private ArrayList<ContaCorrente> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void abrirConta(String nomeConta){
        ContaCorrente conta = new ContaCorrente(nomeConta);
        this.contas.add(conta);
    }

    public void depositar(String nomeConta, Double valorDeposito) throws Exception{

        if(valorDeposito <= 0 ){
            throw new ValorInvalidoException();
        }

        ContaCorrente contaDeposito = null;

        for (ContaCorrente x : contas){
            if(x.getNome().equals(nomeConta)){
                contaDeposito = x;
                x.setSaldo(x.getSaldo() + valorDeposito);
                System.out.println("O saldo da " + x.getNome() + " é: R$" + x.getSaldo());
            }
        }

        if(contaDeposito == null) {
            throw new ContaInexistenteException();
        }
    }
}
