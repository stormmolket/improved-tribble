import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Arrays;
import java.util.Scanner;

public class Reading2DArrayFromFile {
   public static void main(String args[]) throws Exception {
      Scanner sc = new Scanner(new BufferedReader(new FileReader("bigMatrix.txt")));
      int rows = 1000;
      int columns = 10;
      double [][] myArray = new double[rows][columns];
      while(sc.hasNextLine()) {
         for (int i=0; i<myArray.length; i++) {
            String[] line = sc.nextLine().trim().split("\\s+");
            for (int j=0; j<line.length; j++) {
               myArray[i][j] = Double.parseDouble(line[j]);
            }
         }
      }
      System.out.println("Col 1");
      for (int j = 0; j<myArray[j].length; j++){
         
         int k = 0;
            // for (int k = 0; k<myArray[k].length; k++){
         System.out.println(myArray[j][k]);
         
        
   }

   }
}