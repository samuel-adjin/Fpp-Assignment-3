package problemfive;
public class MaximumArrayValue {
    public static void main(String[] args) {
        System.out.println(maxArrayValue(new int[]{10,-45,32,100,10,90},0));
    }
    public static int maxArrayValue(int[] arr, int pos) {
        if(arr == null || arr.length == 0){
            return 0;
        }
        if(arr.length-1 == pos){
            return arr[pos];
        }
        int max = arr[pos];
        int nextVal = maxArrayValue(arr, pos + 1);
        return Math.max(nextVal, max);

    }
}
