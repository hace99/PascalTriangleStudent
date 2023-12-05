package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows){

        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> prec = new ArrayList<Integer>();

        prec.add(1);
        System.out.print("[[1]");
        triangle.add(prec);

        for(int i = 0; i < numRows - 1; i++){

            List<Integer> row = new ArrayList<Integer>();

            row.add(1);
            for(int j = 0; j < prec.size() - 1; j++){
                row.add(prec.get(j) + prec.get(j + 1));
            }
            row.add(1);

            System.out.print(",[");

            int count = 0;
            for(Integer n : row) {


                if(count==0) {
                    System.out.print(n);
                }
                else {
                    System.out.print("," + n);
                }

                count++;
            }
            System.out.print("]");

            triangle.add(row);
            prec = row;
        }
        System.out.print("]");
        return triangle;
    }

    public static void main(String args[]) {

        PascalTriangle t1 = new PascalTriangle();

        Scanner scanner = new Scanner(System.in);
        int numRows;

        System.out.print("Enter the number of rows: ");
        numRows = scanner.nextInt();

        t1.generate(numRows);
    }

}