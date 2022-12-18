package Tema4;

public class Main {
    public static void main(String[] args) {
        // if, else if, else

        int numeroIf = 0;
        if (numeroIf< 0){
            System.out.println ("numeroIf is negative");
        }
        else if (numeroIf > 0) {
            System.out.println ("numeroIf is positive");
        }
        else {
            System.out.println ("numeroIf is 0");
        }

        // while
        int numeroWhile = 1;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println ("numeroWhile is " + numeroWhile);
        }

        // do while
        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println ("numeroDoWhile is " + numeroDoWhile);

        }while(numeroDoWhile < 3);

        // for

         for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
             System.out.println ("numeroFor is " + numeroFor);
         }

         // switch
        String estacion = "verano";
         switch (estacion){
             case "otoño":
                 System.out.println ("Es otoño");
                 break;
             case "invierno":
                 System.out.println ("Es invierno");
                 break;
             case "primavera":
                 System.out.println ("Es primavera");
                 break;
             case "verano":
                 System.out.println ("Es verano");
                 break;
             default:
                 System.out.println ("No es una estación");
         }
     }
}