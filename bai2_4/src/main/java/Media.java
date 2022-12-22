
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author This PC
 */
public class Media {

    private String name;
    private double price;
    Scanner sc = new Scanner(System.in);

    public Media(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Media() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void input() {
        sc.nextLine();
        System.out.println("name : ");
        name = sc.nextLine();
        System.out.println("price : ");
        price = sc.nextDouble();

    }

    public void print() {
        System.out.println("name : " + name);
        System.out.println("price : " + price);
    }

    @Override
    public String toString() {
        return "name=" + name + ", price=" + price;
    }

}
