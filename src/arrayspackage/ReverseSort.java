package arrayspackage;

import java.util.Comparator;

public class ReverseSort implements Comparator<Integer>{
// -ve if o1<o2, 0 if o1=o2, +ve if o1>o2
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }

    
    
}
