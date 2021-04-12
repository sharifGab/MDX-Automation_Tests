package step_definition;

import Base.BaseUtil;
import io.cucumber.core.backend.TestCaseState;
import org.junit.After;
import org.junit.Before;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hook extends BaseUtil {

    private final BaseUtil baseUtil;

    public Hook(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Before
    public void InitializeTest() {
        System.out.println("Opening Mock Browser");
        baseUtil.StepInfo("ChromeDriver()");
        baseUtil.print("Launched");
    }

    @After
    public void TearDownTest() throws InterruptedException, AWTException, IOException {
        TestCaseState scenario = null;
        if (scenario.isFailed()) {

            System.out.println("Scenario Failed @ ");
            Thread.sleep(120);
            Robot r = new Robot();
            String path = "C:\\Whitelisted\\GitHub\\FEi\\MDX-Automation_Tests\\src\\main";
            Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = r.createScreenCapture(capture);
            ImageIO.write(Image, "jpg", new File(path));
            System.out.println("Screen Shot Saved");

        }

        System.out.println("Closing Mock Browser");

    }

}
