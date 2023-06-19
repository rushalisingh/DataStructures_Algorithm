import java.util.ArrayList;

public class IntroPractice
{

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        //add 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // list.add(1,9);

        // //get operation
        // int element = list.get(2);
        // System.out.println(element);
 
        // //remove operation
        // list.remove(2);
        // System.out.println(list);

        // //set element at index 
        // list.set(2,10);
        // System.out.println(list);

        // //contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

    }
}