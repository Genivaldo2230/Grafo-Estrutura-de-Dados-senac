import java.util.ArrayList;

public class Vertice<TIPO> extends Aresta<String> {
    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestasEntrada;
    private ArrayList<Aresta<TIPO>> arestasViararEsqueda;
    private ArrayList<Aresta<TIPO>> arestasViararDireita;
    private ArrayList<Aresta<TIPO>> arestasNomeDaRua;
    private ArrayList<Aresta<TIPO>> arestaTermnalTp;
    private ArrayList<Aresta<TIPO>> arestaTermnalTs;
    private ArrayList<Aresta<TIPO>> arestasSaida;





    public Vertice(TIPO valor) {
        this();
        this.dado = valor;
        this.arestasEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestasSaida = new ArrayList<Aresta<TIPO>>();
    }

    public Vertice(Double metros,Vertice<String> nomeRua,Vertice<String> ruaA,Vertice<String> ruaB,Vertice<String> ruaC,Vertice<String> quilômetro,Vertice<String> virarDireita,Vertice<String> virarEsquerda,Vertice<String> fim) {
        super(metros,nomeRua,ruaA,ruaB,ruaC,quilômetro,virarDireita,virarEsquerda,fim);
    }

    public Vertice(String nomeRua,double v) {
        super(nomeRua,v);
    }

    public Vertice() {
        super();
    }

    public void adicionarArestaEntrada(Aresta<TIPO> aresta) {//metodo construto garante Adiciona Entrada
        this.arestasEntrada.add(aresta);
    }

    public void adicionarArestaSaida(Aresta<TIPO> aresta) { //metodo construto garante Adiciona Saida
        this.arestasSaida.add(aresta);
    }

    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }

    public ArrayList<Aresta<TIPO>> getArestasEntrada() {
        return arestasEntrada;
    }

    public void setArestasEntrada(ArrayList<Aresta<TIPO>> arestasEntrada) {
        this.arestasEntrada = arestasEntrada;
    }

    public ArrayList<Aresta<TIPO>> getArestasViararEsqueda() {
        return arestasViararEsqueda;
    }

    public void setArestasViararEsqueda(ArrayList<Aresta<TIPO>> arestasViararEsqueda) {
        this.arestasViararEsqueda = arestasViararEsqueda;
    }

    public ArrayList<Aresta<TIPO>> getArestasViararDireita() {
        return arestasViararDireita;
    }

    public void setArestasViararDireita(ArrayList<Aresta<TIPO>> arestasViararDireita) {
        this.arestasViararDireita = arestasViararDireita;
    }

    public ArrayList<Aresta<TIPO>> getArestasNomeDaRua() {
        return arestasNomeDaRua;
    }

    public void setArestasNomeDaRua(ArrayList<Aresta<TIPO>> arestasNomeDaRua) {
        this.arestasNomeDaRua = arestasNomeDaRua;
    }

    public ArrayList<Aresta<TIPO>> getArestaTermnalTp() {
        return arestaTermnalTp;
    }

    public void setArestaTermnalTp(ArrayList<Aresta<TIPO>> arestaTermnalTp) {
        this.arestaTermnalTp = arestaTermnalTp;
    }

    public ArrayList<Aresta<TIPO>> getArestaTermnalTs() {
        return arestaTermnalTs;
    }

    public void setArestaTermnalTs(ArrayList<Aresta<TIPO>> arestaTermnalTs) {
        this.arestaTermnalTs = arestaTermnalTs;
    }

    public ArrayList<Aresta<TIPO>> getArestasSaida() {
        return arestasSaida;
    }

    public void setArestasSaida(ArrayList<Aresta<TIPO>> arestasSaida) {
        this.arestasSaida = arestasSaida;
    }
}