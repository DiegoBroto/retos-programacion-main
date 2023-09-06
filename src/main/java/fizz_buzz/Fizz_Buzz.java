package fizz_buzz;

public class Fizz_Buzz {
    public static void main(String[] args) {

        int contAmbos = 0;
        int contTres = 0;
        int contCinco = 0;
        int contNoDiv = 0;

        for (int i = 1; i <= 100; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                contAmbos ++;
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                contCinco ++;
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                contTres ++;
                System.out.println("fizz");
            } else {
                contNoDiv ++;
                System.out.println(i);

            }

        }
        System.out.println("Cant. Multiplo de 3 = " + contTres);
        System.out.println("Cant. Multiplo de 5 = " + contCinco);
        System.out.println("Cant. Multiplo de 3 y 5 = " + contAmbos);
        System.out.println("Cant. sin Multiplo = " + contNoDiv);
    }

}
