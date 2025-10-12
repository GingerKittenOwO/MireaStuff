package ru.mirea.lab7.Ex1_3;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public void moveUp(double dist){
        topLeft.moveUp(dist);
        bottomRight.moveUp(dist);
    }
    public void moveDown(double dist){
        topLeft.moveDown(dist);
        bottomRight.moveDown(dist);
    }
    public void moveLeft(double dist){
        topLeft.moveLeft(dist);
        bottomRight.moveLeft(dist);
    }
    public void moveRight(double dist){
        topLeft.moveRight(dist);
        bottomRight.moveRight(dist);
    }
    public boolean speedTest(){
        return topLeft.getxSpeed() == bottomRight.getxSpeed()
                && topLeft.getySpeed() == bottomRight.getySpeed();
    }


    @Override
    public String toString() {
        return "Rectangle[" + topLeft + ", " + bottomRight + "]";
    }
}
