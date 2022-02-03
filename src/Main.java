import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] pole = {6, 1, 3, 4, 5};
        System.out.println(pole[0]);

        try {
            System.out.println(pole[10]);
        } catch (Exception e) {
            System.out.println("Taká pozícia neexistuje.");
        }
        System.out.println("ahoj");



       /* int cislo = 8;
        int vysledok = cislo / 0;
        System.out.println("Výsledok je " + vysledok);
        System.out.println(6/3);*/



        int cislo = 8;
        try {
            int vysledok = cislo / 0;
            System.out.println("Výsledok je " + vysledok);
        } catch (ArithmeticException vynimka) {
            System.out.println("Nemôžeš deliť nulou!");
        }
        System.out.println(6/3);


       /* System.out.println("Koľko máš rokov?");
        Scanner sc = new Scanner(System.in);
        try {
            int vek = sc.nextInt();
            System.out.println(vek / 0);
        } catch (InputMismatchException | ArithmeticException e) {
            //System.out.println(e.getMessage());
            System.out.println(e);
            //System.out.println("Nastala chyba.");
        }*/

        System.out.println("Koľko máš rokov?");
        Scanner sc = new Scanner(System.in);
        try {
            int vek = sc.nextInt();
            System.out.println(vek / 0);
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Musíš zadať vek ako celé číslo!");
        } catch (ArithmeticException e) {
            System.out.println("Nemôžeš deliť nulou!");
        } finally { // vykoná sa vždy
            System.out.println("KONIEC");
        }

        // pole "cisla" so 100 náhodnými číslami
        // vypisujte čísla na náhodných pozíciách (120)
        int[] cisla = new int[100];
        Random r = new Random();
        for (int i = 0; i < cisla.length; i++) {
            cisla[i] = r.nextInt(500);
        }

        int nahodnaPozicia;
        for (int i = 0; i < 1000; i++) {
            nahodnaPozicia = r.nextInt(120);
            System.out.println("Náhodná pozícia: " + nahodnaPozicia);
            try {
                System.out.println("Číslo na náhodnej pozícii: " + cisla[nahodnaPozicia]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Taká pozícia v poli neexistuje.");
            }
        }

        try {
            for (int i = 0; i < 1000; i++) {
                nahodnaPozicia = r.nextInt(120);
                System.out.println("Náhodná pozícia: " + nahodnaPozicia);
                System.out.println("Číslo na náhodnej pozícii: " + cisla[nahodnaPozicia]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Taká pozícia v poli neexistuje.");
        }


        delenie(6, 3);
        delenie(6,0);
    }

    public static void delenie(int paDelenec, int paDelitec) {
        try {
            System.out.println(paDelenec / paDelitec);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Nemôžeš deliť nulou.");
        }
    }
}