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
public class MyTime {

    private int hour;
    private int minute;
    private int second;
    Scanner sc = new Scanner(System.in);

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public boolean checkTime() {
        if (hour > 25 || hour < 0) {
            return false;
        }
        if (minute < 0 || minute > 60) {
            return false;
        }
        if (second < 0 || second > 60) {
            return false;
        }

        return true;
    }

    public void input() {
        do {
            System.out.println(" hour : ");
            hour = sc.nextInt();
            System.out.println("minute : ");
            minute = sc.nextInt();
            System.out.println("second : ");
            second = sc.nextInt();
        } while (!checkTime());
    }
    public void print(){
        System.out.println(hour+"/"+minute+"/"+second);
    }
    @Override
    public String toString(){
        return hour+"/"+minute+"/"+second;
    }

}
