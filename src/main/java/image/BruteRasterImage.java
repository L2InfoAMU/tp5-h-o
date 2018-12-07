package image;
import javafx.scene.paint.Color;

public class BruteRasterImage  extends RasterImage implements Image {

    private Color[][] pixels ;
    private int width ,height ;


    public BruteRasterImage(Color color, int width, int height){

        super(width, height);
        pixels = new Color[width][height];
        for(int x = 0 ;x < width ; x++){
            for(int y = 0 ; y < height ; y++ ){
                pixels[x][y] = color ;
            }
        }
    }
    public BruteRasterImage(Color[][] colors){
        super(colors.length, colors[0].length);
        pixels = colors.clone();
        this.width = colors.length ;
        this.height = colors[0].length ;


    }
    public void createRepresentation(){
        pixels = new Color[width][height];

    }
    public void setPixelColor(Color color, int x, int y){
        pixels[x][y] = color ;
    }
    public Color getPixelColor(int x, int y){
        return pixels[x][y];
    }
    private void setPixelsColor(Color[][] pixels){

        this.width = pixels.length ;
        this.height = pixels[0].length ;
        this.pixels = pixels ;
    }
    private void setPixelsColor(Color color){
        for(int x = 0 ;x < width ; x++){
            for(int y = 0 ; y < height ; y++ ){
                pixels[x][y] = color ;

            }
        }
    }


}
