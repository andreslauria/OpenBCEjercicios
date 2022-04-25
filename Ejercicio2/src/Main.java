public class Main {
    public static void main(String[] args) {

        int numeroIf = 2;
        int numeroWhile = 0;
        int numeroFor = 0;


        if(numeroIf > 0){
            System.out.println(numeroIf + " es positivo");

        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " Es menor a cero");

        }else {
            System.out.println("Es cero");
        }

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do{
            System.out.println(numeroWhile);
        }while (numeroWhile<3);

        for (numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "Primavera";

        switch (estacion){
            case "Verano":{
                System.out.println("Es Verano");
                break;}
            case "Primavera":{
                System.out.println("Es Primavera");
                break;}
            case "Invierno":{
                System.out.println("Es Invierno");
                break;}
            case "Otonio":{
                System.out.println("Es Otonio");
                break;
            }
            default:
                System.out.println("Ingreso un valor incorrecto");

        }

    }
}