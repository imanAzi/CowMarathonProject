package model;



/**
 * Created by Iman on 19-2-2017.
 */
public class Game {

    private Level currentLevel;
    private Cow cow;

    public Game() {
        cow=new Cow();
        currentLevel= new Level(0);
    }

    public void go(){
        cow.walk();
    }

    public void reset(){cow.reset();
    }

    public void upgradeLevel(){
        int nextLevel=currentLevel.getLevelNumber()+1;
        currentLevel=new Level(nextLevel);
    }
}
