package org.algorirthm.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.algorithm.impl.TypeMap;

public class FileInput {

  public static Set<String> readInput(){

   File file = new File("/home/lumala/Desktop/unifalgo/TypeEquivFinal/sampleFiles/inputwsdls.txt");
     
    
    BufferedReader reader=null;
    Set<String> list=new HashSet<String>();
    try {
      
      reader= new BufferedReader(new FileReader(file));

      // dis.available() returns 0 if the file does not have more lines.
      while (reader.read()!=-1) {
    	  
      // this statement reads the line from the file and print it to
        // the console.
        //System.out.println();
    	  String string=reader.readLine();
    	  if(string!=null){
    		  list.add(string);
    	  }
        
           
      }

      // dispose all the resources after using them.
      reader.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return list;
  }
  
}