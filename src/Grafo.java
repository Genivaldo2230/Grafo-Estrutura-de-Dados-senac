import java.util.ArrayList;

public class Grafo<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo(){
        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.arestas = new ArrayList<Aresta<TIPO>>();

    }

    public void adicionarVertice(TIPO dado){
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);
    }


    public void adicionarAresta(Double metros, TIPO dadoInicio, TIPO dadoFim, TIPO nomeRua){
        Vertice<String> terminalPrincipal = new Vertice<String>("TerminalPrincipal");
        Aresta<String> arestaNomeRua = new Aresta<String>("NomeRua", 2.5);
        Aresta<String> arestaVirarEsquerda = new Aresta<String>("VirarEsquerda", 1.2);
        Aresta<String> arestaVirarDireita = new Aresta<String>("VirarDireita", 0.8);
        Vertice<String> terminalSecundario = new Vertice<String>("TerminalSecundario");

        terminalPrincipal.adicionarArestaSaida(arestaNomeRua);
        terminalPrincipal.adicionarArestaSaida(arestaVirarEsquerda);
        terminalPrincipal.adicionarArestaSaida(arestaVirarDireita);
        terminalPrincipal.adicionarArestaSaida(new Aresta<String>("Quilômetro", 3.7));
        terminalPrincipal.adicionarArestaSaida(terminalSecundario);

    }
//    public void adicionarAresta(Double metros, TIPO dadoInicio, TIPO dadoFim, TIPO nomeRua){
//        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
//        Vertice<TIPO> fim = this.getVertice(dadoFim);
//        Aresta<TIPO> aresta = new Aresta<TIPO>(metros,(Vertice<TIPO>) nomeRua, inicio, fim);
//
//        inicio.adicionarArestaSaida(aresta);
//        fim.adicionarArestaEntrada(aresta);
//        this.arestas.add(aresta);
//    }

    /**
     * Metodo que retorna Vertice TIPO a  Tipo
     * Nessa parte temos um for que receber o metodo Size que pecorrer o Array list
     *
     */
    public Vertice<TIPO> getVertice(TIPO dado){
        Vertice<TIPO> vertice = null;
        for(int i=0; i < this.vertices.size(); i++){
            if (this.vertices.get(i).getDado().equals(dado)){ //se o this na posição do vertece na posição do (i) for igual ao dados resp achou
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }

    public void BuscaEmLargura(){
        ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>();
        ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();
        Vertice<TIPO> atual = this.vertices.get(2);
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        while(fila.size() > 0){
            Vertice<TIPO> visitado = fila.get(0);
            for(int i=0; i < visitado.getArestasSaida().size();i++){
                Vertice<TIPO> proximo;
                proximo = visitado.getArestasSaida().get(i).getFim();
                if (!marcados.contains(proximo)){
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
}
