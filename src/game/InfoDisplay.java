package game;

import piece.Piece;

import java.awt.*;

import piece.Piece;
import piece.PieceGenerator;

public class InfoDisplay {

    private Piece nextPiece;


    public InfoDisplay() {



    }

    public void render(Graphics g) {




        g.setColor(Color.WHITE);

        g.drawRect(100,100,1000,1000);
g.fillRect(0,0,1000,1000);;


        g.setColor(Color.RED);

        Font currentFont = g.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.4F);
        g.setFont(newFont);

        g.drawString("TEST TEST TEST", 100,100);



    }


}
