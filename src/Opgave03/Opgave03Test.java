package Opgave03;

public class Opgave03Test {
    public static void main(String[] args) {
        int[] testArray1 = { 23, 54, 23, 975, 2, 13 }; //false
        int[] testArray2 = { 42, 51, 45, 45, 42, 17 }; //true

        System.out.println(toEfterhinaden(testArray1));
        System.out.println(toEfterhinaden(testArray2));
    }

    private static boolean toEfterhinaden(int[] array) {
        for (int index = 0; index < array.length-1; index++) {
            if (array[index] == array[index+1]){
                return true;
            }
        }
        return false;
    }
}
