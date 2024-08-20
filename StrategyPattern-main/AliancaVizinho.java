package com.company;

public class AliancaVizinho implements IEstrategiaStrategy {


    public void agir(Pais inimigo) {
        System.out.println("vizinho ataca pelo norte e nos atacamos pelo sul");
    }

public void concluir(Pais inimigo){
    System.out.println("DIvidir espolios de guerra");}


}
