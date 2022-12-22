
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
public class Book extends Media {

    private int numbersOfPage;
    private String authorName;

    public Book(int numbersOfPage, String authorName, String name, double price) {
        super(name, price);
        this.numbersOfPage = numbersOfPage;
        this.authorName = authorName;
    }

    public Book(int numbersOfPage, String authorName) {
        this.numbersOfPage = numbersOfPage;
        this.authorName = authorName;
    }

    public Book() {
    }

    public int getNumbersOfPage() {
        return numbersOfPage;
    }

    public void setNumbersOfPage(int numbersOfPage) {
        this.numbersOfPage = numbersOfPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void input() {
        super.input();
        sc.nextLine();
        System.out.println("the numbers Of Page");
        numbersOfPage = sc.nextInt();
        sc.nextLine();
        System.out.println("the author's Name");
        authorName = sc.nextLine();
    }

    public void print() {
        super.print();
        System.out.println("the numbers of page : " + numbersOfPage);
        System.out.println("the author's Name : " + authorName);
    }

    public void BookList(ArrayList<Book> list) {
        System.out.println("input limited Book : ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("input Book " + (i + 1));
            Book B = new Book();
            B.input();
            list.add(B);
        }
    }

    public void printList(ArrayList<Book> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("============ book " + (i + 1) + "============");
            System.out.println(list.get(i));
        }
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() + "numbersOfPage= " + numbersOfPage + ", authorName=" + authorName + '}';
    }

}
