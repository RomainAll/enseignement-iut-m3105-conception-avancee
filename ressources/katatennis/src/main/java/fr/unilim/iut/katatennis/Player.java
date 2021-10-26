package fr.unilim.iut.katatennis;

public class Player {
    private int points;
    private String name;

    public Player(int points, String name) {
        this.points = points;
        this.name = name;
        resetPoints();
    }

    private void resetPoints() {
        this.points=0;
    }

    private void increaseOnePoint(){
        this.points = this.points + 1;
    }

    private String name(){
        return this.name;
    }

    private int points(){
        return this.points;
    }

}
