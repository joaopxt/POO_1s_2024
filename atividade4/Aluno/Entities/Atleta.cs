﻿namespace Estudante.Entities;

public class Atleta : Aluno {

    public string Esporte { get; set; }
    public double Bolsa { get; set; }
    public string Tecnico { get; set; }

    public Atleta(string nome, string curso, int semestre, string esporte, double bolsa, string tecnico) : base(nome, curso, semestre) {
        Esporte = esporte;
        Bolsa = bolsa;
        Tecnico = tecnico;
    }

    public override string ToString() {
        return $"Atleta #{Id}: {Nome}, {Curso}, {Semestre}, {Esporte}, {Bolsa}, {Tecnico}";
    }

}
