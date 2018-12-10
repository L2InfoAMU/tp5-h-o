package image;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    int x,y ;
    Color[][] pixelColor ;
    Rectangle(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y ;
        pixelColor = new Color[width][height];
        for(int wid = x ; wid < width ; wid++){
            for(int hgt = y; hgt < height ;hgt++){
                pixelColor[wid][hgt]= color ;
            }
        }
    }
    public boolean contains(Point point){
        if(point.x > pixelColor.length+this.x || point.y > pixelColor[0].length+this.y || point.x < x || point.y < y)
            return false ;
        return true ;
    }
    public Color getColor(){
        return pixelColor[0][0];
    }
}
