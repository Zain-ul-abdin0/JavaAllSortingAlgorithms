public class MergeSort {
    public void mergeSort(int[] arrayToBeSortes){
        if(arrayToBeSortes.length == 0){
            return;
        }else{
            int[] newArrayToBeSort = new int[arrayToBeSortes.length-1];
            for(int i=0; i<arrayToBeSortes.length-1; i++){
                newArrayToBeSort[i] = arrayToBeSortes[i];
            }
            mergeSort(newArrayToBeSort);
            System.out.println("Lpopo");
            for(int element : newArrayToBeSort){
                System.out.println(element);
            }
        }
    }
}
