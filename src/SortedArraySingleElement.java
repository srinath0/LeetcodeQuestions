import java.util.Scanner;
//public class SortedArraySingleElement {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {1,1,2,3,3,4,4,8,8};
//        int temp = 0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]!=arr[j]){
//                    temp=arr[i];
//                }
//            }
//        }
//        System.out.println(temp);
//    }
//}
public class SortedArraySingleElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int unique = 0;
        for (int i=0;i<arr.length;i++) {
            unique ^= arr[i];  // XOR operation
        }

        System.out.println("The single element is: " + unique);
    }
}

