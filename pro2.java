  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro2;
import java.io.*;
/**
 *
 * @author Admin
 */
public class pro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        String fname=args[0];
        File f=new File(fname);
        System.out.println("Filename:"+f.getName());
        System.out.println("Path:"+f.getPath());
        System.out.println("Absolutepath:"+f.getAbsolutePath());
        System.out.println("Parent:"+f.getParent());
        System.out.println("Exists:"+f.exists());
        if(f.exists())
        {
            System.out.println("Iswriteable:"+f.canWrite());
            System.out.println("Isreadable"+f.canRead());
            System.out.println("Isadirectory:"+f.isDirectory());
            System.out.println("FileSizeinbytes"+f.length());
            // TODO code application logic here
        }
    }
}