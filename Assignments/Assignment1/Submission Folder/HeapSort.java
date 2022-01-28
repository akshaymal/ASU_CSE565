import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HeapSort {

    void sort(ArrayList<Integer> inputArray)
    {
        int n = inputArray.size();

        for (int i = n / 2 - 1; i >= 0; i--){
            heapify(inputArray, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            Collections.swap(inputArray, 0, i);
            heapify(inputArray, i, 0);
        }
    }

    void heapify(ArrayList<Integer> inputArray, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        if (l < n && inputArray.get(l) > inputArray.get(largest))
            largest = l;
        if (r < n && inputArray.get(r) > inputArray.get(largest))
            largest = r;

        if (largest != i) {
            Collections.swap(inputArray, i, largest);
            heapify(inputArray, n, largest);
        }
    }

    // Driver code
    public static void main(String args[])
    {
        ArrayList<Integer> inputArray = new ArrayList<Integer>(Arrays.asList(6,5,3,10,8,9));
        HeapSort ob = new HeapSort();
        ob.sort(inputArray);
        System.out.print(inputArray);
    }
}