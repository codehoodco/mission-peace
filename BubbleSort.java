package co.codehood.ds;

import java.util.*;

public class BubbleSort extends Object {

    public static void main(String[] args) {
        System.out.println(doBubbleSort(Arrays.asList(9, 2, 6, 4, 0, 2, 6, 4, 8)));
    }


    static List<Integer> doBubbleSort(List<Integer> integers) {
        if (integers == null) {
            return null;
        } else if (integers.size() < 2) {
            return integers;
        } else {
            int temp;
            boolean swap;
            int arraySize = integers.size();
            for (int i = 0; i < arraySize; i++) {
                swap = false;
                for (int j = arraySize - 1; j > i; j--) {
                    if (integers.get(j) < integers.get(j - 1)) {
                        temp = integers.get(j);
                        integers.set(j, integers.get(j - 1));
                        integers.set(j - 1, temp);
                        swap = true;
                    }
                }
                if (!swap) {
                    return integers;
                }
            }
            return integers;
        }
    }
}


/*
    0. If the the list is null then return null.
    1. Else if the size of the list is 0 or 1 then return the list.
    2. Else start from the last element in the list (of size n) and consider it the current index.
    3. Compare the element at the current index with the one before it.
    4. If the previous element is greater than the element at current index then swap the elements.
    5. Decrease the current index by 1.
    6. Repeat the steps 3-5 ((n-1) - m) times where n is the number of elements in the list and m is the number of completed iterations on the list.
    7. If there is no element swap in the iteration then return the list.
    8. Repeat the steps 3-7 (n-1) times.
 */