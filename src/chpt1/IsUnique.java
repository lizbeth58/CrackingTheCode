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
public class IsUnique {
    private Scanner input;
    private String array;
    private boolean[] alpha; 
    private int code;
    
    public IsUnique(){
        input = new Scanner(System.in);
        alpha = new boolean[128];
        array = input.nextLine();
    }
    
    public boolean IsUnique(){
        for(int i=0; i < array.length(); i++){
            if( alpha[(int)array.charAt(i)] ){
                return false;
            }else{
                alpha[(int)array.charAt(i)] = true;
            }
        }
        return true;
    }
}
