package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homepage.clickFileUpload();
        uploadPage.uploadFile("E:\\testing\\resources\\chromedriver.exe");

        assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe","Incorrect Uploaded foles");
    }

}
