package image;

import javafx.scene.paint.Color;

import java.util.List;

public class PaletteRasterImage implements Image {


    List<Color> palette ;
    private int height , width ;
    private int[][] indexesOfColors ;

    public PaletteRasterImage(Color color, int width, int height){
        int colorNumber = 0 ;
        this.width = width ;
        this.height = height ;
        indexesOfColors = new int[width][height];


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
        if(!palette.contains(color))
            palette.add(color);
        indexesOfColors[x][y] = palette.indexOf(color);
    }
    
    public void createRepresentation(){
        indexesOfColors = new int[width][height];

    }
    public Color getPixelColor(int x, int y){

        for(int index = 0 ; index < 3 ; index ++){
            if(indexesOfColors[x][y] == index) {
                return color[index] ;

            }
        }

            throw new ArithmeticException("/ aucune couleur");
        }
    public void setPixelsColor(Color[][] pixels){
        int numberColor = 0 ;
        for(int index = 0 ; index < 3 ; index ++)
    }

}
