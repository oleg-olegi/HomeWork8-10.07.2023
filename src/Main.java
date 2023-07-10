public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1 - 2");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        float[] arr1 = {1.57f, 7.654f, 9.986f};
        String[] strArr = {"I", "LOVE", "learning java"};
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        for (int j = 0; j < arr1.length; j++) {
            if (j == arr1.length - 1) {
                System.out.println(arr1[j]);
            } else {
                System.out.print(arr1[j] + ", ");
            }
        }
        for (int k = 0; k < strArr.length; k++) {
            if (k == strArr.length - 1) {
                System.out.println(strArr[k]);
            } else {
                System.out.print(strArr[k] + ", ");
            }
        }
    }
}

