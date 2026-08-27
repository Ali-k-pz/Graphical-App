package graphical_app;

public class Create_Circle {

    private int Circle_Point[][] = new int[8][2];
    private int Center_Point[] = new int[2];
    private int Next_Point,X_Point, Y_Point;
    
    private final int Image_Weight,Image_Height;
    
    public Create_Circle(int Radius, int Weight, int Height){
    
        Image_Weight = Weight;
        Image_Height = Height;
        
        Center_Point[0] = Image_Weight / 2;
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
            
            Circle_Point[1][0] = Center_Point[0] - X_Point;
            Circle_Point[1][1] = Y_Point + Center_Point[1];
            
            Circle_Point[2][0] = X_Point + Center_Point[0];
            Circle_Point[2][1] = Center_Point[1] - Y_Point;
            
            Circle_Point[3][0] = Center_Point[0] - X_Point;
            Circle_Point[3][1] = Center_Point[1] - Y_Point;
            
            Circle_Point[4][0] = X_Point + Center_Point[1];
            Circle_Point[4][1] = Y_Point + Center_Point[0];
            
            Circle_Point[5][0] = Center_Point[1] - X_Point;
            Circle_Point[5][1] = Y_Point + Center_Point[0];
            
            Circle_Point[6][0] = X_Point + Center_Point[1];
            Circle_Point[6][1] = Center_Point[0] - Y_Point;
            
            Circle_Point[7][0] = Center_Point[1] - X_Point;
            Circle_Point[7][1] = Center_Point[0] - Y_Point;
            
            /*
            //-> Check the Points
            
            for ( int i = 0 ; i < 8 ; i++ ){
                for ( int j = 0 ; j < 2 ; j++)
                    System.out.print(Circle_Point[i][j] + " ,");
                System.out.println();
            }
            System.out.println("-----------");
            
            */
            
            if(Next_Point < 0)
                Next_Point = Next_Point + 2*X_Point + 1;
            else
                Next_Point = Next_Point + 2*X_Point - 2*Y_Point + 1;

        }
    }
    
}