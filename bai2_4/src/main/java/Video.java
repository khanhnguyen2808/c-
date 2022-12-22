
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author This PC
 */
public class Video extends Media {

    private String runTime;
    private double sellPrice;

    public Video(String runTime, double sellPrice, String name, double price) {
        super(name, price);
        this.runTime = runTime;
        this.sellPrice = sellPrice;
    }

    public Video(String runTime, double sellPrice) {
        this.runTime = runTime;
        this.sellPrice = sellPrice;
    }

    public Video() {
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void input() {
        super.input();
        sc.nextLine();
        System.out.println("run time : ");
        runTime = sc.nextLine();
        System.out.println("sell price : ");
        sellPrice = sc.nextDouble();
    }

    public void print() {
        super.print();
        System.out.println("the runTime : " + runTime);
        System.out.println("the sell price : " + sellPrice);
    }

    public void VideoList(ArrayList<Video> list) {
        System.out.println("input limited Video : ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("input Video " + (i + 1));
            Video V = new Video();
            V.input();
            list.add(V);
        }
    }

    public void printList(ArrayList<Video> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("============ Video " + (i + 1) + "============");
            System.out.println(list.get(i));
        }
    }

    @Override
    public String toString() {
        return "Video{" + super.toString() + "runTime=" + runTime + ", sellPrice=" + sellPrice + '}';
    }

}
