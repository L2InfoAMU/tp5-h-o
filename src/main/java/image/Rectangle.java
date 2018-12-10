package image;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    int x,y,width,height ;
    Color[][] pixelColor ;
    Color color ;
    Rectangle(int x, int y, int width, int height, Color color) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        pixelColor = new Color[width][height];
        for(int wid = 0 ; wid < width ; wid++){
            for(int hgt = 0; hgt < height ;hgt++){
                pixelColor[wid][hgt]= color ;
            }
        }
    }
    public boolean contains(Point point){
        if(point.x > this.width+this.x || point.y > this.height+this.y || point.x < x || point.y < y)
            return false ;
        return true ;
    }
    public Color getColor(){
        return pixelColor[0][0];
    }
    public int getX(){
        return x ;
    }
    public int getY(){
        return y ;
    }
    public int getWidth(){
        return width ;
    }
    public int getHeight(){
        return height ;
    }
}
