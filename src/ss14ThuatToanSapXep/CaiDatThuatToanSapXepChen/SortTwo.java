package ss14ThuatToanSapXep.CaiDatThuatToanSapXepChen;

import java.util.Arrays;
import java.util.Scanner;

public class SortTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đồ dài của mảng:");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Nhập " + arr.length + " phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int index, arrIndex;
        for (int i = 1; i < arr.length; i++) {
            arrIndex = arr[i];
            index = i;
            while (index > 0 && arrIndex < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = arrIndex;
        }
        System.out.println("Mảng sau khi sắp xếp là " + Arrays.toString(arr));
    }
}