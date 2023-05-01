import java.util.ArrayList;
import java.util.Scanner;

public class Aresta<TIPO> {
Scanner sc =new Scanner(System.in);
        private Vertice<TIPO> inicio;
        private Double metros;
        private Vertice<TIPO> nomeRua;
        private Vertice<TIPO> RuaA;
        private Vertice<TIPO> RuaB;
        private Vertice<TIPO> RuaC;
        private Vertice<TIPO> Quilômetro;
        private Vertice<TIPO> VirarDireita;
        private Vertice<TIPO> VirarEsquerda;

    public Aresta() {

    }

    public Vertice<TIPO> getInicio() {
        return inicio;
    }

    public void setInicio(Vertice<TIPO> inicio) {
        this.inicio = inicio;
    }

    public Vertice<TIPO> getFim() {
        return fim;
    }

    private Vertice<TIPO> fim;

    public Aresta(Double metros,Vertice<TIPO> nomeRua,Vertice<TIPO> ruaA,Vertice<TIPO>
            ruaB,Vertice<TIPO> ruaC,Vertice<TIPO> quilômetro,Vertice<TIPO> virarDireita,Vertice<TIPO> virarEsquerda,Vertice<TIPO> fim) {
        this.metros = metros;
        this.nomeRua = nomeRua;
        RuaA = ruaA;
        RuaB = ruaB;
        RuaC = ruaC;
        Quilômetro = quilômetro;
        VirarDireita = virarDireita;
        VirarEsquerda = virarEsquerda;
        this.fim = fim;
    }

    public Aresta(TIPO nomeRua,double v) {
    }

    public void setMetros(Double metros) {
        this.metros = metros;
    }

    public void setNomeRua(Vertice<TIPO> nomeRua) {
        this.nomeRua = nomeRua;
    }

    public void setRuaA(Vertice<TIPO> ruaA) {
        RuaA = ruaA;
    }

    public void setRuaB(Vertice<TIPO> ruaB) {
        RuaB = ruaB;
    }

    public void setRuaC(Vertice<TIPO> ruaC) {
        RuaC = ruaC;
    }

    public void setQuilômetro(Vertice<TIPO> quilômetro) {
        Quilômetro = quilômetro;
    }

    public void setVirarDireita(Vertice<TIPO> virarDireita) {
        VirarDireita = virarDireita;
    }

    public void setVirarEsquerda(Vertice<TIPO> virarEsquerda) {
        VirarEsquerda = virarEsquerda;
    }

    public void setFim(Vertice<TIPO> fim) {
        this.fim = fim;
    }
}