import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class _2 {
    public static void main(String[] args) throws IOException {
//Jsoup.connect("https://postman-echo.com/post").data("derp1", "derp2").data("sql1", "sql2").ignoreContentType(true).post().body().html()
        Document doc = Jsoup.connect("http://localhost:8820/a/login").post();
//        Jsoup.connect("http://google.com").get();
//        Jsoup.connect("google.com").data("key", "value").post();
    }
}
