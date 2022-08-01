package main.java;

public class Rectangle {
    private int length;
    private int weight;

    public  Rectangle(int length, int weight){
        this.length = length;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //There is the calculation starting

    public int getArea(){
        return this.getLength()*this.getWeight();
    }

    public int getPerimetr(){
        return this.getLength()*2 + this.getWeight()*2;
    }

    public double getDiagonal(){
        return Math.sqrt(this.getWeight()*this.getLength() + this.getWeight()*this.getWeight());
    }

    public double getBreadth(){
        return getPerimetr()/2.0;
    }

}
