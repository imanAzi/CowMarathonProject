package model;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Iman on 19-2-2017.
 */
public class Level {

    private int levelNumber;
    private Path path;

    public Level(int levelNumber) {
        this.levelNumber = levelNumber;
        path= Paths.get("C:\\Users\\Iman\\IdeaProjects\\CowMarathonProject\\CowMarathonAPP\\src\\level\\Level"+levelNumber+".txt");
        //documentie achteraf nakijken en wijzigen C:\Users\Iman\IdeaProjects\CowMarathonProject\CowMarathonAPP\src\level
        createBoard();
    }

    private void createBoard(){
        new Board(path);
    }

    public int getLevelNumber() {
        return levelNumber;
    }
}
