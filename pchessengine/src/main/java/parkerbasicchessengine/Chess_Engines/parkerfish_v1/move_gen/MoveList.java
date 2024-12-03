package parkerbasicchessengine.Chess_Engines.parkerfish_v1.move_gen;

import parkerbasicchessengine.Chess_Engines.BitwiseMove;

public class MoveList {
    // made to avoid using lists

    public int index = 0;
    public BitwiseMove moves[] = new BitwiseMove[218];

    public MoveList(){

    }

    public void append(BitwiseMove move){
        this.moves[this.index] = move;
        this.index++;
    }

}