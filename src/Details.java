
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;


public class Details {


    int width = 0;
    int height = 0;
    String URL;


    public Details(String filename) throws Exception {


        this.URL = filename;


        BufferedImage bimg = ImageIO.read(new File(filename));
        this.width          = bimg.getWidth();
        this.height         = bimg.getHeight();

    }


    public Integer getWidth(){
        return  width;
    }

    public Integer getHeight(){
        return  height;
    }

    public String getURL(){
        return  URL;
    }

}
