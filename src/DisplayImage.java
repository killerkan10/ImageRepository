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

    public static void main(String avg[]) throws IOException, Exception
    {

        String input;


        String[] Dictonary = {"dogs", "cats", "wizard", "end"};
        while(true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("what would you like to see");
            input = scan.next();

            Details info2 = new Details("C:\\Users\\Adam\\IdeaProjects\\ImageRepository\\src\\" + input + ".jpg");
            URL = info2.URL;

            for(int i = 0; i < Dictonary.length; i++) {


                if (input.equalsIgnoreCase("end")) {

                    System.out.printf("Thank you for browsing our image repository. File size H %s, W %s,",info2.height, info2.width);
                    System.exit(0);
                }

                else if (input.equalsIgnoreCase(Dictonary[i])) {

                    System.out.printf("H %s, W %s\n",info2.height, info2.width);
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
    }


}