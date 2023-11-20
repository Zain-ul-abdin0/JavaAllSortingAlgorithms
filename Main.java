public class Main {
    public static void main(String[] args){

        // Bubble Sort

//        BubbleSort bubbleSort = new BubbleSort();
//        int[] results = bubbleSort.bubbleSort(new int[]{5, 4, 3, 2, 1});
//        for(int array : results){
//            System.out.println(array);
//        }

        //Selection Sort

//        SelectionSort selectionSort = new SelectionSort();
//        int[] results = selectionSort.selectionSort(new int[]{5, 4, 3, 2, 1});
//        for(int array : results){
//            System.out.println(array);
//        }

        //InsertionSort
//        InsertionSort insertionSort = new InsertionSort();
//        int[] results = insertionSort.insertionSort(new int[]{5, 4, 3, 2, 1});
//        for(int array : results){
//            System.out.println(array);
//        }

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(new int[]{5, 4, 3, 2, 1});

    }
}
