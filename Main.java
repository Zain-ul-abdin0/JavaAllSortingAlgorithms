public class Main {
    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] results = bubbleSort.bubbleSort(new int[]{5, 4, 3, 2, 1});
        for(int array : results){
            System.out.println(array);
        }
    }
}
