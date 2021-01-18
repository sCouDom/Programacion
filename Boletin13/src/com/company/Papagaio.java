package com.company;

public class Papagaio extends Ave implements IPodeVoar{
    public void caminar(){
        System.out.println("Papagaio: Estoy caminando");
    }
    public void voar(){
        System.out.println("Papagaio: Estoy volando");
    }
}
