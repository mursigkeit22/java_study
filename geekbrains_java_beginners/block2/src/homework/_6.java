package homework;

import java.util.Arrays;

//6. Написать метод,
// в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место,
// в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
// checkBalance ([2, 1, 1, 2, 1]) → false,
// checkBalance ([10, || 10]) → true, граница показана символами ||,
// эти символы в массив не входят;
public class _6 {
    public static void main(String[] args) {
       int [] a = {10, 10};
       int [] b = {1, 1, 1, 2, 1};
       int [] c ={2, 1, 1, 2, 1};
       int [] d = { 10};


        _6 _6 = new _6();
//        System.out.println(_6.checkBalance(a));
//        System.out.println(_6.checkBalance(b));
        System.out.println(_6.checkBalance(d));

    }
    public Boolean checkBalance(int [] arr){
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            int [] left = Arrays.copyOfRange(arr, 0, i);
            int [] right = Arrays.copyOfRange(arr, i, arr.length);
            int leftSum = Arrays.stream(left).sum();
            int rightSum = Arrays.stream(right).sum();
            if (leftSum == rightSum){
                System.out.print(Arrays.toString(left) + "\t");
                System.out.println(Arrays.toString(right));
                return true;}

        }
        return false;
    }
}
