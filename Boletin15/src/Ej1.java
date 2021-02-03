
public class Ej1 {
    public static void main(String[] args) {
        Integer[] random = new Integer[6];
        for (int i = 0; i < 6; i++) {
            random[i]=(int)(Math.random() * (51 - 1 + 1) + 1);
        }
        for (int i = 5; i > 0; i--) {
            System.out.println(random[i]);
        }
    }
}
