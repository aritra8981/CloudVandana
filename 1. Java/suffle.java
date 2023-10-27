// A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class suffle {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        Collections.shuffle(list);
        System.out.println(list);
    }
}