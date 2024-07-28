/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;
import dao.PharmacyUtils;

public class OpenPdf {
    public static void openById(String id){
        try{
            File file = new File(PharmacyUtils.billPath + id + ".pdf");
            if (file.exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler " + PharmacyUtils.billPath + id + ".pdf");
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist.");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

  