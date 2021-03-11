import java.util.ArrayList;

public class Buzon {
    private ArrayList<Correo> buzon = new ArrayList<Correo>();

    public int numeroCorreos(){
        int acc=0;
        for (int i = 0; i < buzon.size(); i++) {
            acc++;
        }
        return acc;
    }
    public void engadir(Correo c){
        buzon.add(c);
    }

    public int porLer(){
        int acc=0;
        for (int i = 0; i < buzon.size(); i++) {
            if (!buzon.get(i).isLido())
                acc++;
        }
        return acc;
    }

    public void amosaPrimeiroNonLido(){
        boolean flag=true;
        int p=0;
        Correo c;
        while(flag){
            c=buzon.get(p);
            if(!c.isLido()) {
                flag=false;
                buzon.get(p).setLido(true);
                System.out.println(c.getContido());
            }
            p++;
        }
        if(flag)
            System.out.println("Todos os correos están leídos");
    }

    public void amosar(int p){
        int pos = p-1;
        if(pos<buzon.size()){
            System.out.println(buzon.get(pos).getContido());
            buzon.get(pos).setLido(true);
        } else
            System.out.println("Non hai tantos correos");
    }

    public void eliminar(int p){
        int pos=p-1;
        if(pos<buzon.size()){
            buzon.remove(pos);
        } else
            System.out.println("Non existe ese correo");
    }
}
