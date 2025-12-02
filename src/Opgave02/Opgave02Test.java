package Opgave02;

public class Opgave02Test {
    public static void main(String[] args) {
        int[] intArray = {2, 5, 1, 5, 20};
        int[] intArray2 = {2, 46, 13, 15, 20};

        System.out.println(findInterval(intArray,10,15));
        System.out.println(findInterval(intArray2,10,15));
    }

    private static int findInterval(int[] Array,int x,int y) {
        for (int index = 0; index < Array.length; index++) {
            if (Array[index] >= x && Array[index] <=y){
                return index;
            }
        }
        return -1;
    }
}