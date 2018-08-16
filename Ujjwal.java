import java.util.*;

class Ujjwal {
    public static void main(String... k) {
        Scanner sc = new Scanner(System.in);
        String s, pr;
        int t;
        s = sc.nextLine();
        t = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<String> prt = new ArrayList<>();

        while (t > 0) {
            prt.add(sc.next());
            t--;
        }
        for (String y : prt) {
            int index = s.indexOf(y, 0);
            while(index>=0)
            {
                ar.add(index);
                index=s.indexOf(y,index+1);
            }
        }
        Collections.sort(ar);
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }
    }
}