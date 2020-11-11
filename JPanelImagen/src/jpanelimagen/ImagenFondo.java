
package jpanelimagen;

import java.io.File;
import java.io.Serializable;

public class ImagenFondo implements Serializable{
    private File rutaImagen;
    private Float Opacity;

    public ImagenFondo(File rutaImagen, Float Opacity) {
        this.rutaImagen = rutaImagen;
        this.Opacity = Opacity;
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Float getOpacity() {
        return Opacity;
    }

    public void setOpacity(Float Opacity) {
        this.Opacity = Opacity;
    }
    
}
