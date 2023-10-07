package org.example;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Iterator;

public class theSnake {
    int length = 3;
    int []x;
    int []y;
    public static int UP = 1;
    public static int DOWN = -1;
    public static int LEFT = 2;
    public static int RIGHT = -2;

    int vector = theSnake.DOWN;

    long t1 = 0;

    public theSnake() {
        x = new int[20];
        y = new int[20];

        x[0]=5;
        y[0]=4;
        
        x[1]=5;
        y[1]=3;
        
        x[2]=5;
        y[2]=2;

    }
    public void setVector(int Vt) {
        if(vector != -Vt)
            vector = Vt;



    }
    public void update() {
        if(System.currentTimeMillis()-t1>1000) {
        	
        	
        	
        	for(int i = length-1; i>0;i--) {
        		x[i] = x[i-1];
        		y[i] = y[i-1];
        		
        		
        		
        	}
        	
        	
        	
            if(vector == theSnake.UP) y[0]--;
            if(vector == theSnake.DOWN) y[0]++;
            if(vector == theSnake.LEFT) x[0]--;
            if(vector == theSnake.RIGHT) x[0]++;
            t1 = System.currentTimeMillis();
            
            if(x[0]<0) x[0]=29;
            if(x[0]>29)x[0]=0;
            if(y[0]<0) y[0]=19;
            if(y[0]>19)y[0]=0;



        }

    }
    public void drawSnake (Graphics g) {
        g.setColor(Color.green);
        for(int i = 0; i < length;i++) {
            g.fillRect(x[i]*20+1, y[i]*20+1, 18, 18);



        }
    }
}
