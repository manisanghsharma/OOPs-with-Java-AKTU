import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        System.out.print("Enter Elements: ");
        for (int i = 0; i<r ; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nElements of Matrix Are: ");

        for (int i = 0; i<r ; i++){
            for(int j = 0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
