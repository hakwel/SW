package com.sarahserussi.mainactivity;

/**
 * Created by sarahserussi on 04.03.15.
 */
public class Score {

    Player player1;
    Player player2;
    private int player1Score;
    private int player2Score;

    /* add point to player's score */
    public void addPoint(Player player){
        if (player == player1){
            player1Score++;
        } else if (player == player2){
            player2Score++;
        }
    }


}
