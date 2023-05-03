import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {
    @Test
    public void sort_works() {
        SalesRepresentative seller1 = new SalesRepresentative(2,300);
        SalesRepresentative seller2 = new SalesRepresentative(8,400);
        SalesRepresentative seller3 = new SalesRepresentative(3,350);

        SalesRepresentative[] array = new SalesRepresentative[3];
        array[0] = seller1;
        array[1] = seller2;
        array[2] = seller3;

        SalesRepresentative[] expectedSortedArray = new SalesRepresentative[3];
        expectedSortedArray[0] = seller2;
        expectedSortedArray[1] = seller3;
        expectedSortedArray[2] = seller1;


        BubbleSort bubbleSort = new BubbleSort();
        SalesRepresentative[] sortedArray = bubbleSort.sort(array);
        Assertions.assertArrayEquals(expectedSortedArray,sortedArray);
    }

    @Test
    public void sort_doesnt_work() {
        SalesRepresentative seller1 = new SalesRepresentative(2,300);
        SalesRepresentative seller2 = new SalesRepresentative(8,400);
        SalesRepresentative seller3 = new SalesRepresentative(3,350);

        SalesRepresentative[] array = new SalesRepresentative[3];
        array[0] = seller1;
        array[1] = seller2;
        array[2] = seller3;

        SalesRepresentative[] expectedSortedArray = new SalesRepresentative[3];
        expectedSortedArray[0] = seller3;
        expectedSortedArray[1] = seller2;
        expectedSortedArray[2] = seller1;


        BubbleSort bubbleSort = new BubbleSort();
        SalesRepresentative[] sortedArray = bubbleSort.sort(array);
        Assertions.assertFalse(Arrays.equals(expectedSortedArray,sortedArray));
    }
}
