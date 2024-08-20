package com.company;
import java.lang.Math;
import java.util.random;

import com.company.País;

public class Diplomacia implements IEstrategiaStrategy{

    double percentual = Math.random()/100.0;


    public void agir(País inimigo){
        if (seuPais.getQtd_Soldados < inimigo.getQtd_Soldados){
            System.out.println("Propor");
        }

    }


    public void concluir(País inimigo){

    }



    public void recuarTropas(País inimigo){
        System.out.println("As tropas voltaram para seu país de origem");
        concluir(inimigo);
    }


    public double proporCopoperacaoEconomica(País inimigo, País seuPais){
        if (seuPais.getEconomia() > inimigo.getEconomia() && inimigo.getTerritorio() > seuPais.getTerritorio){
            seuPais.setEconomia(economia-percentual);
            inimigo.setEconomia(economia+percentual);

            seuPais.setTerritorio(territorio - percentual);
            inimigo.setTerritorio(territorio - percentual);
        }


    }


}

