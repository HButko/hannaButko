package tests.LessonTwentySeven;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsSelenide.DownloadPage;
import pageObjectsSelenide.UploadPage;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static com.codeborne.selenide.Selenide.open;

//Переписать код из прошлого занятия для download/upload с использованием Selenide (можно написать новый класс PageObject)
public class testDownloadUpload {

    @Test
    public void testFileOperations() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));

        String downloadPageLink = "https://the-internet.herokuapp.com/download";
        String uploadPageLink = "https://the-internet.herokuapp.com/upload";
        Configuration.downloadsFolder = "target/download/";

        //Download file
        open(downloadPageLink);
        DownloadPage downloadPage = new DownloadPage();
        downloadPage.downloadFile();

        //Update file
        try {
            Path path = Paths.get("target/download/1647295909518_6036_1/some-file.txt");
            List<String> lines = Files.readAllLines(path);
            Files.write(path, lines, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Upload file
        open(uploadPageLink);
        UploadPage uploadPage = new UploadPage();
        uploadPage.setFileInInput(new File("target/download/1647295909518_6036_1/some-file.txt"));
        uploadPage.submitFileUpload();
        uploadPage.uploadVerification();
    }
}
