/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanelimagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author max98
 */
public class ImagenFondoPropiedades extends PropertyEditorSupport{

    private ImagenFondoPanel imagenFondoPanel = new ImagenFondoPanel();
    @Override
    public boolean supportsCustomEditor() {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component getCustomEditor() {
        return imagenFondoPanel; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJavaInitializationString() {
        ImagenFondo img = imagenFondoPanel.getSelectValued();
        
        if(System.getProperty("os.name").equals("Windows 10")){
            return "new jpanelimagen.ImagenFondo("
                +"new java.io.File(\"" + img.getRutaImagen().getAbsolutePath().replace('\\', '/') +"\"),"
                + img.getOpacity() + "f"
                +")";
        }else{
            return "new jpanelimagen.ImagenFondo("
                +"new java.io.File(\"" + img.getRutaImagen().getAbsolutePath() +"\"),"
                + img.getOpacity() + "f"
                +")";
        }
  
    }

    @Override
    public Object getValue() {
        return imagenFondoPanel.getSelectValued(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
