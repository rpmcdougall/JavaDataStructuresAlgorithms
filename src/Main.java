
import com.rm.datastructures.Arrays.BubbleSort;

public class Main {

    public static void main(String[] args) {


        //Arrays Seed Data
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("=====Seed Data======");
        for(int i : intArray){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        //Array Sorting
        System.out.println("=====BubbleSort=====");
        BubbleSort.sort(intArray);
        System.out.println("====================");


    }
}
