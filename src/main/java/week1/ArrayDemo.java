package week1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        int[] firstArray;

        myList.add(100);
        myList.add(200);
        myList.add(300);
        myList.add(400);
        myList.add(500);
        myList.add(600);
        myList.add(700);
        myList.add(800);
        myList.add(900);
        myList.add(1000);

        //arrayList
        for(int i : myList){
            System.out.println(i);
        }

        firstArray = new int[10];

        firstArray[0] = 100;
        firstArray[1] = 200;
        firstArray[2] = 300;
        firstArray[3] = 400;
        firstArray[4] = 500;
        firstArray[5] = 600;
        firstArray[6] = 700;
        firstArray[7] = 800;
        firstArray[8] = 900;
        firstArray[9] = 1000;
        loop(myList);



        //prints
        System.out.println("Element at 0: " +firstArray[0]);
        System.out.println("Element at 1: " +firstArray[1]);
        System.out.println("Element at 2: " +firstArray[2]);
        System.out.println("Element at 3: " +firstArray[3]);
        System.out.println("Element at 4: " +firstArray[4]);
        System.out.println("Element at 5: " +firstArray[5]);
        System.out.println("Element at 6: " +firstArray[6]);
        System.out.println("Element at 7: " +firstArray[7]);
        System.out.println("Element at 8: " +firstArray[8]);
        System.out.println("Element at 9: " +firstArray[9]);


        //user is prompted for a new value
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Please enter a value: ");
            myList.add(sc.nextInt());
            loop(myList);

        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("Too big value of memory block" + e);
        }




    }
    public static void loop(ArrayList<Integer> someArrayList)
    {
        int indexValue = 0;
        for(int value: someArrayList)
        {
            System.out.println("Element at index" + indexValue + " : " + value);
            indexValue++;
        }

    }
}
