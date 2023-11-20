public class SelectionSort {
    int minimum, temp;

    public int[] selectionSort(int[] arrayTOBeSprted) {
        for (int i = 0; i < arrayTOBeSprted.length-1; i++) {
            minimum = i;
            for (int j = i + 1; j < arrayTOBeSprted.length; j++) {
                if (arrayTOBeSprted[j] < arrayTOBeSprted[minimum]) {
                  minimum = j;
                }
            }
            temp = arrayTOBeSprted[i];
            arrayTOBeSprted[i] = arrayTOBeSprted[minimum];
            arrayTOBeSprted[minimum] = temp;

        }
        return arrayTOBeSprted;
    }
}
