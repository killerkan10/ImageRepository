import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author adam.evans
 */


public class DisplayImage {

    static String URL;

    public static void main(String avg[]) throws IOException
    {
        String input;
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("what would you like to see");
            input = scan.next();

            if("cats".equals(input)){
                URL = "C:\\Users\\Adam\\IdeaProjects\\ImageRepository\\src\\cats.jpg";
                DisplayImage cats = new DisplayImage();

            }else if("dogs".equals(input)){
                URL = "C:\\Users\\Adam\\IdeaProjects\\ImageRepository\\src\\dogs.jpg";
                DisplayImage dogs = new DisplayImage();

            }else if("wizard".equals(input)) {
                URL = "C:\\Users\\Adam\\IdeaProjects\\ImageRepository\\src\\wizard.jpg";
                DisplayImage wizards = new DisplayImage();
            }else{

                System.out.println("Sorry we cant find any of those images");
                System.exit(0);

            }
        }
    }


    public DisplayImage() throws IOException
    {
        BufferedImage img=ImageIO.read(new File(URL));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}