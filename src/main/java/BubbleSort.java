public class BubbleSort {
    public SalesRepresentative[] sort(SalesRepresentative[] salesArray) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < salesArray.length - 1; i++) {
                if (salesArray[i].getAmount() < salesArray[i + 1].getAmount()) {
                    sorted = false;
                    SalesRepresentative aux = salesArray[i];
                    salesArray[i] = salesArray[i + 1];
                    salesArray[i + 1] = aux;
                }
            }
        }
        return salesArray;
    }
}
