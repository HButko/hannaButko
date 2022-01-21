package tests.LessonTwenty;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.GeoResultPage;
import tests.BaseTest;

// https://the-internet.herokuapp.com/geolocation - кликнуть на кнопку, и после клика - достать значения координат,
// которые будут выводиться на экран. После клика нужно вставить задержку, иначе код может падать.
// Проще всего сделать через Thread.sleep(1000) (также нужно обработать исключение)

public class testTaskThree extends BaseTest {

    @Test
    public void locationLocatorTest() {
        GeoResultPage geolocation = openApp()
                .goToGeoPage()
                .geoButton()
                .mapLocate();

        String resultLat = geolocation.geoLocationLat();
        String resultLong = geolocation.geoLocationLong();

//        System.out.printf("\n Latitude: " + resultLatValue.getText() + "\n Longitude: " + resultLongValue.getText());

        Assert.assertTrue(resultLat.contains("50.4758272"), "Invalid latitude");
        Assert.assertTrue(resultLong.contains("30.4381952"), "Invalid longitude");
    }
}
