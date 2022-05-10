package game;

import java.awt.*;

public class Score {
    private int score;


    public int getScore() {
        return score;
    }

    public void forceSetScore(int score) {
        this.score = score;
    }

    public void incrementScore(int by){
        score += by;
    }

    public void incrementScore(){
        score += 50;
    }



    public void render(Graphics g) {
  // System.out.println("render score");

        g.setColor(Color.BLUE);

        Font currentFont = g.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.4F);
        g.setFont(newFont);

        g.drawString("Score", 338,500);

        Font currentFont2 = g.getFont();
        Font newFont2 = currentFont.deriveFont(currentFont2.getSize() * 3F);
        g.setFont(newFont2);

        if(String.valueOf(score).length() == 1){
            g.drawString( String.valueOf(score), 343,550);
           // System.out.println("space x2");
        }
        else if(String.valueOf(score).length() == 2){
            g.drawString( String.valueOf(score), 328,550);
           // System.out.println("space x1");
        }
        else {
            g.drawString(String.valueOf(score), 310,550);
           // System.out.println("no space");
        }



    }
}
