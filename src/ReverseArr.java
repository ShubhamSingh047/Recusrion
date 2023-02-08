public class ReverseArr {
    static void Swap(int[] arr, int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //single pointers
    static int[] Singlptr(int arr[], int start){
        if(start== arr.length/2){
            return arr;
        }
        Swap(arr, start, arr.length-start-1);
        return Singlptr(arr, start+1);
    }

    //doublr pointers
    static int[] Doubleptr(int[] arr,int start, int end){
        if(start>=end){
            return arr;
        }
//        arr[start]= arr[start] ^ arr[end-1];
        Swap(arr, start, end-1);
        return Doubleptr(arr, start+1, end-1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[]arr2={6,7,8,9,0};
        int[] res2=Singlptr(arr2,0);
        int[] res=Doubleptr(arr, 0, 5);
        System.out.println("First arr");
        for(int x: res) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Second Arr");
        for(int x: res2) {
            System.out.print(x+" ");
        }
    }
}
