package graphical_app;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Draw_Circle {

    private BufferedImage Buff_Img;
    private File f;
    private int Pixel_Color;
    private Color color = Color.GREEN;

    
    private int Circle_Point[][] = new int[8][2];
    private int Center_Point[] = new int[2];
    private int Next_Point,X_Point, Y_Point;
    
    private final int Image_Width,Image_Height;
    
    public Draw_Circle(int Radius, int Width, int Height, int Color_Number){
    
        Image_Width = Width;
        Image_Height = Height;
        
        Center_Point[0] = Image_Width / 2;
        Center_Point[1] = Image_Height / 2;
        
        X_Point = 0;
        Y_Point = Radius;
                
        Next_Point = 1 - Radius;

        Buff_Img = new BufferedImage(Width, Height, BufferedImage.TYPE_INT_RGB);
        
        f = new File("C:\\Users\\PARVAZ\\Desktop\\Image.jpg");

        switch (Color_Number) {
            case 1:
                color = Color.RED;
                break;
            case 2:
                color = Color.BLUE;
                break;
            case 3:
                color = Color.ORANGE;
                break;
            default:
                color = Color.YELLOW;
                break;
        }

        Pixel_Color = color.getRGB();

        try{
            Buff_Img = ImageIO.read(f);
        }catch (IOException e){
//            System.out.println(e);
        }
        
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
            
            /*
            //-> Check the Points
            
            for ( int i = 0 ; i < 8 ; i++ ){
                for ( int j = 0 ; j < 2 ; j++)
                    System.out.print(Circle_Point[i][j] + " ,");
                System.out.println();
            }
            System.out.println("-----------");
            */
                        
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
    }
    
}