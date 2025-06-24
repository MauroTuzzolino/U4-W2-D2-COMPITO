package Ex1;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParoleDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di parole: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci la parola #" + (i + 1) + ": ");
            String parola = scanner.nextLine();

            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("\nNumero di parole distinte: " + paroleDistinte.size());

        System.out.println("Elenco delle parole distinte: ");
        for (String parola : paroleDistinte) {
            System.out.println(parola);
        }

        scanner.close();
    }
}
