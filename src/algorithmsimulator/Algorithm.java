/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsimulator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Chamath Abeysinghe
 */
public abstract class Algorithm {
    
    List<String> lines=new ArrayList<>();   //code lines to print
    HashMap<String,String> variableList=new HashMap<>();    //variable lines to print
    private int currentLineNumber=0;    //current line number
    int sortArray[];
    public Algorithm(int array[]){
        sortArray=array;
    }
        
    
    
    
    protected void addCodeLine(String s){
        lines.add(s);
    }
    protected void changeVariable(String name,String value){
        variableList.put(name, value);
    }
    
    public int executeLine(){
        return -1;
    }
    
    
    
    
    
}
