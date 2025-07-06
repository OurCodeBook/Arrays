import java.util.Scanner;
public class Array2D {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int i,j;
        int a[][] = new int[3][3];
        System.out.println("Enter Elements in Array : ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                 a[i][j] = sc.nextInt();
            }
        }
        sc.close();
    System.out.println("The Elements in Array : ");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
}
