package com.loabot.getstockprice;

import com.loabot.getstockprice.crawling.KrStockCrawling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CrawlingTests {

    @Autowired
    KrStockCrawling krStockCrawling;

    @Test
    public void priceTest(){
        // Assertions.assertEquals("53100", krStockCrawling.GetPrice("005930"));
    }

}
