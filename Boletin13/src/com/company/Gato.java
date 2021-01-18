package com.company;

public class Gato extends Felino implements IPodeNadar{
    @Override
    public void caminar(){
        System.out.println("Gato: Estoy caminando");
    }

    @Override
    public void nadar() {
        System.out.println("Gato: Estoy nadando");
    }
}
