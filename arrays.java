import java.util.*;
public class arrays{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element to be inserted in the array");
        int n=sc.nextInt();
        int[] marks=new int[n];
        System.out.println("enter the elements:-");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("displaying the array of marks");
        for (int i=0;i<n;i++){
            System.out.print(marks[i]+" ");
        }
        //searching elements
        System.out.println("enter your number to search");
        int x= sc.nextInt();
        for(int i=0;i<n;i++){
            if(marks[i]==x){
                System.out.println("element found at index :"+i);
            }    
        }
        //find the maximum element
        int max = marks[0];
        for (int i=0;i<n;i++){
            if(marks[i]==max){
              marks[i]=max;
                System.out.println("highest marks: "+marks[i]);
            }
        }
        //searching minimum element
        int min=marks[0];
        for (int i=0;i<n;i++){
            if(marks[i]==min){
              marks[i]=min;
                System.out.println("lowest marks: "+marks[i]);
            }
    }
    }
}