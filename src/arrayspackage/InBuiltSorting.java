package arrayspackage;

import java.util.Arrays;

public class InBuiltSorting {

    public static void main(String[] args) {
        Integer[] a = {222, 3, 4, 55, 4, 2, -9, 0};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, new ReverseSort());
        System.out.println(Arrays.toString(a));
    }

}
