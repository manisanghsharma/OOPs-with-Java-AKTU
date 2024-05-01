import java.util.Scanner;

public class UseArray {
    int maxElement(int a[]){
    int max = Integer.MIN_VALUE;

    for(int i = 0; i< a.length; i++){
        if (a[i] > max){
            max = a[i];
        }
    }

    return max;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter Array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Your Array: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        UseArray obj = new UseArray();
        int max_ele = obj.maxElement(arr);

        System.out.println("\nMax Element: " + max_ele);
    }
}
