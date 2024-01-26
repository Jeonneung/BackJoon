import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        Queue<String> queue = new LinkedList<>();
        int wordLenEq2 = word.length()/2;

        for(int i=0; i<wordLenEq2; i++){
            queue.offer(word.substring(i, i+1));
        }
        for(int i=word.length(); i>wordLenEq2; i--) {
            if (queue.isEmpty()) {
                break;
            }
            if (!queue.poll().equals(word.substring(i - 1, i))) {
                System.out.println(0);
                System.exit(0);
            }
        }
        System.out.println(1);
    }
}