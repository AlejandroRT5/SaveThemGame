package com.tsi.Rivas.Alejandro.SaveThem;
public abstract class Map {

    /// Attributes ///
    public static int[][] gameMap = new int[4][4];
    private int start_position = gameMap[0][0];
    private int current_position = start_position;
    //public int[][] room_Index = new int[4][4];

    /// Methods ///
    public static int[][] getPosition() {
        Object x = Movement.getIndex_X;
        Object y = Movement.getIndex_Y;
        return new int[(int) x][(int) y];
    }
}







    /// Room 0: i=0, j=0






