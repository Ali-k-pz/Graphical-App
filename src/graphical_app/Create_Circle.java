package graphical_app;

public class Create_Circle {
    
    public Create_Circle(){
    
        Radius = 11;
        Center_Point[0] = 2;
        Center_Point[1] = -1;
        X_Point = 0;
        Y_Point = Radius;
                
        Next_Point = 1 - Radius;
        
        if(Next_Point < 0){
            X_Point++;
        }
        else{
            X_Point++;
            Y_Point--;
        }
        
        
        Circle_Point[0][0] = X_Point + Center_Point[0];
        Circle_Point[0][1] = Y_Point + Center_Point[1];
        Circle_Point[1][0] = -Circle_Point[0][0];
        Circle_Point[1][1] = Circle_Point[0][1];
        Circle_Point[2][0] = -Circle_Point[0][0];
        Circle_Point[2][1] = -Circle_Point[0][1];
        Circle_Point[3][0] = Circle_Point[0][0];
        Circle_Point[3][1] = -Circle_Point[0][1];
        Circle_Point[4][0] = Circle_Point[0][1];
        Circle_Point[4][1] = Circle_Point[0][0];
        Circle_Point[5][0] = -Circle_Point[0][1];
        Circle_Point[5][1] = Circle_Point[0][0];
        Circle_Point[6][0] = -Circle_Point[0][1];
        Circle_Point[6][1] = -Circle_Point[0][0];
        Circle_Point[7][0] = Circle_Point[0][1];
        Circle_Point[7][1] = -Circle_Point[0][0];
        
        for ( int i = 0 ; i < 8 ; i++ ){
            for ( int j = 0 ; j < 2 ; j++)
                System.out.print(Circle_Point[i][j] + " ,");
            System.out.println();
        }
        
        /*
        while ( X_Point < Y_Point ){
            
        }
        */
    }
    
    /*
    
    P0 = 1 - r
    
    if Pk < 0
    Pk+1 = Pk + 2x + 
    x++
    
    if Pk > 0 
    Pk+1 = Pk + 2x - 2y +1
    x++
    y--
    
    */
    
    private int Circle_Point[][] = new int[8][2];
    private int Center_Point[] = new int[2];
    private int Radius;
    private int Next_Point,X_Point, Y_Point;

}