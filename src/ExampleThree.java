import java.util.HashSet;
public class examplethree {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        // Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference : " + primeNumbers);
    }}

import java.util.TreeSet;
import java.util.Iterator;
public class TreesetExampleone {

   public static void main(String[] args) {
       TreeSet<Integer> num_Treeset = new TreeSet<>();
       num_Treeset.add(20);
       num_Treeset.add(5);
       num_Treeset.add(15);
       num_Treeset.add(25);
       num_Treeset.add(10);

       // Call iterator() method to define Iterator for TreeSet
       Iterator<Integer> iter_set = num_Treeset.iterator();
       System.out.print("TreeSet using Iterator: ");
       // Access TreeSet elements using Iterator
       while(iter_set.hasNext()) {
           System.out.print(iter_set.next());
           System.out.print(", ");
       }
   }
}
