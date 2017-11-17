// Copyright (c) 2008-2017  Esko Luontola <www.orfjackal.net>
// You may use and modify this source code freely for personal non-commercial use.
// This source code may NOT be used as course material without prior written agreement.

package tetris;

public class Block {
    private char x;

    public Block(char x) {
        this.x = x;
    }

    public char getX() {
        return x;
    }

    public void setX(char x) {
        this.x = x;
    }
}
