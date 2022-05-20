package ss11StackQueue.BaiTap.DaoNguocPhanTuTrongMangSoNguyenSuDungStack;

import java.util.Arrays;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 2, 5, 65, 5, 2, 5};
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }
        System.out.println(" Mảng số nguyên đầu: " + stack.toString());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Mảng số nguyên sau khi đảo: " + Arrays.toString(arr));
        //Đảo ngược phần tử trong mảng số nguyên sử dụng Stack
        // 1.Khởi tạo một Stack rỗng, có kiểu số.
//    public static void main(String[] args) {
//        //2. Với n phần tử của mảng, lần lượt đưa vào Stack thông qua hàm Push: Push a[i] into Stack.
//        int[] arr = {5, 5, 8, 78, 46, 6, 6, 56};
//        Stack<Integer> stack = new Stack<>();
//        for (int num : arr) {
//            stack.push(num);
//        }
//        System.out.println("Mãng số nguyên ban đâu là: " + stack.toString());
//        ///3. Lần lượt lấy ra từ Stack n phần tử và đưa vào trở lại mảng ban đầu:
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = stack.pop();
//        }
//        System.out.println("Sau khi đảo là: " + Arrays.toString(arr) + "\n");
//Đảo ngược chuỗi sử dụng Stack
        // Tạo một wStack rỗng.
        String chart = "Ngo Dinh Nhat Tuan";
        char[] arr2 = chart.toCharArray();
        Stack<Character> stackChar = new Stack<>();
        for (char word: arr2){
            stackChar.push(word);
        }
        System.out.println("Chuỗi ký tự: "+ stackChar.toString());
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=stackChar.pop();
        }
        System.out.println("Chuỗi ký tự: "+ Arrays.toString(arr2));
//        String chart = "Nguyen Huu Duc";
//        //toCharArray() chuyển chuỗi thành ký tự
//        char[] arr2 = chart.toCharArray();
//        Stack<Character> stackChar = new Stack<>();
//        //2. Với mỗi từ mWord đọc được từ string, đưa từ đó vào Stack: Push mWord vào wStack.
//        for (char word : arr2) {
//            stackChar.push(word);
//        }
//        System.out.println("Chuỗi ban đầu là: " + stackChar.toString());
//        //3. Đọc từ wStack cho đến hết, thực hiện:
//            //Pop một word từ wStack vào mWord.
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = stackChar.pop();
//        }
//        System.out.println("Sau khi đảo là: " + Arrays.toString(arr2));
    }
}