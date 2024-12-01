package problemthree;
public class ReverseArray {
    //Homework 3 - problem three
    public static void reverseArray(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;
        else {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            reverseArray(arr, ++startIndex, --endIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr = {90,19, 90, 130, 91};
        reverseArray(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.print(a + " " );
        }
    }
}
