/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro3(a);
import java.io.*;
/**
 *
 * @author Admin
 */
public class  pro3(a) {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        FileReader sourceStream =null;
        try
        {
            sourceStream =new FileReader("test.txt");
            int temp;
            while((temp=sourceStream.read())!= -1)
                System.out.println((char)temp);
        }
        finally
        {
            if(sourceStream !=null)
                sourceStream.close();
        }
    }
}