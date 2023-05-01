import java.util.Scanner;

public class ExemploDeGrafos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Grafo<String> grafo = new Grafo<String>();

        grafo.adicionarVertice("TerminalPrincipal");
        grafo.adicionarVertice("RuaA");
        grafo.adicionarVertice("TerminalSecundario");

        grafo.adicionarAresta(2.5,"TerminalPrincipal","VirarEsquerda ","Rua A");
        grafo.adicionarAresta(1.2,"TerminalPrincipal","VirarDireita","Rua A");
        grafo.adicionarAresta(0.8,"TerminalPrincipal","Rua C","VirarDireita");
        grafo.adicionarAresta(3.7,"TerminalPrincipal","Km 10","Quilômetro");
        grafo.adicionarAresta(4.0,"Rua A","TerminalSecundario","Rua A");
        grafo.adicionarAresta(2.0,"Rua B","TerminalSecundario","Rua B");
        grafo.adicionarAresta(5.0,"Rua C","TerminalSecundario","Rua C");


        grafo.BuscaEmLargura();

    }
 }


//        Grafo<String> grafo = new Grafo<String>();
//
//
//        grafo.getVertice("TerminalTp");
//        grafo.adicionarVertice("TerminalTs");
//        grafo.adicionarVertice("VireEsquerda");
//        grafo.adicionarVertice("zeli");
//
//  grafo.BuscaEmLargura();
//        grafo.adicionarAresta(200.0,"TerminalTp","Esquerda","zeli");

