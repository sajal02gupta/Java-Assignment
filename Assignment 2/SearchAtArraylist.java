import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
/**
 * SearchAtArraylist
 */
public class SearchAtArraylist {

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(23);
        arr.add(4);
        arr.add(6);
        arr.add(9);
        arr.add(0);
        int flag=1;
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)==a){
                System.out.println("Present at index:"+i);
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("Not present in the list");
        }

        HashSet<Integer> hs= new HashSet<>(Arrays.asList(1,2,4,5,6,8,10,7,8));
        ArrayList alist= new ArrayList<>(hs);
        for (int i = 0; i < alist.size(); i++) {
            if(alist.get(i).equals(a)){
                System.out.println("Present at index:"+i);
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("Not present in the list");
        }

        TreeSet<Integer> tset= new TreeSet<>(Arrays.asList(1,2,3,4,6,7,8,9,0));
            if(tset.contains(a)){
                System.out.println("Present");
            }else{
                System.out.println("Not present");
            }
    }
}