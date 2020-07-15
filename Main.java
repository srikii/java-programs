import java.util.*;
class Main{ 
    // Function to add x in arr
    public static int[] add_element(int n, int myarray[], int ele) 
    { 
         int i; 
 
         int newArray[] = new int[n + 1]; 
        //copy original array into new array
        for (i = 0; i < n; i++) 
              newArray[i] = myarray[i]; 
 
        //add element to the new array
        newArray[n] = ele; 
 
        returnnewArray; 
    } 
 