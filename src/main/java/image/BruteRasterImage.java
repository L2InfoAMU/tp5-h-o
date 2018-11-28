package image;
import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {

    private Color[][] pixels ;
    private int width ,height ;

    public BruteRasterImage(Color color, int width, int height){
        this.width = width ;
        this.height = height ;
        pixels = new Color[width][height];
        for(int x = 0 ;x < width ; x++){
            for(int y = 0 ; y < height ; y++ ){
                pixels[x][y] = color ;
            }
        }
    }
    public BruteRasterImage(Color[][] colors){
        pixels = colors.clone();
        this.width = colors.length ;
        this.height = colors[0].length ;


    }
    public void createRepresentation(){


    }
    public void setPixelColor(Color color, int x, int y){
        pixels[x][y] = color ;
    }
    

}
