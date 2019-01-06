
import com.rm.datastructures.Arrays.BubbleSort;
import com.rm.datastructures.Arrays.InsertionSort;
import com.rm.datastructures.Arrays.SelectionSort;

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
        System.out.println(" ");
        System.out.println("===SelectionSort====");
        SelectionSort.sort(intArray);
        System.out.println("====================");
        System.out.println(" ");
        System.out.println("===InsertionSort====");
        InsertionSort.sort(intArray);
        System.out.println("====================");
        System.out.println(" ");




    }
}
