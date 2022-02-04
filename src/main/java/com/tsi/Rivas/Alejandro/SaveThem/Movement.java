package com.tsi.Rivas.Alejandro.SaveThem;



public abstract class Movement {
    public static Object getIndex_X;
    public static Object getIndex_Y;
    // public abstract int Movement(Index_x Index_y) {

        /// Attributes ///
        private int x;
        private int y;
        public int Index_x;
        public int Index_y;

        /// Method ///
        public void moveUp() {
            if (x == 0) {
                x = 3;
            } else {
                x = x - 1;
            }

        }
        public void moveDown() {
            if (x == 3) {
                x = 0;
            } else {
                x = x + 1;
            }

        }

        private void setIndex_X ( int Index_x){
            this.x = Index_x;
        }

        public int getIndex_X () {
            return Index_x;
        }

        public void moveRight() {
            if (y == 3) {
                y = 0;
            } else {
                y = y + 1;
            }
        }

        public void moveLeft() {
            if (y == 0) {
                y = 3;
            } else {
                y = y - 1;
            }

        }

        private void setIndex_Y ( int Index_y){
            this.y = Index_y;
        }

        public int getIndex_Y () {
            return Index_y;
        }

    }
