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
public class RotateMatrix {
    private Scanner input;
    private int [][] image;
    private int n;
    
    public RotateMatrix(){
        input = new Scanner(System.in);
        
        n = input.nextInt();
        image = new int[n][n];
        
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n; j++){
                image[i][j] = input.nextInt();
            }
        }
    }
    public void RotateMatrix(){
        if(n == 0){
            return;
        }
        
        int first;
        int last;
        int offset;
        int top;
        
        for(int layer = 0; layer < n/2; layer++){
            first = layer;
            last = n - 1 - layer;
            
            for(int i = first; i < last; i++){
                offset = i - first;
                
                top = image[first][i];
                
                image[first][i] = image[last-offset][first];
                image[last-offset][first] = image[last][last-offset];
                image[last][last-offset] = image[i][last];
                image[i][last] = top;
            }
        }
    }
    
    public void printMatrix(){
        System.out.println();
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n; j++){
                System.out.print(image[i][j]);
            }
            System.out.println();
        }
    }
}
