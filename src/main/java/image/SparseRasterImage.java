package image;
import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage implements Image {

    private Map<Point,Color> pixelMap ;
    private Point[][] pixels ;

    public SparseRasterImage(Color color, int width, int height){
        super(width, height);
        this.createRepresentation();
        for(int x = 0 ;x < width ; x++ ){
            for(int y = 0 ; y < height ; y++){

                this.setPixelColor(color,x,y) ;
            }
        }
    }
    public SparseRasterImage(Color[][] pixels){
        super(pixels.length,pixels[0].length);
        this.createRepresentation();
        for(int x = 0 ;x < width ; x++ ){
            for(int y = 0 ; y < height ; y++){
                this.setPixelColor(pixels[x][y],x,y) ;
            }
        }

    }
    public void createRepresentation(){
        pixels = new Point[width][height];
        pixelMap = new HashMap<Point, Color>();

    }
    public void setPixelColor(Color color, int x, int y){
        if(!pixelMap.containsKey(pixels[x][y]))
            pixelMap.put(pixels[x][y], color);
        else{
            pixelMap.remove(pixels[x][y],pixelMap.get(pixels[x][y]));
            pixelMap.put(pixels[x][y], color);
        }

    }
    public Color getPixelColor(int x, int y){
        return pixelMap.get(pixels[x][y]);
    }
    private void setPixelsColor(Color[][] pixels){
        this.width = pixels.length ;
        this.height = pixels[0].length ;
        for(int x = 0 ;x < width ; x++ ){
            for(int y = 0 ; y < height ; y++){
                //pixelMap.put(this.pixels[x][y],pixels[x][y]);
                this.setPixelColor(pixels[x][y],x,y);
            }
        }
    }
    private void setPixelsColor(Color color){
        for(int x = 0 ;x < width ; x++ ){
            for(int y = 0 ; y < height ; y++){
                //pixelMap.put(this.pixels[x][y],color);
                this.setPixelColor(color,x,y);
            }
        }
    }
}
