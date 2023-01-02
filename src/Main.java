import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        Ho definito un array di stringhe chiamato carBrand a cui ho aggiunto i nomi di 5 macchine
         */
        String carBrands[] = new String[]{"Audi", "BMW", "Mercedes", "Volvo", "Fiat"};

        /*
        Ho printato in console la lunghezza dell'array
         */
        System.out.println("The array carBrand has " + carBrands.length + " items");

        /*
        Ho printato in console in terzo elemento dell'array
         */
        System.out.println("The 3rd item of carBrands is " + Arrays.toString(new String[]{carBrands[2]}));

        /*
        Ho creato un array di numeri primi con una lunghezza predefinita di 6
         */
        int primeNumbers[] = new int[6];

        /*
        Ho assegnato uno per uno i valori all'array
         */
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        /*
        Ho printato il contenuto dell'array dei numeri primi
         */
        System.out.println("The first 6 prime numbers are " + Arrays.toString(primeNumbers));

    }
}