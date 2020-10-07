/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro1;
import java.io.*;
/**
 *
 * @author Admin
 */
public class pro1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        File filein=new File("inputtext.txt");
        File fileout=new File("outputtext.txt");
        char CharCounter=0;
        BufferedReader in=(new BufferedReader(new FileReader(filein)));        
        PrintWriter out=(new PrintWriter(new FileWriter(fileout)));
        int z;
        while((z=in.read())!=-1)
        {
            if(Character.isUpperCase(z))
            {
                Character.toLowerCase(z);
            }
            out.write(z);
        }
        in.close();
        out.close();
        // TODO code application logic here
    }    
}