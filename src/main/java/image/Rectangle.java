package image;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    int x,y ;
    Color[][] pixelColor ;
    Rectangle(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y ;
        pixelColor = new Color[width][height];
        for(int wid = 0 ; wid < width ; wid++){
            for(int hgt = 0; hgt < height ;hgt++){
                pixelColor[wid][hgt]= color ;
            }
        }
    }
    public boolean contains(Point point){
        if(point.x > pixelColor.length || point.y > pixelColor[0].length)
            return false ;
        return true ;
    }
    public Color getColor(){
        return pixelColor[0][0];
    }
}
