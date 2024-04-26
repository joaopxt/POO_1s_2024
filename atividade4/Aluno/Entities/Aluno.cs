using System.Xml.Linq;

namespace Estudante.Entities;

public class Aluno { // Classe de Aluno com métodos de Update e Delete  

     protected Guid Id { get; set; }
     protected string Nome { get; set; }
     protected string Curso { get; set; }
     protected int Semestre { get; set; }
    

    public Aluno() {
    }

     public Aluno(string nome, string curso, int semestre) {
        Id = Guid.NewGuid();
        Nome = nome;
        Curso = curso;
        Semestre = semestre;
    }

    public override string ToString() {
        return $"Aluno #{Id}: {Nome}, {Curso}, {Semestre}";
    }
}
