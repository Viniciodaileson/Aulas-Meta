import java.util.Scanner;

public class Biblioteca {

    Scanner SC = new Scanner(System.in);

    Livro livro1 = new Livro();
    Livro livro2 = new Livro();
    Livro livro3 = new Livro();

    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.iniciar();

  
        }
        void iniciar(){

            cadastrarLivros();

        }
        void cadastrarLivros(){

            cadastrarLivro(livro1, 1);
            cadastrarLivro(livro2, 2);
            cadastrarLivro(livro3, 3);
        }

        void cadastrarLivro( Livro livro, int numero){
            

        }



    }
