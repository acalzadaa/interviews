package com.alex;
import java.util.LinkedList;

public class TrainComposition {

    /*
    A train can add

     */

	private final LinkedList<Integer> trainWagon = new LinkedList<>();
	
    public void attachWagonFromLeft(int wagonId) {
    	trainWagon.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
    	trainWagon.add(wagonId);
    }

    public int detachWagonFromLeft() {
    	int wagon = trainWagon.getFirst();
    	trainWagon.removeFirst();
    	return wagon;
    	 
    }

    public int detachWagonFromRight() {
    	int wagon = trainWagon.getLast();
    	trainWagon.removeLast();
    	return wagon;
    }

    public static void main(String[] args) {


        TrainComposition train = new TrainComposition();
        train.attachWagonFromLeft(7);
        train.attachWagonFromLeft(13);
        System.out.println(train.detachWagonFromRight()); // 7 
        System.out.println(train.detachWagonFromLeft()); // 13
        train.attachWagonFromLeft(15);
        System.out.println(train.detachWagonFromLeft()); // 15

    }
}