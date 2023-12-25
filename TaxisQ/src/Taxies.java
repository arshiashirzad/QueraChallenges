import java.util.Arrays;
import java.util.Scanner;
public class Taxies {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int taxies = input.nextInt();
        for(int i = 1 ; i<=taxies ; i++){
            int upset =4;
            int firstP = input.nextInt();
            int secondP = input.nextInt();
            int thirdP = input.nextInt();
            int fourthP = input.nextInt();
            int[]  car1 = {firstP,secondP,thirdP,fourthP };
            int[] car ;
            int upsetTemp=0;
            for(int j =0 ; j<=3 ; j++){
                car = deleteElement(car1, j);
                if(car[2]> car[1]){
                    upsetTemp++;
                }
                if(car[1] > car[0]){
                    upsetTemp++;
                }
                if(car[2] > car[0]){
                    upsetTemp++;
                }
                if(upsetTemp < upset){
                    upset = upsetTemp;
                }
                upsetTemp= 0;
            }
            System.out.println(upset);
        }
    }
    private static int findMaximumIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    private static int[] deleteElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }
}
