import java.util.Scanner;

public class helloword {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    static void addToEnd(int[] array){
        int length = array.length;
        int[] newArray = new int[length];
        System.out.println("Nhap gia tri muon them");
        int newValue = sc.nextInt();
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        newArray[length] = newValue;
    }
}
