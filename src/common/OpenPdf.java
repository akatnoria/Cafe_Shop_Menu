/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class OpenPdf {

    public static void openByID(String id) throws IOException {
        try {
            if((new File("E:\\"+id+".pdf")).exists()){
                
               Process p = Runtime.getRuntime().exec("rundl32 url.dll,FileProtocolHandler E:\\"+id+".pdf");
                
            }
            else
                JOptionPane.showMessageDialog(null, "File is not exists");
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
