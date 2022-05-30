package ss19String_Regex.BaiTap.CrawlTinTuc;
import java.util.regex.Pattern;

public class CrawlNews {
public static void main(String[] args) {
    String regexCrawlNews = "^(https?)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
    String test = "https://james.codegym.vn/course/view.php?id=541&section=19";
    boolean checkRegex = Pattern.matches(regexCrawlNews,test);
    System.out.println(checkRegex);

    }
}
