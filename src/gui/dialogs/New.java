/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.dialogs;

import java.awt.Component;
import javax.swing.JFileChooser;

/**
 *
 * @author Dan Anton
 */
public class New extends AbstractDialog {
   
     private int option = 1;

    public int getOption() {
        return option;
    }
     
     public New(Component comp, String ext, String desc) {
        path = null;
        this.comp = comp;
       setFileFilter(new gui.dialogs.FileExtensionFilter(ext, desc));
    }

    @Override
    public void doModal() {    
        
        if (showDialog(comp,"New") == JFileChooser.APPROVE_OPTION) {
            path = getSelectedFile().toString();
            option = JFileChooser.APPROVE_OPTION;
            
        }

        
    }
}
