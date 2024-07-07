/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;
import dao.PharmacyUtils;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sly
 */
public class Openpdf {
    public static void openById(String id){
        if((new File(PharmacyUtils.billPath+id+".pdf")).exists()){
            try {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundl123 url.dll,FileProtocolHandler"+PharmacyUtils.billPath+""+id+".pdf");
            } catch (IOException ex) {
                Logger.getLogger(Openpdf.class.getName()).log(Level.SEVERE, null, ex);
            }
}
        else{
            JOptionPane.showMessageDialog(null, "File does not exists.");
        }
    }

    private static class Excpetion {

        public Excpetion() {
        }
    }
    
    
}
