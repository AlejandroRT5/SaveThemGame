package com.tsi.Rivas.Alejandro.SaveThem;
import java.util.Random;
import java.util.Arrays;


public class Rooms {

    /// Methods ///
    /// Randomise Room Structure

    public static int[] RandomiseX() {

            int[] numbers_list_x = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3};

            Random rand = new Random();

            for (int i = 0; i < 15; i++) {

                int randomIndexToSwap_x = rand.nextInt(numbers_list_x.length);

                int temp_x = numbers_list_x[randomIndexToSwap_x];

                numbers_list_x[randomIndexToSwap_x] = numbers_list_x[i];
                numbers_list_x[i] = temp_x;

            }
            return numbers_list_x;
        }

        public static int[] RandomiseY() {

            int[] numbers_list_y = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3};

            Random rand = new Random();

            for (int i = 0; i < 15; i++) {

                int randomIndexToSwap_y = rand.nextInt(numbers_list_y.length);

                int temp_y = numbers_list_y[randomIndexToSwap_y];

                numbers_list_y[randomIndexToSwap_y] = numbers_list_y[i];
                numbers_list_y[i] = temp_y;
            }
            return numbers_list_y;
        }


    /// Attributes ///
    /// Assign Rooms to random locations on map
    public static int[][] Starter_Room = {{0},{0}};
    //public int Room1 = Map.gameMap[Rooms.RandomiseX()[0]][Rooms.RandomiseY()[0]];  // Contains Enderman
    public int[][] Room1 = {{Rooms.RandomiseX()[0]},{Rooms.RandomiseY()[0]}};
    public int[][] Room2 = {{Rooms.RandomiseX()[1]},{Rooms.RandomiseY()[1]}};  // Contains Sleeping Pikachu
    public int[][] Room3 = {{Rooms.RandomiseX()[2]},{Rooms.RandomiseY()[2]}};  // Contains Dr Mundo

    public int[][] Room4 = {{Rooms.RandomiseX()[3]},{Rooms.RandomiseY()[3]}};  // Contains Abu
    public int[][] Room5 = {{Rooms.RandomiseX()[4]},{Rooms.RandomiseY()[4]}};  // Contains Piglin
    public int[][] Room6 = {{Rooms.RandomiseX()[6]},{Rooms.RandomiseY()[6]}};  // Contains Gareth & Riccardo
    public int[][] Room7 = {{Rooms.RandomiseX()[7]},{Rooms.RandomiseY()[7]}};  // Contains Health pot or 4 gold

    public int[][] Room8 = {{Rooms.RandomiseX()[8]},{Rooms.RandomiseY()[8]}};  // Contains Health pot or Shield
    public int[][] Room9 = {{Rooms.RandomiseX()[9]},{Rooms.RandomiseY()[9]}};  // Contains Sword
    public int[][] Room10 = {{Rooms.RandomiseX()[10]},{Rooms.RandomiseY()[10]}}; // Contains ISTQB or Health potion
    public int[][] Room11 = {{Rooms.RandomiseX()[11]},{Rooms.RandomiseY()[11]}}; // Contains 4 gold

    public int[][] Room12 = {{Rooms.RandomiseX()[12]},{Rooms.RandomiseY()[12]}}; // Contains 4 gold
    public int[][] Treasure_Room = {{Rooms.RandomiseX()[13]},{Rooms.RandomiseY()[13]}};  // Contains boss
    public int[][] Room14 = {{Rooms.RandomiseX()[14]},{Rooms.RandomiseY()[14]}}; // Contains 4 gold
    public int[][] Room15 = {{Rooms.RandomiseX()[15]},{Rooms.RandomiseY()[15]}}; // Contains Piglin

    public static boolean getStarter_Room() {
        return Arrays.deepEquals(Starter_Room, Map.getPosition());
    }

    public boolean getRoom1() {
        return Arrays.deepEquals(Room1, Map.getPosition());
    }

    public boolean getRoom2() {
        return Arrays.deepEquals(Room2, Map.getPosition());
    }

    public boolean getRoom3() {
        return Arrays.deepEquals(Room3, Map.getPosition());
    }

    public boolean getRoom4() {
        return Arrays.deepEquals(Room4, Map.getPosition());
    }

    public boolean getRoom5() {
        return Arrays.deepEquals(Room5, Map.getPosition());
    }

    public boolean getRoom6() {
        return Arrays.deepEquals(Room6, Map.getPosition());
    }

    public boolean getRoom7() {
        return Arrays.deepEquals(Room7, Map.getPosition());
    }

    public boolean getRoom8() {
        return Arrays.deepEquals(Room8, Map.getPosition());
    }

    public boolean getRoom9() {
        return Arrays.deepEquals(Room9, Map.getPosition());
    }

    public boolean getRoom10() {
        return Arrays.deepEquals(Room10, Map.getPosition());
    }

    public boolean getRoom11() {
        return Arrays.deepEquals(Room11, Map.getPosition());
    }

    public boolean getRoom12() {
        return Arrays.deepEquals(Room12, Map.getPosition());
    }

    public boolean getTreasure_Room() {
        return Arrays.deepEquals(Treasure_Room, Map.getPosition());
    }

    public boolean getRoom14() {
        return Arrays.deepEquals(Room14, Map.getPosition());
    }

    public boolean getRoom15() {
        return Arrays.deepEquals(Room15, Map.getPosition());
    }


    /// STARTER ROOM STORY ///
    public String Start_Intro = "";



}





