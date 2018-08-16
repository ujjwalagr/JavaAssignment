import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Ujjwal {
    public static void main(String... k) {
        Scanner scan = new Scanner(System.in);
        String str;
        int test;
        str = scan.nextLine();
        test = scan.nextInt();

        ArrayList<Integer> arrayOfIndex = new ArrayList<>();
        ArrayList<String> arrayOfTaskStrings = new ArrayList<>();

        while (test > 0) {
            arrayOfTaskStrings.add(scan.next());
            test--;
        }
        for (String indvidualTask : arrayOfTaskStrings) {
            int index = str.indexOf(indvidualTask, 0);
            while (index >= 0) {
                arrayOfIndex.add(index);
                index = str.indexOf(indvidualTask, index + 1);
            }
        }
        Collections.sort(arrayOfIndex);
        Output out = new Output();
        out.printResult(arrayOfIndex);
    }
}

class Output {
    void printResult(ArrayList arrayOfIndex) {
        for (int i = 0; i < arrayOfIndex.size(); i++) {
            System.out.print(arrayOfIndex.get(i) + " ");
        }
    }
}