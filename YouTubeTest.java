import com.codeborne.selenide.*;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class YouTubeTest {
    @Test
    public void searchOnGoogle () {
        Configuration.browserSize = "1920x1080";
      open("https://www.google.com/");
      Selenide.sleep(2000);
      $(byName("q")).setValue("youtube");
      $(byValue("Google ძებნა")).click();
      Selenide.sleep(2000);
      


     open("https://www.youtube.com/");
     Selenide.sleep(2000);
     $(byName("search_query")).setValue("intellij idea");
     Selenide.sleep(2000);
     $(byId("search-icon-legacy")).click();
     Selenide.sleep(2000);
     open("https://www.youtube.com/watch?v=yefmcX57Eyg");
     Selenide.sleep(2000);






    }
}
