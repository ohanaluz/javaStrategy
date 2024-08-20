package com.company;

public class AtacarSozinho implements IEstrategiaStrategy {

    public void agir(Pais inimigo){
        System.out.println("\n PLantar evidencias falsas \n soltar bombas \n Derrubar governo");

    }
    public void concluir(Pais inimigo) {

        System.out.println("\n Estabelecer governo amigo");
    }


}
