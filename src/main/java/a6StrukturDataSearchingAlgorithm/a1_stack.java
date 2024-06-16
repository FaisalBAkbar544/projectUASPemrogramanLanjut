package a6StrukturDataSearchingAlgorithm;

import java.util.*;

public class a1_stack {
//stack = LIFO data structure, Last in, First out.
//store object into a sort of "Vertical Tower"
//push() to add to the top
//pop() to remove from the top

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());

        stack.push("ke-1");
        stack.push("ke-2");
        stack.push("ke-3");
        stack.push("ke-4");
        stack.push("ke-5");
        //print seluruh stack
        System.out.println(stack);
        
        //print stack atas
        System.out.println(stack.peek());
        
        
        //mencari stack berdasarkan nilai
        System.out.println(stack.search("ke-5"));
        System.out.println(stack.search("ke-3"));
        
        //Menghapus stack dari atas
        stack.pop();
    }

}
