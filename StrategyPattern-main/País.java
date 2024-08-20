package com.company;

public class País {

    String nome;
    int Qtd_Soldados;
    boolean nuclear;
    double territorio;
    double economia;

    int credibilidade = 100;



    private IEstrategiaStrategy estrategia;

    public País(String nome, int qtd_Soldados, boolean nuclear, double territorio, double economia) {
        this.nome = nome;
        this.Qtd_Soldados = qtd_Soldados;
        this.nuclear = nuclear;
        this.economia = economia;
        this.territorio = territorio;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd_Soldados() {
        return Qtd_Soldados;
    }

    public void setQtd_Soldados(int qtd_Soldados) {
        Qtd_Soldados = qtd_Soldados;
    }

    public boolean isNuclear() {
        return nuclear;
    }

    public void setNuclear(boolean nuclear) {
        this.nuclear = nuclear;
    }

    public double getTerritorio() {
        return territorio;
    }

    public void setTerritorio(double territorio) {
        this.territorio = territorio;
    }

    public double getEconomia() {
        return economia;
    }

    public void setEconomia(double economia) {
        this.economia = economia;
    }

    public int getCredibilidade() {
        return credibilidade;
    }

    public void setCredibilidade(int credibilidade) {
        this.credibilidade = credibilidade;
    }

    public IEstrategiaStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(IEstrategiaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void declararGuerra(País inimigo){

        boolean finaliza = false;

        do {
            this.estrategia.agir(inimigo);
        } while(!finaliza);


        this.estrategia.concluir(inimigo);

    }

}
