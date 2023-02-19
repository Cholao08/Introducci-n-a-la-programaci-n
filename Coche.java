public class Coche {
    int maspuert=0;

    public void  sumpuert() {
        maspuert++;
    }

    public void mostrar(){
        System.out.println("El número de puertas del coche es: "+maspuert);
    }


    public static void main(String[] args) {
        Coche miCoche= new Coche();
        miCoche.sumpuert();
        miCoche.mostrar();
    }
}
