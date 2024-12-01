package problemfive;
public class MaxValue {
    public static int MaxValueOfArray(int[] arr, int len){
        if (arr == null) {
            System.out.println("No data in array");
            return 0;
        }
        if (len == 1) return arr[0];
        int max = MaxValueOfArray(arr, len - 1);
        return Math.max(arr[len - 1], max);
    }

    public static void main(String[] args) {
        int[] arr = {20,13,31,3,90,-100};
        int maxValue = MaxValueOfArray(arr, arr.length);
        System.out.println("The array's maximum value is = " + maxValue);
    }
}
