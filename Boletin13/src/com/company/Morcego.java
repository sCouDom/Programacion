package com.company;

public class Morcego extends Mamifero implements IPodeVoar {
    @Override
    public void caminar() {
        System.out.println("Murciegalo: Estoy caminando");
    }

    @Override
    public void voar() {
        System.out.println("Murciegalo: Estoy volando");
    }
}
