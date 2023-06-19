//import java.util.*;
import java.util.ArrayList;

public class ArrayListImplement{

    static class Stack{
        static ArrayList <Integer> list = new ArrayList<>();
f
        public static boolean isEmpty()
        {
            return list.size()==0;
        }

        public static void push(int data)
        {
            list.add(data);
        }
        public static int pop()
        {
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek()
        {
            int top = list.get(list.size()-1);
            return top;
            //  OR 
            //return list.get(list.size()-1);
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}