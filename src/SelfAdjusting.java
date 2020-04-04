import java.util.ArrayList;

/**
 * @author Sumin Hong
 * @since 3/20/2020
 * Description: This class includes one constructor, one accessor, and one void method in order to implement a
 * self-adjusting list that adds user created list onto the list of even numbers.
 */
public class SelfAdjusting {
    private ArrayList<Integer> array;

    /**
     * Constructor with given ArrayList by the user.
     * @param array the numerator of fraction
     */
    public SelfAdjusting(ArrayList<Integer> array){
        this.array = array;
    }

    /**
     * An accessor method for List
     * @return the ArrayList array.
     */
    public ArrayList<Integer> getList(){
        return array;
    }


    /**
     * A method with no parameter and return. It initially makes a new list with even numbers from 2 to 20 and changes it
     * with the list by the user by comparing the numbers in two lists and if there is a different number on the user's list,
     * add it on to the list with even numbers and if there are equal numbers, remove numbers on the even number list and add user's list.
     * Stop the list when there is 0.
     */
    public void adjustList(){
        /**
         * create an ArrayList called list that has even numbers from 2 to 20.
         */
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(16);
        list.add(18);
        list.add(20);

        /**
         * while loop that goes through the list and array, comparing each numbers and adding them onto the list.
         */
        int counter = 0;
        while(counter<array.size()) {
            for (int x = 0; x < list.size(); x++) {
                if (array.get(counter) == list.get(x)) {
                    list.remove(x);
                    list.add(0, array.get(counter));
                    counter++;
                    x =-1;
                }
                else if (array.get(counter) % 2 != 0){
                    list.add(0,array.get(counter));
                    counter++;
                }
                }
            if(array.get(counter) == 0){
                    break;
            }
        }
        array = list;

    }
}
