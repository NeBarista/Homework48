import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 2;
        int first = scanner.nextInt();
        int lastItem = scanner.nextInt();
        final int diff = lastItem - first;
        while (count<10) {
            first = scanner.nextInt();
            if(diff!=first - lastItem) {
                break;
            }
            lastItem = first;
            count++;
        }
    }
}