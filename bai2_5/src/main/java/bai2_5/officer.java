/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_5;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author This PC
 */
public class officer extends Person {

    private double salary;

    public officer(double salary, String name, String phone, String province, String district) {
        super(name, phone, province, district);
        this.salary = salary;
    }

    public officer(double salary, String name, String phone) {
        super(name, phone);
        this.salary = salary;
    }

    public officer(double salary) {
        this.salary = salary;
    }

    public officer() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void input() {
        super.input();
        System.out.println("salary : ");
        salary = sc.nextDouble();

    }

    public void print() {
        super.print();
        System.out.println("salary : " + salary);

    }

    @Override
    public String toString() {
        return "officer{" + super.toString() + "salary=" + salary + '}';
    }

    public void listArrOfficer(ArrayList<officer> list) {
        System.out.println("input limited number of officer : ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            officer of = new officer();
            System.out.println(" the officer " + (i + 1));
            of.input();
            list.add(of);
        }
    }

    public void printList(ArrayList<officer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("================= officer " + (i + 1) + "=============");
            System.out.println(list.get(i));
        }
    }

    public void Cancel(ArrayList<officer> list) {
        System.out.print("input 0 to remove data, input 1 to print data :  ");
        sc.nextLine();
        int user = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {

            if (user == 1) {

                System.out.println("officer  " + (i + 1) + " {" + list.get(i) + " ");
            }
            if (user == 0) {

                System.out.print("Cancel !!!");
            }
        }
    }

    public void OutputMylist(ArrayList<officer> list) {

        Cancel(list);

    }

    public void sortUp(ArrayList<officer> list) {
        System.out.println("============= sort up by salary ! ================");
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getSalary() > list.get(j).getSalary()) {
                    Collections.swap(list, i, j);
                }
            }
        }
        System.out.println("===========after sorting========== ");
        printList(list);

    }

}
