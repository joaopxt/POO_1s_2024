package aulaException.banco;

public class ContaCorrente {
    

    private String nome;
    private Double saldo;

    private ContaCorrente(){}; //Encapsulamento do construtor
    public ContaCorrente(String nomeConta){   //Obrigo a chamada do construtor ser executada com o nome setado
        this.nome = nomeConta;
        this.saldo = 0.0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
