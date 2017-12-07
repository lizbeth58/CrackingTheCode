/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chpt2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author elizabeth
 */
public class KToLast {
    private Scanner sc;
    private LinkedList<Integer> list;
    private int size;
    
    public KToLast(){
        sc = new Scanner(System.in);
        list = new LinkedList();
        
        size = sc.nextInt();
        for(int i = 0; i < size; i++){
            list.add(sc.nextInt());
        }
    }
    public int isK(int i){
        int element = list.size() - i;
        return list.get(element);
    }
}
