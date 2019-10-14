import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * FirstAndLastOccurence
 */
public class FirstAndLastOccurence {

    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>(Arrays.asList(1,2,1,5,7,8,9,33,1,556,55));

        Scanner scanner= new Scanner(System.in);
        int val= scanner.nextInt();
        int m;
        for (m = 0; m < list.size(); m++) {
            if(val==list.get(m)){
                System.out.println("Present at "+m+" position");
                break;
            }
        }
        for (int i = list.size()-1; i >m; i--) {
            if (val==list.get(i)) {
                System.out.println("Present at "+i+" position");
                break;
            }
        }
    }
}