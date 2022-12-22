/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_8;

import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class MyDate {

    private int year;
    private int month;
    private int day;
    Scanner sc = new Scanner(System.in);

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean checkDate() {
        int[] dayMax = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("year: " + year);
        if (year % 4 == 0) {
            dayMax[2] = 29;
        }
        if (month > 13 || month < 0) {
            return false;
        }
        if (year < 0) {
            return false;
        }

        if ((day > dayMax[month])) {
            return false;
        }
        return true;

    }

    public void input() {

        do {
            System.out.println("input day : ");
            day = sc.nextInt();

            System.out.println("input month : ");
            month = sc.nextInt();

            System.out.println("input year : ");
            year = sc.nextInt();

        } while (checkDate() == false);

        //System.out.println(day+"/"+month+"/"+year);
    }

    public void print() {
        System.out.println(day + "/" + month + "/" + year);
    }

    @Override
    public String toString() {
        return "day=" + day + ", month=" + month + ", year=" + year;
    }
}
