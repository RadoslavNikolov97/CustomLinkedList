import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        String[] input = sc.nextLine().split(" -> ");
        for (String num :
                input) {
            list.add(Integer.parseInt(num));
        }
        int m = sc.nextInt();

        System.out.println(list.getIndex(m));

    }
}
