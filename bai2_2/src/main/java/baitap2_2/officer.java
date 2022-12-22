/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2_2;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;

/**
 *
 * @author This PC
 */
public class officer extends Person {

    private double salary;

    public officer(double salary, String name, String address, int phone) {
        super(name, address, phone);
        this.salary = salary;
    }

    public officer() {
    }

    public officer(String name, String address, int phone) {
        super(name, address, phone);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("salary : ");
        salary = sc.nextDouble();
    }

    public void inputListArray(ArrayList<officer> listArray) {
        System.out.println("input limited arraylist : ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("input the student " + (i + 1));
            officer of = new officer();
            of.input();
            listArray.add(of);
        }

    }

    public void OutlistArray(ArrayList<officer> listArray) {

        for (int i = 0; i < listArray.size(); i++) {
            System.out.println("officer " + (i + 1));
            System.out.println(listArray.get(i));
        }
    }

    @Override
    public String toString() {
        return "officer{" + super.toString() + "salary=" + salary + '}';
    }

    public void sort(ArrayList<officer> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {

                int[] dayMax = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                int ki = dayMax[list.get(i).getMonth()];
                int kj = dayMax[list.get(j).getMonth()];

                int sum = list.get(i).getYear() * 365 + list.get(i).getMonth() * ki + list.get(i).getDay();
                int sum2 = list.get(j).getYear() * 365 + list.get(i).getMonth() * kj + list.get(i).getDay();
                if (sum < sum2) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }

}
