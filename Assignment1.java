
// Q. Explain Collection framework with example.
// Ans: The Collection Framework in Java provides a set of classes and interfaces that
// implement commonly reusable collection data structures. It is a part of the java.util
// package and allows for easier manipulation of data structures such as lists, sets, and maps.

// Implement of Set
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
public class Assignment1 {
    public static void main (String [] args ){
        Set<String> s1 = new HashSet<>();
        s1.add("Aditya");
        s1.add("Ritesh");
        s1.add("Satyajeet");
        s1.add("Bholu");

        System.out.println(s1);
        System.out.println(s1.contains("Aditya"));
        s1.remove("Bholu");
        System.out.println(s1);
        List<Integer> l1 = new ArrayList<>();
         l1.add(7);
         l1.add(8);
         l1.add(9);
         l1.add(10);

         for(int i=0; i<l1.size(); i++){
             System.out.println(l1.get(i));
         }
         l1.remove(2);
         System.out.println(l1);
    }
}
