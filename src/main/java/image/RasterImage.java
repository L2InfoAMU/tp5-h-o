package image;

import javafx.scene.paint.Color;

public abstract class RasterImage {

    public int width , height ;

    public RasterImage( int width, int height){
        this.width = width ;
        this.height = height ;
    }
    public int getHeight(){
        return this.height ;
    }
    public int getWidth(){
        return this.width ;
    }
    protected void setWidth(int width) {
        this.width = width ;
    }
    protected void setHeight(int height){
        this.height = height ;
    }
}
