package parkerbasicchessengine.pieces;

import java.awt.image.BufferedImage;

import parkerbasicchessengine.Board;

public class King extends Piece{

    public King(Board board, int col, int row, boolean isWhite){
        super(board);
        this.col = col;
        this.row = row;
        this.isWhite = isWhite;

        this.xPos = col * board.tileSize;
        this.yPos = row * board.tileSize;

        this.name = "King";

        this.sprite = sheet.getSubimage(0, isWhite ? 0 : sheetScale, sheetScale, sheetScale).getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);
    }

    @Override
    public boolean isValidMovement(int col, int row){
        return Math.abs((col - this.col) * (row - this.row)) == 1 || Math.abs((col - this.col)) + Math.abs((row - this.row)) == 1;
    }

}
