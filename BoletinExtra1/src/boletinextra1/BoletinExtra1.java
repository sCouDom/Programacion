
package boletinextra1;

public class BoletinExtra1 {

    public static void main(String[] args) throws Exception {
        Conta contaS = new Conta("Pedrito","0001",(double) 5.3, (double)0);
        Conta contaK = new Conta("Tomasín","0002",(double)1.5,(double)100);
        System.out.println("Saldo contaS");
        contaS.verSaldo();
        System.out.println("Saldo contak");
        contaK.verSaldo();
        System.out.println("Ingreso 50 na contaS");
        contaS.ingreso((double)50);
        System.out.println("Reintegro 20 na contaK");
        contaK.reintegro((double)20);
        System.out.println("Saldo contaS");
        contaS.verSaldo();
        System.out.println("Saldo contaS");
        contaK.verSaldo();
        System.out.println("Transferencia de contaS a contaK");
        contaS.transferencia(contaK, 20);
        System.out.println("Saldo contaS");
        contaS.verSaldo();
        System.out.println("Saldo contaK");
        contaK.verSaldo();
    }
}
