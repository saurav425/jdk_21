package com.java8.generics;

public class BoundedWildcardsArgsExample {

    public static void showXY(Coords<? extends TwoD> c){
        System.out.println("Show X and Y Parameters");
        for(int i = 0; i < c.coords.length;i++){
            System.out.println("X is ::"+c.coords[i].x+" Y is ::"+c.coords[i].y);
        }
    }

    public static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("Show X and Y Parameters");
        for(int i = 0; i < c.coords.length;i++){
            System.out.println("X is ::"+c.coords[i].x+" Y is ::"+c.coords[i].y+" Z is ::"+c.coords[i].z);
        }
    }

    public static void showAll(Coords<? extends FourD> c){
        System.out.println("Show X and Y Parameters");
        for(int i = 0; i < c.coords.length;i++){
            System.out.println("X is ::"+c.coords[i].x+" Y is ::"+c.coords[i].y+" Z is ::"+c.coords[i].z+" T is ::"+c.coords[i].t);
        }
    }

    public static void main(String[] args) {
        TwoD [] twoDS = {
                new TwoD(1,2),
                new TwoD(3,8),
                new TwoD(5,-8)
        };

        Coords<TwoD> twoDCoords = new Coords<>(twoDS);
        showXY(twoDCoords);
        // showXYZ(twoDCoords); Error
        // showAll(twoDCoords); Error

        FourD [] fourDS = {
                new FourD(1,2,3,4),
                new FourD(-1,-5,-4,9)
        };

        Coords<FourD> fourDCoords = new Coords<>(fourDS);
        showXY(fourDCoords);
        showXYZ(fourDCoords);
        showAll(fourDCoords);
    }
}
