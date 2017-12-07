/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chpt2;

import java.util.*;

/**
 *
 * @author elizabeth
 */
public class RemoveDups {
    private Scanner sc;
    private LinkedList list;
    private int size;
    private HashSet set;
    
    public RemoveDups(){
        sc = new Scanner(System.in);
        list = new LinkedList();
        set = new HashSet();
        
        
        size = sc.nextInt();
        for(int i = 0; i < size; i++){
            list.add(sc.nextInt());
        }
    }
    
    public void remove(){
        for(int i = 0; i < list.size(); i++){
            if(set.contains(list.get(i))){
                list.remove(i);
                i-=1;
            }else{
                set.add(list.get(i));
            }
        }
    }
    
    public void printList(){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
    
    
}
