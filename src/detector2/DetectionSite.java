package detector2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DetectionSite {
    //detection site:探测点
    public DetectionSite() throws IOException {
        File file = new File("./src/detector2/operation_steps.txt");    //operation_steps:操作步骤
        file.createNewFile();
        FileInputStream is = new FileInputStream(file);

    }

}
