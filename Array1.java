import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter Elements in Array ");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements in Array are : ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
