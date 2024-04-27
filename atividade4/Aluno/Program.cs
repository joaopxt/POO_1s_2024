// See https://aka.ms/new-console-template for more information
using Estudante.Entities;
using System.IO;

Aluno al = new Aluno();

System.Console.WriteLine("Escolha a sua atribuicao de aluno: ");
string tipo = Console.ReadLine();

switch (tipo){
    case "Atleta":
      System.Console.WriteLine(al.atletaAtr());
    break;

    case "Intercambista":
    System.Console.WriteLine(al.interAtr());
    break;

    case "Monitor":
    System.Console.WriteLine(al.monAtr());
    break;
     
     default:
     System.Console.WriteLine("Atribuicao nao encontrada!");
     break;
}

System.Console.WriteLine();

/*
Aluno al1 = new Aluno("Joao", "Engenharia de Software", 5);
A_Monitor mon1 = new A_Monitor("Pedro", "Ciencia da Computacao", 6, "POO", 500.00, "Joao Pedro");
Atleta atl1 = new Atleta("Cris", "Enfermagem", 8, "Tenis", 300.00, "Melina");
Intercambista int1 = new Intercambista("Tyler", "Musica", 3, "EUA", "Duke");

Console.WriteLine(al1);
Console.WriteLine(mon1);
Console.WriteLine(atl1);
Console.WriteLine(int1);*/

