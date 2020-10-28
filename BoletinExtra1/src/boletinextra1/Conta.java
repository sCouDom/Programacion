
package boletinextra1;

public class Conta {
    private String nomeCliente;
    private String numConta;
    private double tipoInterese;
    private double saldo;
    
    public Conta(){
    }
    public Conta(String nomeCliente, String numConta, double tipoInterese, double saldo){
        this.nomeCliente=nomeCliente;
        this.numConta=numConta;
        this.tipoInterese=tipoInterese;
        this.saldo=saldo;
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    public String getNumConta(){
        return numConta;
    }
    public double getTipoInterese(){
        return tipoInterese;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente=nomeCliente;
    }
    public void setNumConta(String numConta){
        this.numConta=numConta;
    }
    public void setTipoInterese(double tipoInterese){
        this.tipoInterese=tipoInterese;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    public void ingreso(double x) throws Exception{
        if(x>=0){
            saldo=saldo+x;
        } else{
            throw new Exception("Número pasado debe ser positivo");
        }
    }    
    public void reintegro(double x) throws Exception{
        if(x>=0){
            saldo=saldo-x;
        } else{
            throw new Exception("Número pasado debe ser positivo");
        }
    }
    
    public void transferencia(Conta contaDestino, double x) throws Exception{
        if(x>=0 && (this.saldo-x)>=0){
            this.saldo=this.saldo-x;
            contaDestino.setSaldo(contaDestino.getSaldo()+x);
        } else{
            throw new Exception("Número pasado debe ser positivo");
        }
    }
    
    public void verSaldo(){
        System.out.println(saldo);
    }
}