/*
 *     Bubble Sort
 * 
 *     Idea - Large elements come to the end of array by Swapping With adjacent elements
 */

 
public class Main
{
  public static void main(String[] args) {  
    int[] a = {14,33,27,35,10};  
    for(int i=0;i<4;i++)  
    {  
        for (int j=0;j<4;j++)  
        {  
            if(a[j]>a[j+1])  
            {  
                int temp = a[j];  
                a[j]=a[j+1];  
                a[j+1] = temp;   
            }  
        }  
    } 
	  
System.out.println("Printing Sorted List ...");  
    for(int i=0;i<5;i++)  
    {  
        System.out.print(a[i]+" ");  
    }  
}  
}  


/*
 *    Output:
 *    0 1 2 3 4 5 6 7 8
 */
