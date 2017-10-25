/***********************************************
 * @ file TicTacToe.java
 * @ brief This program create a primitive version of Tic Tac Toe.
 * @ author Jianqiu Xu (Tony)
 * @ date September 27, 2017
 ***********************************************/
import java.awt.*;

public class TicTacToe {
    public static void main(String[] args) {

        //Print 3*3 Graph
        int i = 0;
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.setScale(0, 3);
        while (i <= 3) {

            StdDraw.line(i, 0, i, 3);
            i++;

        }

        i = 0;
        while (i <= 3) {

            StdDraw.line(0, i, 3, i);
            i++;

        }

        int clicks = 0;
        double X, Y;
        double radius;

        while (clicks < 9) {

            if (StdDraw.isMousePressed()) {

                X = StdDraw.mouseX(); // x location
                Y = StdDraw.mouseY(); // y location

                //odd number clicks generate blue circle
                if (clicks % 2 == 0) {

                    StdDraw.setPenColor(Color.BLUE);
                    radius = 0.5;
                    StdDraw.circle(Math.floor(X) + 0.5, Math.floor(Y) + 0.5, radius);

                }
                //even number clicks generate red cross
                else if (clicks % 2 == 1) {

                    StdDraw.setPenColor(Color.RED);
                    StdDraw.line(Math.floor(X), Math.floor(Y), Math.ceil(X), Math.ceil(Y));
                    StdDraw.line(Math.floor(X) + 1, Math.floor(Y), Math.ceil(X) - 1, Math.ceil(Y));

                }
                //pause between receiving each click
                StdDraw.pause(300);
                clicks++;

            }
        }
    }
}