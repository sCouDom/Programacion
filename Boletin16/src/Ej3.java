public class Ej3 {
    public static void main(String[] args) {
        String java = "www.javadesde0.com";
        String parte1=null, parte2=null, java2=null;
        for (int i = 0; i < java.length(); i++) {
            if (java.substring(0, i).compareToIgnoreCase("www.java")==0) {
                parte1=java.substring(0, i);
                parte2=java.substring(i);
            }
        }
        System.out.println("Parte 1: " +parte1+ "\nParte 2: " + parte2);
        java2=parte1.concat(parte2);
        System.out.println("Concatenación: " + java2);
    }
}
