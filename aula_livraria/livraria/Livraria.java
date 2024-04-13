package livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class Livraria {
        
    public ArrayList<Livro> livros;

    public Livraria(){
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro l){
        this.livros.add(l);
    }

    public String listarLivros(){
        String lista = "";

        for(Livro l : this.livros){
            lista += l.id + " - " + l.titulo + "\n";
        }

        return lista;
    }

    public Livro criarLivro(Scanner sc){
        
                    int id; String titulo; String autor; String ano; String editora;
                    
                    System.out.println("Id: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Titulo: ");
                    titulo = sc.nextLine();
                    System.out.println("Autor: ");
                    autor = sc.nextLine();
                    System.out.println("Ano de publicacao: ");
                    ano = sc.nextLine();
                    System.out.println("Editora: ");
                    editora = sc.nextLine();
                    Livro l = new Livro(id, titulo, autor, ano, editora);

                    return(l);
    }

    public String detalharLivroById(int id){
        String detalheLivro = "Livro nao encontrado";

        for(Livro l : this.livros){
            if(l.id == id){
                detalheLivro = l.toString();
            }
        }

        return detalheLivro;
    }
}
