/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2_1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author This PC
 */
public class employee extends Person {

    private String phongBan;
    private float heSoLuong;
    private int day;
    private int month;
    private int year;
    private double salary;
    // ArrayList<employee> list=new ArrayList<>();
    myDate md = new myDate();

    public employee(String phongBan, float heSoLuong, int day, int month, int year, String name, String birthDay, String adress, double salary) {
        super(name, birthDay, adress);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.day = day;
        this.month = month;
        this.year = year;
        this.salary = salary;
    }

    public employee() {
        super();
    }

    public employee(String phongBan, float heSoLuong, int day, int month, int year, double salary) {
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.day = day;
        this.month = month;
        this.year = year;
        this.salary = salary;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("input phong ban : ");
        phongBan = sc.nextLine();
        System.out.println("input he so luong : ");
        heSoLuong = sc.nextFloat();
        sc.nextLine();
        System.out.println("input ngay vao cong ty : ");

        do {
            System.out.println("input day : ");
            day = sc.nextInt();

            System.out.println("input month : ");
            month = sc.nextInt();

            System.out.println("input year : ");
            year = sc.nextInt();

        } while (md.checkDate() == false);
        System.out.println("input salary : ");
        salary = sc.nextDouble();

    }

    public void arrayList(ArrayList<employee> list) {
        System.out.println("input limited number : ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {

            System.out.println("input employee " + (i + 1));
            employee em = new employee();
            em.input();
            em.countSalary();
            list.add(em);

        }

    }

    public void output(ArrayList<employee> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("employee : " + (i + 1));
            System.out.println(list.get(i));
        }
    }

    @Override
    public String toString() {
        return "employee{" + "phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", day=" + day + ", month=" + month + ", year=" + year + ", salary=" + salary;
    }

    public double countSalary() {
        return salary * heSoLuong;
    }

    public void printDate(ArrayList<employee> list) {
        Date today = new Date(); // Fri Jun 17 14:54:28 PDT 2016
        Calendar cal = Calendar.getInstance();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 6
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH); // 17
        int dayOfYear = 2022;
        int sumToday = (dayOfWeek - 1) + dayOfMonth + dayOfYear * 356;

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {

                int[] dayMax = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                int ki = dayMax[list.get(i).getMonth()];
                int kj = dayMax[list.get(j).getMonth()];

                int sum = list.get(i).getYear() * 365 + list.get(i).getMonth() * ki + list.get(i).getDay();
                int sum2 = list.get(j).getYear() * 365 + list.get(i).getMonth() * kj + list.get(i).getDay();
                if ((sum - sumToday) < (sum - sum2)) {
                    Collections.swap(list, i, j);

                }
            }
        }
    }

}
