import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<Integer> numberList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(-5);
        list.add(7);
        list.add(12);
        list.add(-1);
        System.out.println(numberList());
        list.add(2,10);
        list.set(1,9);
        System.out.println(numberList());
        list.remove(4);
        return numberList();
    }

    public static ArrayList<Double> firstAndLast(){
        ArrayList<Double> list = new ArrayList<>();
        int counter = 0;
        while(counter<)
        list.add(scan.nextDouble());
        list.add(scan.nextDouble());

    }
}
