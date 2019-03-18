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
        String[] Dictonary = {"dogs", "cats", "wizard", "end"};
        while(true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("what would you like to see");
            input = scan.next();

            for(int i = 0; i < Dictonary.length; i++) {

                if (input.equalsIgnoreCase("end")) {
                    URL = "C:\\Users\\Adam\\IdeaProjects\\ImageRepository\\src\\" + input + ".jpg";
                    System.out.println("Thank you for browsing our image repository");
                    System.exit(0);
                }
                else if (input.equalsIgnoreCase(Dictonary[i])) {
                    URL = "C:\\Users\\Adam\\IdeaProjects\\ImageRepository\\src\\" + input + ".jpg";
                    DisplayImage cats = new DisplayImage();

                }
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