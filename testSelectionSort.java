package lab9;

/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
<<<<<<< HEAD
testPositive();
testNegative();
//testDuplicates();
//testMixed();
=======
//testPositive();
//testNegative();
testDuplicates();
testMixed();
>>>>>>> mixdup
}
    public testSelectionSort() {
    }
    /*
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        SelectionSort x = new SelectionSort();
        x.basicSelectionSort(arr);
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        for(int i = 0; i < 5; i++) {
        	assertEquals(arr[i], Sortedarr[i]);
        }
    }
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        SelectionSort y = new SelectionSort();
        y.basicSelectionSort(arr);
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        for(int i = 0; i < 5; i++) {
        	assertEquals(arr[i], Sortedarr[i]);
        }
    }
<<<<<<< HEAD
  /*  public void testMixed(){
=======
    */
    public void testMixed(){
        /** Test data contains with both positive, negative and zeros **/
>>>>>>> mixdup
    	int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 2;
        SelectionSort y = new SelectionSort();
        y.basicSelectionSort(arr);
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = 0;
        Sortedarr[3] = 2;
        Sortedarr[4] = 7;
        for(int i = 0; i < 5; i++) {
        	assertEquals(arr[i], Sortedarr[i]);
        }
    }
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = -2;
        arr[4] = -2;
        SelectionSort y = new SelectionSort();
        y.basicSelectionSort(arr);
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -2;
        Sortedarr[2] = 0;
        Sortedarr[3] = 1;
        Sortedarr[4] = 1;
        for(int i = 0; i < 5; i++) {
        	assertEquals(arr[i], Sortedarr[i]);
        }
    }
<<<<<<< HEAD
    */
=======
>>>>>>> mixdup
}
