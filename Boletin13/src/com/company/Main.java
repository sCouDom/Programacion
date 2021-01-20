package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("___Morcego___");
        Morcego morcego = new Morcego();
        morcego.caminar();
        morcego.voar();
        System.out.println("___Tigre___");
        Tigre tigre = new Tigre();
        tigre.caminar();
        tigre.nadar();
        System.out.println("___a___");
    }
}
