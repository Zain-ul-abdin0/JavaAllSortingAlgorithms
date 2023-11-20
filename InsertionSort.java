public class InsertionSort{
    public int[] insertionSort(int[] arrayTOBeSprted) {
        int temp;
        for (int i = 1; i < arrayTOBeSprted.length-1; i++) {
            for (int j = i-1 ; j >=0; j--) {
             if(arrayTOBeSprted[j]<arrayTOBeSprted[i]){
                 temp = arrayTOBeSprted[j];
                 arrayTOBeSprted[j] = arrayTOBeSprted[i];
                 arrayTOBeSprted[i] = temp;
             }
            }
        }
        return arrayTOBeSprted;
    }
}
