package parkerbasicchessengine.pieces;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import parkerbasicchessengine.Board;

public abstract class Piece {

    public int col, row;
    public int xPos, yPos;

    public boolean isWhite;
    public String name;
    public int value;
    public boolean isFirstMove = true;

    public static BufferedImage sheet;
    {
        try{
            sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("pieces.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public int sheetScale = sheet.getWidth() / 6;

    Image sprite;

    Board board;

    public Piece(Board board){
        this.board = board;
    }

    public boolean isValidMovement(int col, int row){return true;}
    public boolean moveCollidesWithPiece(int col, int row){return false;}
    

    public void paint(Graphics2D g2d){
        g2d.drawImage(sprite, xPos, yPos, null);
    }

}
