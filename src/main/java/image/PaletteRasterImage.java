package image;

import java.awt.*;

public class PaletteRasterImage implements Image {

    private Color[] color = {Color.blue, Color.white , Color.red} ;
    private int height , width ;
    private int pixels[][] ;

    public PaletteRasterImage(Color color, int width, int height){

        this.width = width ;
        this.height = height ;
        pixels = new int[width][height];
        int pixelColor = 0 ;
        for(int index = 0 ; index < 3 ; index ++){
            if(color == Color.red)
                pixelColor = 2 ;
            if(color == Color.white)
                pixelColor = 1 ;
            if(color == color.blue)
                pixelColor = 0 ;
        }
        for(int x = 0 ;x < width ; x++){
            for(int y = 0 ; y < height ; y++ ){
                pixels[x][y] = pixelColor ;
            }
        }

    }
    public PaletteRasterImage(Color[][] pixels){

        this.width = pixels.length ;
        this.height = pixels[0].length ;
        for(int x = 0 ; x < width ; x++){
            for(int y = 0 ; y < height ; y++){
                this.setPixelColor(pixels[x][y],x,y) ;
            }
        }


    }
    public void setPixelColor(Color color, int x, int y){

        int pixelColor = 0 ;
        for(int index = 0 ; index < 3 ; index ++){
            if(color == Color.red)
                pixelColor = 2 ;
            if(color == Color.white)
                pixelColor = 1 ;
            if(color == color.blue)
                pixelColor = 0 ;
        }
        pixels[x][y] = pixelColor ;
    }
    public void createRepresentation(){
        pixels = new int[width][height];

    }

}
