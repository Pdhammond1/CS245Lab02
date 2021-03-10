import java.util.Arrays;
import java.util.Scanner;

public class Lab02 {
    public int [] twoSum(int[] sum0, int sum1){
        int [] ans = new int[1];
        for (int i = 0; i < sum0.length; i++) {
            for (int j = i + 1; j < sum0.length; j++) {
                if (sum0[j] == sum1 - sum0[i]) {
                    ans = new int[] {i, j};
                    return ans;
                }
                else{
                    ans = new int [] {-1};
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Lab02 test1 = new Lab02();
        int [] arr = new int[4];
        for (int i = 0; i <= arr.length-1; i++){
            arr[i]=i+3;
        }
        int target=20;
        int [] indices = new int[1];
        indices = test1.twoSum(arr,target);

        System.out.println(Arrays.toString(indices));
    }
}