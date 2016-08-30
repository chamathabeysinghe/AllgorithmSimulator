/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsimulator;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chamath Abeysinghe
 */
public class AlgorithmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[]={3,2,1};
        Simulator.main(array);
//        SelectionSort s=new SelectionSort(array);
//        Scanner sc = new Scanner(System.in);
//        print(s);
//        while(sc.nextLine()!="-1"){
//            s.execute();
//            print(s);
//        }
        
  
        
        
    }
    
    static void print(SelectionSort s){
        System.out.println("************************************************************************************************");
        System.out.println("Ran Line: "+s.previousLine);
        System.out.println("Next Line: "+(s.currentLine));
        System.out.println("Variable List: "+s.variableList);
        System.out.println("Array: "+Arrays.toString(s.arr_algo));
        System.out.println("Selec1: "+s.selectedIndex1);
        System.out.println("Selec2: "+s.selectedIndex2);
        System.out.println("Selec3: "+s.selectedIndex3);
        
        
        System.out.println("************************************************************************************************");
    }
    
}
