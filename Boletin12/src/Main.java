public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("1234A");
        Coche coche2 = new Coche("2234A");
        Coche coche3 = new Coche("3234A");
        Coche coche4 = new Coche("4234A");
        Coche coche5 = new Coche("5234A");
        Coche coche6 = new Coche("6234A");
        Garaxe.entradaCoche(coche1);
        Garaxe.salidaCoche(4, 50, coche1);
        Garaxe.entradaCoche(coche2);
        Garaxe.entradaCoche(coche3);
        Garaxe.entradaCoche(coche4);
        Garaxe.entradaCoche(coche5);
        Garaxe.entradaCoche(coche6);
        Garaxe.entradaCoche(coche1);
        Garaxe.salidaCoche(2, 50, coche5);
    }
}
