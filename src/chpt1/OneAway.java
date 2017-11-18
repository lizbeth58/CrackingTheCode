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
public class OneAway {
    private Scanner input;
    private String arrayA;
    private String arrayB;
    private boolean difference;
    
    public OneAway(){
        input = new Scanner(System.in);
        arrayA = input.nextLine();
        arrayB = input.nextLine();
    }
    
    public boolean oneAway(){
        if(arrayA.length() == arrayB.length()){
            return checkReplace(arrayA,arrayB);
        }else if(arrayA.length()+1 == arrayB.length()){
            return checkInsDel(arrayA,arrayB); 
        }else if(arrayA.length()-1 == arrayB.length()){
            return checkInsDel(arrayB,arrayA);
        }
        return false;
    }
    private boolean checkReplace(String a, String b){
        difference = false;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                if(difference){
                    return false;
                }
                
                difference = true;
            }
        }
        return true;
    }
    private boolean checkInsDel(String a, String b){
        int indexA = 0;
        int indexB = 0;
        
        while(indexA < a.length() && indexB < b.length()){
            if(a.charAt(indexA) != b.charAt(indexB)){
                if(indexA != indexB){
                    return false;
                }
                indexB++;
            } else {
                indexA++;
                indexB++;
            }
        }
        return true;
    }
}
