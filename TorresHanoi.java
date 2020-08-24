import java.util.Scanner;

public class TorresHanoi {
    public static void main (String args[]){
        Scanner es = new Scanner(System.in);
        int nu=0;
        System.out.print("\n Digite cantidad de Discos ");
        nu = es.nextInt();
        TorresHanoi objHanoi = new TorresHanoi();
        objHanoi.thanoi(nu, 1, 2, 3);
    }
    public void thanoi(int nu, int TorreIni,int TorreAux,int TorreDes ){
        if (nu == 1){
            System.out.print("\n Mover disco de Torre "+ TorreIni+ " Torre "+ TorreDes);
        }else{
        thanoi(nu-1, TorreIni, TorreDes, TorreAux);
        System.out.print("\n Mover disco de Torre "+ TorreIni+ " Torre "+ TorreDes);
        thanoi(nu-1, TorreAux, TorreIni, TorreDes);
        }
    }
}