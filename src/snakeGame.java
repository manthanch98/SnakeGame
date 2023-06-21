import javax.swing.*;

public class snakeGame extends JFrame{
    snakeBoard snakeBoard;
    snakeGame(){
        snakeBoard= new snakeBoard();
        add(snakeBoard);
        pack();
        setResizable(false);
        setVisible(true);
    }




    public static void main(String[] args) {
        snakeGame snakeGame= new snakeGame();





    }
}
