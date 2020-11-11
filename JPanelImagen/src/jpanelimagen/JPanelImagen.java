package jpanelimagen;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelImagen extends JPanel implements Serializable{
    
    private ImagenFondo imagenFondo;
    
    // Método constructor
    public JPanelImagen(){

    }

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if( imagenFondo != null ){
            if( imagenFondo.getRutaImagen().exists() && imagenFondo.getRutaImagen() != null ){
                
                ImageIcon ic = new ImageIcon( imagenFondo.getRutaImagen().getAbsolutePath() );
                ImageIcon icOriginal = new ImageIcon( ic.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH) );
                
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacity()));
                
                g.drawImage(icOriginal.getImage() , 0, 0, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
            
            }
        }
    }
           
}
