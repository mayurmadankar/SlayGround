import java.util.* ;

import java.io.*; 

 

public class Solution {

 

   public static List<List<Integer>> fahrenheitToCelsius(int s, int e, int w) {

      // Write your code here

   //      int s=0;

    //    int e=100;

    //    int w=20;

       int f=0;

       int c=0;

 

       List<List<Integer>> listOfLists = new ArrayList<>();

      

       for (int i=s;i<=e;i=i+w)

       {

           List<Integer> innerList = new ArrayList<>();

           innerList.add(i);

        f=i;

          c= 5*(f-32)/9;

          innerList.add(c);

          listOfLists.add(innerList);

       }

      return listOfLists;

 

   }

 

}