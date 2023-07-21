public class Tablica {
    public static void main(String[] args) {
        int[][] tablica = new int[3][];

        int[][] x = new int[10][10];
        for (int i = 0; i < 10; i++) for (int j = 0; j < 10; j++) x[i][j] = i * 5 + j;
        for (int[] wiersz : x) for (int element : wiersz) System.out.println(element);
        int wiersz = 0;
        int kolumna = 0;
        while (wiersz < x.length) {
            kolumna = 0;
            while (kolumna < x[wiersz].length) {
                System.out.println(x[wiersz][kolumna]);
                kolumna++;
            }
            wiersz++;
        }

//        for (int i = 0; i < tablica.length; i++) {
//            for (int j = 0; j < tablica[i].length; j++) {
//                System.out.print(tablica[i][j]);
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < tablica.length; i++) {
//            for (int j = 0; j < tablica[i].length; j++) {
//                System.out.print(tablica[i][j]);
//            }
//            System.out.println();
//        }
    }
}
