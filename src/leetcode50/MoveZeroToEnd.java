package leetcode50;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {3,0,0,5,4};
        int[] res= getZerosToEnd(arr);
        for (int i : res){
            System.out.print(i + " ");
        }
    }
    public static int[] getZerosToEnd(int[] arr){
        int next=0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[next];
                arr[next] = temp;
                next++;
            }
        }
        return arr;
    }
}
