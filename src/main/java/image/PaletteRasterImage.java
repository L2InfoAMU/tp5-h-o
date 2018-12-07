package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage implements Image {


    List<Color> palette ;

    private int[][] indexesOfColors ;

    public PaletteRasterImage(Color color, int width, int height){

        super(width, height);
        this.createRepresentation();
        for(int x = 0 ; x < width ; x++){
            for(int y = 0 ; y < height ; y++){
                this.setPixelColor(color , x , y) ;
            }
        }


    }
    public PaletteRasterImage(Color[][] pixels){

        super(pixels.length, pixels[0].length);
        this.createRepresentation();
        for(int x = 0 ; x < width ; x++){
            for(int y = 0 ; y < height ; y++){
                this.setPixelColor(pixels[x][y],x,y) ;
            }
        }


    }
    public void setPixelColor(Color color, int x, int y){
        if(!palette.contains(color))
            palette.add(color);
        indexesOfColors[x][y] = palette.indexOf(color);
    }

    public void createRepresentation(){
        palette = new ArrayList<Color>();
        indexesOfColors = new int[width][height];

    }
    public Color getPixelColor(int x, int y){

        return this.palette.get(indexesOfColors[x][y]);
        }

    private void setPixelsColor(Color color){
        for(int x = 0 ; x < width ; x++){
            for(int y = 0 ; y < height ; y++){
                this.setPixelColor(color , x , y) ;
            }
        }
    }
    private void setPixelsColor(Color[][] pixels){
        if(pixels.length > this.width || pixels[0].length > height)
            throw new ArithmeticException("pas la même taille");
        else{
            for(int x = 0 ; x < width ; x++){
                for(int y = 0 ; y < height ; y++){
                    this.setPixelColor(pixels[x][y] , x , y) ;
                }
            }
        }
    }


}
