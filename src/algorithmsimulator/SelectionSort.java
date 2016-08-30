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
public class SelectionSort  {
    
     
    List<String> lines=new ArrayList<>();   //code lines to print
    HashMap<String,String> variableList=new HashMap<>();    //variable lines to print
    int sortArray[];
    int selectedIndex1=-1;//for i
    int selectedIndex2=-1;//for j
    int selectedIndex3=-1;//for minimum in RHS
    
    
    int index_algo;
    int[] arr_algo;
    int i_algo;
    int j_algo;
    int smallNumber_algo;
    
    
    int currentLine=0;
    int previousLine=-1;
    
    public SelectionSort(int[] array) {
        sortArray=array;
        arr_algo=array;
        addLines();
    }
    
    
    void addLines(){
        lines.add("public static int[] doSelectionSort(int[] arr){"); //0
        lines.add("     for (int i = 0; i < arr.length - 1; i++){");//1
        lines.add("       int index = i;");//2
        lines.add("       for (int j = i + 1; j < arr.length; j++){");//3
        lines.add("           if (arr[j] < arr[index]){");//4
        lines.add("                index = j;");//5
        lines.add("           }");//6
        lines.add("        }");//7
        lines.add("        int smallerNumber = arr[index]; ");//8
        lines.add("        arr[index] = arr[i];");//9
        lines.add("        arr[i] = smallerNumber;");//10
        lines.add("     }");//11
        lines.add("     return arr;");//12
        lines.add("}");//13
    }
    
    public void execute(){
        previousLine=currentLine;
        if(currentLine==0){
            currentLine=1;
            i_algo=0;
            
        }
        
        else if(currentLine==1){
            if(i_algo<arr_algo.length-1){
                variableList.put("i", String.valueOf(i_algo));
                selectedIndex1=i_algo;
//                i_algo++;
                currentLine=2;
            }
            else{
                currentLine=11;
            }
            
        }
        
        else if(currentLine==2){
            index_algo=i_algo;
            variableList.put("index", String.valueOf(index_algo));
            selectedIndex3=index_algo;
            currentLine=3;
            j_algo=i_algo+1;
            
        }
        else if(currentLine==3){
            if(j_algo<arr_algo.length){
                variableList.put("j", String.valueOf(j_algo));
                selectedIndex2=j_algo;
                currentLine=4;
            }
            else{
                currentLine=7;
            }
        }
        
        else if(currentLine==4){
            if(arr_algo[j_algo]<arr_algo[index_algo]){
                currentLine=5;
            }
            else{
                currentLine=6;
            }
            
        }
        
        else if(currentLine==5){
            index_algo=j_algo;
            variableList.put("index", String.valueOf(index_algo));
            selectedIndex3=index_algo;
            currentLine=6;
        }
        
        
        else if(currentLine==6){
            j_algo=j_algo+1;
            currentLine=3;
        }
        
        else if(currentLine==7){
            variableList.remove("j");
            selectedIndex2=-1;
            currentLine=8;
        }
        
        else if(currentLine==8){
            smallNumber_algo=arr_algo[index_algo];
            variableList.put("smallNumber", String.valueOf(smallNumber_algo));
            currentLine=9;
        }
        
        else if(currentLine==9){
            arr_algo[index_algo]=arr_algo[i_algo];
            currentLine=10;
        }
        else if(currentLine==10){
            arr_algo[i_algo]=smallNumber_algo;
            currentLine=1;
            variableList.remove("smallNumber");      
            variableList.remove("index");
            selectedIndex3=-1;

            i_algo=i_algo+1;
        }
        else if(currentLine==11){
            variableList.remove("i");
            selectedIndex1=-1;
            currentLine=12;
        }
        else if(currentLine==12){
            currentLine=13;
        }
        else if(currentLine==13){
            System.out.println("END");
        }
        
        
        
    }
  
    
}
