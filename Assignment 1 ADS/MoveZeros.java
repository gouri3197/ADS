public class MoveZeros {

    public static void moveZeroes(int[] arr) {
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 20, 0, 8, 15};
        moveZeroes(arr);

        
        for (int num : arr) {
            System.out.print(num + " ");
        }
     
    }
}