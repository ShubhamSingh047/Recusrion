public class MaxArray {
    static int Solution(int arr[], int i){
        if(i==0) return arr[i];
        int max = Solution(arr, i-1);
        if(max>arr[i]){
            return max;
        }else{
            return arr[i];
        }
    }

    public static void main(String[] args) {
        int arr[]={10,2,3,7,5};
        int res=Solution(arr,4);
        System.out.println(res);
    }
}
