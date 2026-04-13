import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());
            }
            
            ListIterator<Integer> iter = list.listIterator();
            System.out.print("Forward: ");
            boolean first = true;
            while (iter.hasNext()) {
                if (!first) System.out.print(" ");
                System.out.print(iter.next());
                first = false;
            }
            System.out.println();
            
            System.out.print("Backward: ");
            first = true;
            while (iter.hasPrevious()) {
                if (!first) System.out.print(" ");
                System.out.print(iter.previous());
                first = false;
            }
            System.out.println();
        }
        scanner.close();
    }
}
