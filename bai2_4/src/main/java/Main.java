
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author This PC
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Book> listBook = new ArrayList<>();
        ArrayList<Video> listVideo = new ArrayList<>();
        
        Book B = new Book();
        Video V = new Video();

        B.BookList(listBook);
        B.printList(listBook);
        V.VideoList(listVideo);
        V.printList(listVideo);
        
    }
}
