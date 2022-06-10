package tooo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        {

           Root utilities = Main.getValues();

            System.setProperty("webdriver.chrome.driver",utilities.login.main_url);

           NewLife went = new NewLife();

            System.out.println("myname"+ went.putOut());

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--lang=en");

            WebDriver driver=new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://store.steampowered.com");
            //driver.findElement(By.xpath("//a[contains(@href,'about')]")).click();
            driver.findElement(By.xpath("//a[contains(@class,'menuitem') and contains(text(),'ABOUT')]")).click();
            //driver.findElement(By.xpath("//a[contains(@class,'menuitem') and contains(text(),'ABOUT')]")).click();

            //Number of players online
            WebElement online = driver.findElement(By.xpath("//div[@class='online_stat'][1]"));
            String numberOnline = online.getText().replaceAll("[^\\.0123456789]","");
            int playersOnline = Integer.parseInt(numberOnline);
            //System.out.println(playersOnline);

            //Number of players in a game
            WebElement inGame = driver.findElement(By.xpath("//div[@class='online_stat'][2]"));
            String numberPlayers = inGame.getText().replaceAll("[^\\.0123456789]","");
            int playersInGame = Integer.parseInt(numberPlayers);
            //System.out.println(playersInGame);

            //Compare the numbers
            if (playersOnline > playersInGame) {
                System.out.println("Number of in-game players is less than number of players online");
            } else {
                System.out.println("Number of online players is less than number of in-game players");
            }

            driver.findElement(By.xpath("//a[contains(@class,'menuitem') and contains(text(),'STORE')]")).click();

            driver.findElement(By.xpath("//span[contains(@class,'icon') and contains(@class,'top_sellers')]")).click();


            driver.findElement(By.xpath("//div[contains(@data-loc,'Singleplayer')]")).click();
            driver.quit();

            Root main_url2 = Main.getValues();
            System.out.println(main_url2.login.userName);
        }
    }
}

