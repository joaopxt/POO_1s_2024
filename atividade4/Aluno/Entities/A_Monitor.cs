namespace Estudante.Entities;

public class A_Monitor : Aluno {

    internal string MateriaMonitorada { get; set; }
    internal double Bolsa { get; set; }
    internal string Orientador { get; set; }

    public A_Monitor(string nome, string curso, int semestre, string materiaMonitorada, double bolsa, string orientador) : base(nome, curso, semestre) {
        MateriaMonitorada = materiaMonitorada;
        Bolsa = bolsa;
        Orientador = orientador;
    }

    public override string ToString() {
        return $"Monitor #{Id}: {Nome}, {Curso}, {Semestre}, {MateriaMonitorada}, {Bolsa}, {Orientador}";
    }

}
