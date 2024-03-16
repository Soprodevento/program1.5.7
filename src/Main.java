import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 7, 5};
        int[] secondArray = {8, 4, 2, 22};
        int[] mergedArray = mergeAndSort(firstArray, secondArray);
        bubbleSort(mergedArray);
        System.out.print(Arrays.toString(mergedArray));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, mergedArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, mergedArray, firstArray.length, secondArray.length);
        return mergedArray;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}