package Ex2;

import java.util.*;

public class ListFunctions {

    public static List<Integer> generateRandomList(int N) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            list.add(rand.nextInt(101));
        }
        Collections.sort(list);
        return list;
    }

    public static List<Integer> mirrorList(List<Integer> list) {
        List<Integer> result = new ArrayList<>(list);
        List<Integer> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        result.addAll(reversed);

        return result;
    }

    public static void printPositions(List<Integer> list, boolean x) {
        System.out.println(x ? "Elementi in posizioni pari: " : "Elementi in posizione dispari: ");
        for (int i = 0; i < list.size(); i++) {
            if (x && i % 2 == 0) {
                System.out.println("Posizione " + i + ": " + list.get(i));
            } else if (!x && i % 2 != 0) {
                System.out.println("Posizione " + i + ": " + list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di elementi da generare: ");
        int N = scanner.nextInt();

        List<Integer> randomList = generateRandomList(N);
        System.out.println("Lista ordinata di numeri casuali:");
        System.out.println(randomList);

        List<Integer> mirroredList = mirrorList(randomList);
        System.out.println("Lista specchiata:");
        System.out.println(mirroredList);

        System.out.print("Vuoi stampare gli elementi in posizioni pari? (true/false): ");
        boolean booleanNum = scanner.nextBoolean();

        printPositions(mirroredList, booleanNum);

        scanner.close();
    }
}
