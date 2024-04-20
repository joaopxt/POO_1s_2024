package aula_heranca.heranca.empresa;

public class Engenheiro extends Funcionario {
    
    private String crea;
    private String projeto;

    private Engenheiro(){}

    public Engenheiro(String nome, Integer cpf, Integer telefone, String crea, String projeto, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.crea = crea;
        this.projeto = projeto;
        this.salario = salario;
    }

    public String getCrea() {
        return this.crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getProjeto() {
        return this.projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public Double getBonificacao(){
        return this.salario*0.15;
    }

    @Override
    public String toString() {
        return
            " Nome='" + getNome() + "'" +
            ", CPF='" + getCpf() + "'" +
            ", Telefone='" + getTelefone() + "'" +
            ", CREA='" + getCrea() + "'" +
            ", Projeto='" + getProjeto() + "'";
    }


}
