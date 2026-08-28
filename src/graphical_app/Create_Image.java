package graphical_app;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Create_Image {
    
    private BufferedImage Buff_Img;
    private File f = new File("C:\\Users\\PARVAZ\\Desktop\\Image.jpg");;
    private int Pixel_Color;
    private Color color = Color.GREEN;
    
    public void Create_Image(int Color_Number){
        
        if(Color_Number == 1){
            color = Color.RED;
        }
        else if (Color_Number == 2){
            color = Color.BLUE;
        }
        else if (Color_Number == 3){
            color = Color.ORANGE;
        }
        else 
            color = Color.YELLOW;
        
        Pixel_Color = color.getRGB();
        
    }
    
    public void Create_Image(int Width, int Height, int[][] Circle_Point){
        
        Buff_Img = new BufferedImage(Width, Height, BufferedImage.TYPE_INT_RGB);
        
        try{
            Buff_Img = ImageIO.read(f);
        }catch (IOException e){
            System.out.println(e);
        }
        
        Buff_Img.setRGB(10, 30, Pixel_Color);
        
        try{
            ImageIO.write(Buff_Img, "jpg", f);
        }
        catch (IOException e){
            System.out.print("ERROR!");
        }
    
    }
            
}
