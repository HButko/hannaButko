package tests.LessonTwentySix;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DownloadPage;
import pageObjects.UploadResultPage;
import tests.BaseTest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;


//Написать тест, который будет скачивать файл с сервера, его модифицировать и потом загружать обратно.
//Для скачивания - использовать страницу https://the-internet.herokuapp.com/download
//Отсюда нужно скачать любой текстовый файл (при желании - можно усложнить, скачать рандомно любой из текстовых).
//В этот файл записать несколько строк (содержимое строк - не важно)
//Для загрузки файла на сервер - использовать страницу https://the-internet.herokuapp.com/upload
//проверить, что файл загружается
//Логику работы со страницами - вынести в классы PageObject
//Логика работы с файлами должны быть в тесте

public class testFileOperations extends BaseTest {

    @Test
    public void testFile(){
        //Download file
        DownloadPage downloadFile = openApp()
                .goToDownloadPage()
                .getFile();
        fileDownloadWait("dummy.txt");

        //Update file
        try {
            Path path = Paths.get("target/download/dummy.txt");
            List<String> lines = Files.readAllLines(path);
            Files.write(path, lines, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Upload file
        UploadResultPage uploadFile = openApp()
                .goToUploadPage()
                .setFile(new File("target/download/dummy.txt"))
                .submitButton();

        String verifyText = String.valueOf(uploadFile.fileUploaded());
        Assert.assertFalse(verifyText.contains("dummy.txt"), "File is not uploaded");
    }

    private void fileDownloadWait (String fileName) {
        int attempt = 0;
        do {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (++attempt > 10) {
                throw new RuntimeException("File is not downloaded");
            }
        } while (!new File ("target/download/" + fileName).exists());
    }
}
