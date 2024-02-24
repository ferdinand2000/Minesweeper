import java.util.Random;
public class Bombs {
    private String difficulty;
    private int [][] location ={};
    private int boardSize;

    public Bombs(String df){
        difficulty = df;
    }
    public String getDifficulty() {
        return difficulty;
    }

    public int gameSize(){
        if(difficulty == "easy") {
            boardSize = 6;
            return boardSize;
        }
        else if(difficulty == "normal"){
            boardSize = 8;
            return boardSize;
        }
        else {
            boardSize = 12;
            return boardSize;
        }

    }

}
