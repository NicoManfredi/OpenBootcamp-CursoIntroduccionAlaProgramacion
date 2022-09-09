public class Main {
    public static void main(String[] args) {

        int numeroIf = -20;

        if (numeroIf == 0) {
            System.out.println("Mi numero If es igual a cero");
        } else if (numeroIf > 0) {
            System.out.println("Mi numero If es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Mi numero If es negativo");
        }



        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println("Mi numero While es menor a 3, ya que es: " + numeroWhile);
            numeroWhile = numeroWhile + 1;
        }



        int numeroDoWhile = 2;

        do {
            System.out.println("Mi numero DoWhile es: " + numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        } while (numeroDoWhile < 3);



        for (int numeroFor = 0;numeroFor <= 3;numeroFor = numeroFor +1){
            System.out.println("Mi numero For es igual a: " + numeroFor);
        }



        var estacion = "Verano";

        switch (estacion){
            case "Verano":
                System.out.println("Es verano");
            break;

            case "Otoño":
                System.out.println("Es Otoño");
            break;

            case "Invierno":
                System.out.println("Es Invierno");
            break;

            case "Primavera":
                System.out.println("Es Primavera");
            break;

            default:
                System.out.println("Error al detectar la estación del año");
        }

    }
}
