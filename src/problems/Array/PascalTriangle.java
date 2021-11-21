package problems.Array;

import java.util.ArrayList;
import java.util.List;

//Leetcode problem 118
//Link to problem : https://leetcode.com/problems/pascals-triangle/
public class PascalTriangle {

    public static void main(String[] args) {

        System.out.println(generate(5));
    }


    public static List<List<Integer>> generate(int numRows) {

List<List<Integer>> triangle =  new ArrayList<>();

if (numRows<0){
    return triangle;
}
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

for (int i=1; i<numRows; i++){

    List<Integer> previous_row = triangle.get(i-1);
    List<Integer> current_row= new ArrayList<>();
    current_row.add(1);
    for (int j=1; j<i; j++){
        current_row.add(previous_row.get(j-1)+previous_row.get(j));
    }
    current_row.add(1);
    triangle.add(current_row);
}

        return triangle;


    }


}
