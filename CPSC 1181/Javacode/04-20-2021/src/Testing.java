import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        Media.Book b = new Media.Book.GraphicNovel();
        Media.Book.Novel n = (Media.Book.Novel) b;
        System.out.println(n.numPages());

    }
}
