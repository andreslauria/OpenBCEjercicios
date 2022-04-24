public class Main {
    public static void main(String[] args) {

        int resultado = suma(2,3,4);

        System.out.println(resultado);

        Coche miCoche = new Coche();

        miCoche.incrementarPuertas();

        System.out.println(miCoche.nroPuertas);



    }

    public static int suma(int a,int b, int c){

        return a+b+c;
    }
}

class Coche{
    int nroPuertas = 0;

    public void incrementarPuertas(){
        nroPuertas++;
    }

}