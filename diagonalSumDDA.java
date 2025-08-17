// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class diagonalSum {
   public diagonalSum() {
   }

   public static int leftDiagonal(int[][] var0, int var1, int var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < var1; ++var4) {
         for(int var5 = 0; var5 < var2; ++var5) {
            if (var4 == var5) {
               var3 += var0[var4][var5];
            }
         }
      }

      return var3;
   }

   public static int rightDiagonal(int[][] var0, int var1, int var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < var1; ++var4) {
         var3 += var0[var4][var2 - 1 - var4];
      }

      return var3;
   }

   public static void main(String[] var0) {
      System.out.println("Its a Diagonal program :-");
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the number of rows = ");
      int var2 = var1.nextInt();
      System.out.println();
      System.out.print("Enter the number of columns = ");
      int var3 = var1.nextInt();
      System.out.println();
      int[][] var4 = new int[var2][var3];
      System.out.println("Enter the matrix elements");

      int var5;
      int var6;
      for(var5 = 0; var5 < var2; ++var5) {
         for(var6 = 0; var6 < var3; ++var6) {
            var4[var5][var6] = var1.nextInt();
         }
      }

      System.out.println("The matrix is :-");

      for(var5 = 0; var5 < var2; ++var5) {
         for(var6 = 0; var6 < var3; ++var6) {
            System.out.print(var4[var5][var6] + " ");
         }

         System.out.println();
      }

      var5 = leftDiagonal(var4, var2, var3);
      System.out.println("Left diagonal sum is = " + var5);
      var6 = rightDiagonal(var4, var2, var3);
      System.out.println("Left diagonal sum is = " + var6);
      int var7 = var5 + var6;
      System.out.println("The sum of Diagonal elements is = " + var7);
   }
}
