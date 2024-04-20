package aula_heranca.heranca.empresa;

public class Gerente extends Funcionario {
    
    private Integer qtdGerenciados;

    private Gerente(){}


    public Gerente(String nome, Integer telefone, Integer cpf, Double salario, Integer qtdGerenciados) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.salario = salario;
        this.qtdGerenciados = qtdGerenciados;
    }

    public Integer getQtdGerenciados() {
        return this.qtdGerenciados;
    }

    public void setQtdGerenciados(Integer qtdGerenciados) {
        this.qtdGerenciados = qtdGerenciados;
    }

    public Double getBonificacao(){
        return this.salario*0.25;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", salario='" + getSalario() + "'" +
            ", qtdGerenciados='" + getQtdGerenciados() + "'" +
            "bonificacao= " + getBonificacao() + "'" + 
            "}";
    }

}
