package br.ufal.edge;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

/**
 * Hello world!
 * Se quiser executar no Maven: mvn exec:java -e "-Dexec.mainClass=br.ufal.edge.App"
 */
public class App {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            // Browser browser = playwright.webkit().launch();
            // Browser browser = playwright.firefox()
            // .launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
            Page page = browser.newPage();
            page.navigate("http://localhost:8080/cargo-tracker"); //Lembra que a aplicação deve estar executando.
            System.out.println(page.title());
            //page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
        }
    }
}
