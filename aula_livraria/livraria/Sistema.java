
package livraria;

import java.util.Scanner;


public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        Livraria saraiva = new Livraria();

        while (opt != 4){
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair");
            
            opt = sc.nextInt();
            
            switch (opt) {
            case 1:{
                    System.out.println("Adicionando livro...");
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
                    
                    saraiva.cadastrarLivro(l);
                }
                break;
            case 2:{
                
                System.out.println("Listando livros...");

                System.out.println(saraiva.listarLivros());
                
            }
            break;
            case 3:
                System.out.println("Detalhando livro...");
                break;
            case 4:
                System.out.println("Encerrando o sistema");
                break;
        
            default:
                System.out.println("Opcao invalida");
                break;
        }
        }
            sc.close();
        
    }
}
