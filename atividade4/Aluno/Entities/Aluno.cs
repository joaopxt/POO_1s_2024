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

    public Atleta atletaAtr(){

        System.Console.WriteLine("Nome: ");
        string nome = Console.ReadLine();
        System.Console.WriteLine("Curso: ");
        string curso = Console.ReadLine();
        System.Console.WriteLine("Semestre: ");
        int sem = int.Parse(Console.ReadLine());
        System.Console.WriteLine("Esporte: ");
        string esp = Console.ReadLine();
        System.Console.WriteLine("Tecnico: ");
        string tec = Console.ReadLine();
        System.Console.WriteLine("Bolsa: ");
        double bol = double.Parse(Console.ReadLine());

          Atleta a1 = new Atleta(nome, curso, sem, esp, bol, tec);
         return a1;
    }

    public Intercambista interAtr( ){

        System.Console.WriteLine("Nome: ");
        string nome = Console.ReadLine();
        System.Console.WriteLine("Curso: ");
        string curso = Console.ReadLine();
        System.Console.WriteLine("Semestre: ");
        int sem = int.Parse(Console.ReadLine());
        System.Console.WriteLine("Pais de origem: ");
        string pais = Console.ReadLine();
        System.Console.WriteLine("Universidade de origem: ");
        string uni = Console.ReadLine();

          Intercambista a1 = new Intercambista(nome, curso, sem, pais, uni);
         return a1;
    }

    public A_Monitor monAtr(){

        System.Console.WriteLine("Nome: ");
        string nome = Console.ReadLine();
        System.Console.WriteLine("Curso: ");
        string curso = Console.ReadLine();
        System.Console.WriteLine("Semestre: ");
        int sem = int.Parse(Console.ReadLine());
        System.Console.WriteLine("Materia Monitorada: ");
        string mat = Console.ReadLine();
        System.Console.WriteLine("Bolsa: ");
        double bol = double.Parse(Console.ReadLine());
        System.Console.WriteLine("Orientador: ");
        string orientador = Console.ReadLine();

          A_Monitor a1 = new A_Monitor(nome, curso, sem, mat, bol, orientador);
         return a1;
    }

    public override string ToString() {
        return $"Aluno #{Id}: {Nome}, {Curso}, {Semestre}";
    }
}
