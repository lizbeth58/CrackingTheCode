/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chpt1;

import java.util.Scanner;

/**
 *
 * @author elizabeth
 */
public class ZeroMatrix {
    private Scanner input;
    private boolean hasZeroRow;
    private boolean hasZeroCol;
    private int rows;
    private int cols;
    private int [][] matrix;
    
    public ZeroMatrix(){
        input = new Scanner(System.in);
        
        rows = input.nextInt();
        cols = input.nextInt();
     
        matrix = new int[rows][cols];
        
        for(int i = 0; i < rows; i++ ){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = input.nextInt();
            }
        }
    }
    public void zero(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if(i == 0){
                        hasZeroRow = true;
                    }
                    if(j == 0){
                        hasZeroCol = true;
                    }
                }
            }
        }
        
        for(int i = 1; i < rows; i++){
            if(matrix[i][0] == 0){
                zeroRow(i);
            }
        }
        
        for(int j = 1; j < cols; j++){
            if(matrix[0][j] == 0){
              zeroCol(j);
            }
        }
        
        if(hasZeroRow){
            zeroRow(0);
        }
        if(hasZeroCol){
            zeroCol(0);
        }
    }
    
    public void zeroRow(int i){
        for(int j = 0; j < cols; j++){
            matrix[i][j] = 0;
        }
    }
    public void zeroCol(int j){
        for(int i = 0; i < rows; i++){
            matrix[i][j] = 0;
        }
    }
    public void printMatrix(){
        System.out.println();
        for(int i = 0; i < rows; i++ ){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
