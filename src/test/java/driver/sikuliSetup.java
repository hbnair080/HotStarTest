package driver;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class sikuliSetup {
    private String filepath="C:\\Users\\hbnai\\IdeaProjects\\comhotstartest\\src\\test\\ImageElementCollection";
    public Screen sikuliSetup()
    {
        Screen s=new Screen();
        return s;
    }

    public Pattern creatImage(Pattern name,String imagename)
    {
         name = new Pattern(filepath + imagename);
         name = name.similar(0.7f);
         return name;

    }


    public void waitForImageToLoad(Pattern imagename, int Timeout) throws FindFailed {
        Screen  s = new Screen();
        s.wait(imagename,Timeout);

    }

    public void clickonImage(Pattern imagename) throws FindFailed {   Screen  s = new Screen();
        s.click(imagename);
    }
}
