package livraria;

import java.util.ArrayList;

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
}
