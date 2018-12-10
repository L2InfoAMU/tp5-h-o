package image;

import javafx.scene.paint.Color;

import java.util.List;

public class VectorImage implements Image{

    List<Shape> shapes ;
    Color[][] pixelColor ;

    VectorImage(List<Shape> shapes, int width, int height){
        int size = shapes.size();
        this.shapes = shapes ;
        pixelColor = new Color[width][height];
        for(int index = 0 ; index < size ; index ++){
            for(int x = 0 ; x < width ; x++){
                for(int y = 0 ; y < height ; y++){
                    if(shapes.get(size).contains(new Point(x,y)))
                        pixelColor[x][y] = shapes.get(size).getColor();
                }
            }
        }
    }
    public Color getPixelColor(int x, int y){
        return pixelColor[x][y] ;
    }
    public int getWidth(){
        return pixelColor.length  ;
    }
    public int getHeight(){
        return pixelColor[0].length  ;
    }


}
