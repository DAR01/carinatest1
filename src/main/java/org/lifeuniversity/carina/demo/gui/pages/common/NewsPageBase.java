package org.lifeuniversity.carina.demo.gui.pages.common;

import java.util.List;

import org.openqa.selenium.WebDriver;

import org.lifeuniversity.carina.demo.gui.components.NewsItem;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class NewsPageBase extends AbstractPage {

    public NewsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract List<NewsItem> searchNews(String searchInput);

}
