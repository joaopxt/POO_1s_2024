
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
                    
                    Scanner x = new Scanner(System.in);

                    saraiva.cadastrarLivro(saraiva.criarLivro(x));
                }
                break;
            case 2:{
                
                System.out.println("Listando livros...");

                System.out.println(saraiva.listarLivros());
                
            }
            break;
            case 3:
                System.out.println("Detalhando livro...");

                System.out.println("Qual o ID do livro que você deseja buscar: ");

                Scanner y = new Scanner(System.in);
                int idX = y.nextInt();

                System.out.println(saraiva.detalharLivroById(idX)); 


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
