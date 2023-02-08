public class AllIndices {
    static int[] Solution(int arr[], int i, int n, int fnf){
        if(i==arr.length){
            return new int[fnf];
        }
        if(arr[i]==n){
            int iarr[]=Solution(arr, i+1, n, fnf+1);
            iarr[fnf]=i;
            return iarr;
        }
        else{
             int iarr[]=Solution(arr, i+1, n, fnf);
             return iarr;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,3};
        int[] res=Solution(arr, 0, 3, 0);
        for(int x:res) {
            System.out.print(x+" ");
        }
    }
}
