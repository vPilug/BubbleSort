import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative seller1 = new SalesRepresentative(2,300);
        SalesRepresentative seller2 = new SalesRepresentative(8,400);
        SalesRepresentative seller3 = new SalesRepresentative(3,350);

        SalesRepresentative[] array = new SalesRepresentative[3];
        array[0] = seller1;
        array[1] = seller2;
        array[2] = seller3;

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(array)));

    }
}
