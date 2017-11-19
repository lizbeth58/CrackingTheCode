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
public class StringCompress {
    private Scanner input;
    private String stringToCompress;
    private StringBuilder compressedString;
    private int count;
    
    public StringCompress(){
        input = new Scanner(System.in);
        stringToCompress = input.nextLine();
        compressedString = new StringBuilder("");
        count = 0;
    }
    
    public String compress(){
        for(int i = 0;i < stringToCompress.length(); i++){
            count++;
            if(i+1 >= stringToCompress.length() || stringToCompress.charAt(i) != stringToCompress.charAt(i+1)){
                compressedString.append(stringToCompress.charAt(i) + String.valueOf(count));
                count = 0;
            }
        }
        return compressedString.length() > stringToCompress.length()? stringToCompress : compressedString.toString();
    }
}
