package model;

/**
 * Created by Iman on 19-2-2017.
 */
public class Tile {

private Content content;

    public Tile(Content content) {
        this.content = content;
    }

    public void putArrowOnTile(VariableArrow variableArrow){
        //controleren wat er in de tile zit
        //als tile geen obstacle,trophy, FixedArrow of koe bevat mag VariableArrow hierin geplaatst worden
        //content=VariableArrow;

    }
}
