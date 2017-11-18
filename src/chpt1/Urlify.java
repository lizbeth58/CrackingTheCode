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
public class Urlify {
    private Scanner input;
    private String string;
    private int spaces;
    private int index;
    private int trueLength;
    private char [] array;
    
   public Urlify(){
        input = new Scanner(System.in);
        spaces = 0;
    }
    
    public String urlify(){
        string = input.nextLine();
        trueLength = input.nextInt();
        
        for(int i = 0; i < trueLength-1; i++){
            if(string.charAt(i) == ' '){
                spaces++;
            }
        }
        array = string.toCharArray();
        index = trueLength+spaces*2;
        
        for(int i = trueLength-1; i >=0; i--){
            if(string.charAt(i) == ' '){
                array[index-1] = '0';
                array[index-2] = '2';
                array[index-3] = '%';
                index -= 3;
            } else {
                array[index-1] = string.charAt(i);
                index--;
            }
        }
        string = new String(array);
        return string;
    }
}
