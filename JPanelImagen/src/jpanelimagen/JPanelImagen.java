package jpanelimagen;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelImagen extends JPanel implements Serializable{
    
    private ImagenFondo FondoImagen;
    
    // Método constructor
    public JPanelImagen(){

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if( FondoImagen.getRutaImagen().exists() && FondoImagen.getRutaImagen() != null ){
            ImageIcon ic = new ImageIcon( FondoImagen.getRutaImagen().getAbsolutePath() );
            ImageIcon icOriginal = new ImageIcon( ic.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH) );
            g.drawImage(icOriginal.getImage() , 0, 0, null);
        }
    }
           
}
