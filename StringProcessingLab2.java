/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.processing.lab.pkg2;

import com.sun.istack.internal.logging.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Dawood Rauf
 */
public class StringProcessingLab2 {
    
    private static String[] records;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        records = new String[100];
        
        try {
            Scanner reader = new Scanner(new File(args[0]));
            
            int currIndex = 0;
            while(reader.hasNext()){
                String[] line = reader.nextLine().split(",");
                
                String firstName = line[0];
                String lastName = line[1];
                String age = line[2];
                String gender = line[3];
                String phoneNumber = line[4];
                String email = line[5];
                
                
                records[currIndex] = String.format("");
                System.out.println(records[currIndex]);
                currIndex ++; 
            }   
        } catch (FileNotFoundException ex) {
            System.err.print("Could not find the file");
        }
        // TODO code application logic here
    }
    
}

