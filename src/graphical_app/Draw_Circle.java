package graphical_app;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

    /*

    The Used Formula for Circle: 
        f(x,y) = x^2 + y^2 = r^2,

    if f(x,y) == 0 then:
        Point is on the Circle line

    The Symmetry in Cirlce Shape, helps us to get the Octant of points 
    and calculate the rest points of the Circle

    */

public class Draw_Circle {

    // Create Image Variables
    private BufferedImage Buff_Img;
    private File f;
    private int Pixel_Color;
    private Color color = Color.GREEN;
    
    // Create Circle Algorithm
    private int Circle_Point[][] = new int[8][2];
    private int Center_Point[] = new int[2];
    private int Next_Point,X_Point, Y_Point;
    private int Image_Width,Image_Height;
    
    public Draw_Circle(int Radius, int Width, int Height, int Color_Number){
        
        Image_Width = Width;
        Image_Height = Height;
        
        Buff_Img = new BufferedImage(Width, Height, BufferedImage.TYPE_INT_RGB);
        
        // Create jpg file in directory
        f = new File("C:\\Users\\PARVAZ\\Desktop\\Image.jpg");
        
        // Choosing the Color of Circle line
        color = switch (Color_Number) {
            case 1 -> Color.RED;
            case 2 -> Color.BLUE;
            case 3 -> Color.ORANGE;
            default -> Color.YELLOW;
        };

        Pixel_Color = color.getRGB();

        // Read the jpg file to put the Circle
        try{
            Buff_Img = ImageIO.read(f);
        }catch (IOException e){}
        
        // calculate the Circle Point
        Center_Point[0] = Image_Width / 2;
        Center_Point[1] = Image_Height / 2;

        X_Point = 0;
        Y_Point = Radius;
        
        Next_Point = 1 - Radius;
        
        while ( X_Point < Y_Point ){
            if(Next_Point < 0){
                X_Point++;
            }
            else{
                X_Point++;
                Y_Point--;
            }
            
            Circle_Point[0][0] = X_Point + Center_Point[0];
            Circle_Point[0][1] = Y_Point + Center_Point[1];
            try{
                Buff_Img.setRGB(Circle_Point[0][0], Circle_Point[0][1], Pixel_Color);
            }catch(ArrayIndexOutOfBoundsException e){}
            
            Circle_Point[1][0] = Center_Point[0] - X_Point;
            Circle_Point[1][1] = Y_Point + Center_Point[1];
            try{
                Buff_Img.setRGB(Circle_Point[1][0], Circle_Point[1][1], Pixel_Color);
            }catch(ArrayIndexOutOfBoundsException e){}
            
            Circle_Point[2][0] = X_Point + Center_Point[0];
            Circle_Point[2][1] = Center_Point[1] - Y_Point;
            try{
                Buff_Img.setRGB(Circle_Point[2][0], Circle_Point[2][1], Pixel_Color);
            }catch(ArrayIndexOutOfBoundsException e){}
            
            Circle_Point[3][0] = Center_Point[0] - X_Point;
            Circle_Point[3][1] = Center_Point[1] - Y_Point;
            try{
                Buff_Img.setRGB(Circle_Point[3][0], Circle_Point[3][1], Pixel_Color);
            }catch(ArrayIndexOutOfBoundsException e){}
            
            Circle_Point[4][0] = X_Point + Center_Point[1];
            Circle_Point[4][1] = Y_Point + Center_Point[0];
            try{
                Buff_Img.setRGB(Circle_Point[4][1], Circle_Point[4][0], Pixel_Color);
            }catch(ArrayIndexOutOfBoundsException e){}
            
            Circle_Point[5][0] = Center_Point[1] - X_Point;
            Circle_Point[5][1] = Y_Point + Center_Point[0];
            try{
                Buff_Img.setRGB(Circle_Point[5][1], Circle_Point[5][0], Pixel_Color);
            }catch(ArrayIndexOutOfBoundsException e){}
            
            Circle_Point[6][0] = X_Point + Center_Point[1];
            Circle_Point[6][1] = Center_Point[0] - Y_Point;
            try{
                Buff_Img.setRGB(Circle_Point[6][1], Circle_Point[6][0], Pixel_Color);
            }catch(ArrayIndexOutOfBoundsException e){}
            
            Circle_Point[7][0] = Center_Point[1] - X_Point;
            Circle_Point[7][1] = Center_Point[0] - Y_Point;
            try{
                Buff_Img.setRGB(Circle_Point[7][1], Circle_Point[7][0], Pixel_Color);
            }catch(ArrayIndexOutOfBoundsException e){}

            try{
                ImageIO.write(Buff_Img, "jpg", f);
            }
            catch (IOException e){
                System.out.print(e);
            }

            if(Next_Point < 0)
                Next_Point = Next_Point + 2*X_Point + 1;
            else
                Next_Point = Next_Point + 2*X_Point - 2*Y_Point + 1;

        }
        System.exit(0);
    }
    
}