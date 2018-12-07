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
                pixelMap.put(pixels[x][y],color);
            }
        }
    }
    public SparseRasterImage(Color[][] pixels){
        super(pixels.length,pixels[0].length);
        this.createRepresentation();
        for(int x = 0 ;x < width ; x++ ){
            for(int y = 0 ; y < height ; y++){
                pixelMap.put(this.pixels[x][y],pixels[x][y]);
            }
        }

    }
    public void createRepresentation(){
        pixels = new Point[width][height];
        pixelMap = new HashMap<Point, Color>();

    }
    public void setPixelColor(Color color, int x, int y){
        pixelMap.put(pixels[x][y], color);
    }
}
