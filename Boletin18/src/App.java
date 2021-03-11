public class App {
    public static void main(String[] args) {
        Correo c1 = new Correo("hola1");
        Correo c2 = new Correo("hola2");
        Correo c3 = new Correo("hola3");
        Correo c4 = new Correo("hola4");
        Correo c5 = new Correo("hola5");
        Buzon buzon = new Buzon();
        System.out.println("Numero correos: " + buzon.numeroCorreos());
        buzon.engadir(c1);
        buzon.engadir(c2);
        buzon.engadir(c3);
        buzon.engadir(c4);
        buzon.engadir(c5);
        System.out.println("Numero correos: " + buzon.numeroCorreos());
        buzon.amosaPrimeiroNonLido();
        System.out.println("Correos por ler: " + buzon.porLer());
        buzon.amosar(5);
        System.out.println("Correos por ler: " + buzon.porLer());
        buzon.eliminar(5);
        buzon.amosar(5);
    }
}
