//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
////creat object for book and movie ----------------------------------------------------
       Book b1=new Book("book",100,"Moi");
        Movie m1=new Movie("Taken",150,"jhone");
 //print book and movie --------------------------------------------------------------
        System.out.println( b1.toString());
        System.out.println( m1.toString());

//create object move and print the output-----------------------------------------------
            MovablePoint move=new MovablePoint(0,0,2,6);
            System.out.println(move.toString());
//            move.moveRight();
            move.moveLeft();
//            move.moveDown();
            move.moveUp();

    }
}