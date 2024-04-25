package aula_heranca.empresa;

public class Diretor  extends Funcionario{
    
    private Integer qtdGerencias;

    private Diretor(){}


    public Diretor(String nome, Integer cpf, Integer telefone, Double salario, Integer qtdGerencias) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.qtdGerencias = qtdGerencias;
    }

    public Integer getQtdGerencias() {
        return this.qtdGerencias;
    }

    public void setQtdGerencias(Integer qtdGerencias) {
        this.qtdGerencias = qtdGerencias;
    }

    public Double getBonificacao(){
        return this.salario*0.35;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", salario='" + getSalario() + "'" +
            ", qtdGerencias='" + getQtdGerencias() + "'" +
            "bonificacao= " + getBonificacao() + "'" + 
            "}";
    }

}
