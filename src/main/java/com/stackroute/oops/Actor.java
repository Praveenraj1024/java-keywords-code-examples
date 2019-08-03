package com.stackroute.oops;

/**
 * This class implements TamilActor interface and overrides it.
 */
public class Actor implements TamilActor {
    private String name;
    private int rank;

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Actor() {

    }

    public Actor(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRank() {
        return rank;
    }
}
