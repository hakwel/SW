package com.sarahserussi.mainactivity;

import android.widget.Button;

/**
 * Created by sarahserussi on 04.03.15.
 */
public class StartMenu {

    private Button rulesButton;
    private Button connplayButton;
    private Button quitButton;

    protected void onButtonsClicked(){
        if (rulesButton.isPressed()){
            new RulesView();
        } else if (connplayButton.isPressed()){
            new GameState();
        } else if (quitButton.isPressed()){
            /* quit the application */
        }
    }
}

class RulesView{


}