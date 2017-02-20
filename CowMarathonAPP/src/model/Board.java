package model;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Created by Iman on 19-2-2017.
 */
public class Board {
private Tile[][] tiles;

    public Board(Path path) {

        try {

            int yRow = 0;
            Scanner scanner = new Scanner(path);
            String[] split = scanner.nextLine().split(",");
            tiles = new Tile[Integer.parseInt(split[1])][Integer.parseInt(split[0])];
            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                for (int xRow = 0; xRow < line.length(); xRow++) {
                    char character = line.charAt(xRow);
                    switch (character) {
                        case 'x':
                            tiles[yRow][xRow] = new Tile(new Obstacle());
                            break;
                        case 'G':
                            tiles[yRow][xRow] = new Tile(new Grass());
                            break;
                        case 'S':
                            tiles[yRow][xRow] = new Tile(new Grass());
                            //cow.setStartPosition(xRow,yRow);
                            break;
                        case 'L':
                            tiles[yRow][xRow] = new Tile(new FixedArrow(Direction.LEFT));
                            break;
                        case 'R':
                            tiles[yRow][xRow] = new Tile(new FixedArrow(Direction.RIGHT));
                            break;
                        case 'F':
                            tiles[yRow][xRow] = new Tile(new FixedArrow(Direction.FRONT));
                            break;
                        case 'B':
                            tiles[yRow][xRow] = new Tile(new FixedArrow(Direction.BACK));
                            break;
                        case 'T':
                            tiles[yRow][xRow] = new Tile(new Trophy());
                            break;
                        //How should i read a set of arrows in without placing them in the game field but on the right side of the screen
                    }


                }

                ++yRow;
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }

}

