/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosekaralisteduzeltme;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ahmet
 */
public class RoseKaraListeDuzeltme {

  
    public static void main(String[] args) throws FileNotFoundException, IOException {
//4073
        String filename = "karaliste.txt";
File textFile = new File(filename);
Scanner in = new Scanner(textFile);
String value = in.nextLine();
        System.out.println("Read value: " + value);
        in.nextLine();
        int count = 2;
        String enson="";
        ArrayList<String> kelimeler=new ArrayList<>();
while (in.hasNextLine()){
            String line = in.nextLine();
            if(line.indexOf(" ")!=-1){
                 line="/addblacklist \""+line+"\" Küfürlü İçerik Yasak! ";
                        
            }else{
            line="/addblacklist "+line+" Küfürlü İçerik Yasak";
         
            }
            for(int i=0;i<4073;i++){
            line+=" ";
            }
            System.out.println(line);
            kelimeler.add(line);
         /* String cikti="{ \n \"name\":\""+line+"\" ,  \n \"reason\":\"Küfürlü içierik yasak\" \n }";
          enson+=cikti+", \n";*/
     
   
  
        }
       // System.out.println(enson);
in.close();


    File file = new File("output.txt");//proje içinde text.txt adında bir txt oluşturun.
    try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
    br.write("This is line one");
    br.newLine();
    br.write("This is line two");
    br.newLine();
    br.write("Last line.");
} catch (IOException e) {
    System.out.println("Unable to read file " +file.toString());
}

    } 
}
