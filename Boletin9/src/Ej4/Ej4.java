package Ej4;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número");
        int num = sc.nextInt();
        while(num!=0){
            for(int i=1;i<11;i++){
                System.out.println(num+"*"+i+"="+(num*i));
            }
            System.out.println("Introduce número");
            num=sc.nextInt();
        }
    }
}
