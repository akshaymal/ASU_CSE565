import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HeapSortTest {

    private HeapSort heatSortTester;

    // Test array used in tests
    private final static ArrayList<Integer> testSortArray_1 = new ArrayList<Integer>(Arrays.asList(9,5,3,6));
    private final static ArrayList<Integer> testSortArray_2 = new ArrayList<Integer>(Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE));
    private final static ArrayList<Integer> testSortArray_3 = new ArrayList<Integer>();
    private final static ArrayList<Integer> testSortArray_4 = new ArrayList<Integer>(Collections.singletonList(0));
    private final static ArrayList<Integer> testSortArray_5 = new ArrayList<Integer>(Arrays.asList(10,5,15,6,7,4,5,2,3,5,2,3,2));

    private final static ArrayList<Integer> testHeapifyArray_1 = new ArrayList<Integer>(Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE));
    private final static ArrayList<Integer> testHeapifyArray_2 = new ArrayList<Integer>(Collections.singletonList(0));
    private final static ArrayList<Integer> testHeapifyArray_3 = new ArrayList<Integer>(Arrays.asList(10,5,15,6,7,4,5,2,3,5,2,3,2));



    @Before
    public void setUp() {
        heatSortTester = new HeapSort();
    }

    @Test
    public void testSort1() {
        ArrayList<Integer> result = new ArrayList<Integer>(testSortArray_1);
        Collections.sort(result);

        heatSortTester.sort(testSortArray_1);

        assertArrayEquals(testSortArray_1.toArray(), result.toArray());
    }

    @Test
    public void testSort2() {
        ArrayList<Integer> result = new ArrayList<Integer>(testSortArray_2);
        Collections.sort(result);

        heatSortTester.sort(testSortArray_2);

        assertArrayEquals(testSortArray_2.toArray(), result.toArray());
    }

    @Test
    public void testSort3() {
        ArrayList<Integer> result = new ArrayList<Integer>(testSortArray_3);
        Collections.sort(result);

        heatSortTester.sort(testSortArray_3);

        assertArrayEquals(testSortArray_3.toArray(), result.toArray());
    }

    @Test
    public void testSort4() {
        ArrayList<Integer> result = new ArrayList<Integer>(testSortArray_4);
        Collections.sort(result);

        heatSortTester.sort(testSortArray_4);

        assertArrayEquals(testSortArray_4.toArray(), result.toArray());
    }

    @Test
    public void testSort5() {
        ArrayList<Integer> result = new ArrayList<Integer>(testSortArray_5);
        Collections.sort(result);

        heatSortTester.sort(testSortArray_5);

        assertArrayEquals(testSortArray_5.toArray(), result.toArray());
    }

    @Test
    public void testHeapify1() {
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE));

        heatSortTester.heapify(testHeapifyArray_1, result.size(), 0);

        assertArrayEquals(testHeapifyArray_1.toArray(), result.toArray());
    }

    @Test
    public void testHeapify2() {
        ArrayList<Integer> result = new ArrayList<Integer>(testHeapifyArray_2);

        heatSortTester.heapify(testHeapifyArray_2, result.size(), 0);

        assertArrayEquals(testHeapifyArray_2.toArray(), result.toArray());
    }

    @Test
    public void testHeapify3() {
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(10,7,15,6,5,4,5,2,3,5,2,3,2));

        heatSortTester.heapify(testHeapifyArray_3, result.size(), 1);

        assertArrayEquals(testHeapifyArray_3.toArray(), result.toArray());
    }
}