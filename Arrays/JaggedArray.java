import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[2];

        System.out.print("Enter Elements: ");

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nJagged Array is: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    } 
}
