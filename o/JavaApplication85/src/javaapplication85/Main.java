import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        
        // Desordenar la lista
        Collections.shuffle(numbers);
        
       
        System.out.println("Lista desordenada: " + numbers);
    }
}
