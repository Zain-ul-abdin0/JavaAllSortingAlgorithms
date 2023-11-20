public class BubbleSort {
    int temp;
    public int[] bubbleSort(int[] arrayTOBeSprted) {
        for (int i = 0; i < arrayTOBeSprted.length ; i++) {
            for (int j = 0; j < arrayTOBeSprted.length - 1; j++) {
                if (arrayTOBeSprted[j] > arrayTOBeSprted[j + 1]) {
                    temp = arrayTOBeSprted[j];
                    arrayTOBeSprted[j] = arrayTOBeSprted[j + 1];
                    arrayTOBeSprted[j + 1] = temp;
                }
            }
        }
        return arrayTOBeSprted;
    }
}
