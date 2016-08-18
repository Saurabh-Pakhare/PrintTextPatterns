import java.util.Scanner;

/**
 * Created by saurabh on 13/8/16.
 */
public class Driver {

    static Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args)
    {
        //Input for drawing box(s)
        int numberOfBlocks;

        System.out.print("Enter number of boxes: ");
        numberOfBlocks = CONSOLE.nextInt();

        //Pattern pattern1 = new Pattern(numberOfBlocks);
        Pattern.DrawBox(numberOfBlocks);

        //Input for drawing Maze
        int width, height;

        System.out.print("Enter width of pattern:");
        width = CONSOLE.nextInt();

        System.out.print("Enter height of pattern:");
        height = CONSOLE.nextInt();

       // Pattern pattern2 = new Pattern(width, height);
        Pattern.DrawMaze(width, height);

        CONSOLE.close();
    }

}
