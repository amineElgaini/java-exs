import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class ex {
    public void main() {
        List<Integer> notes = List.of(10, 12, 8, 12, 15);

        // List<Integer> results = new ArrayList<>(
        //     notes.stream().filter(n -> n >= 12).sorted().toList()
        // );
        // System.out.println(results);
        // results.sort(Collections.reverseOrder());
        // System.out.println(results);
        
        // long passed = results.stream().count();
        // System.out.println(passed);

        // Integer first = notes.stream().filter(n->n>=10).findFirst().orElse(null);
        // System.out.println(first);

        // Boolean doesExist = notes.stream().anyMatch(n->n<10);
        // System.out.println(doesExist);

        // int sum = notes.stream().reduce(0, (p, n)->p+n);
        // System.out.println(sum);
        
        // List sum = notes.stream().distinct().toList();
        // System.out.println(sum);    
        
        List<Integer> notess = notes.stream().sorted(Collections.reverseOrder()).limit(3).toList();
        // System.out.println(notess);
        notess.forEach(System.out::println);
    }
}
