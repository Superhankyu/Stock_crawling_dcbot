package com.loabot.getstockprice.API;

import com.loabot.getstockprice.crawling.KrStockCrawling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final KrStockCrawling krStockCrawling;

    public Controller(KrStockCrawling krStockCrawling){
        this.krStockCrawling = krStockCrawling;
    }

    @GetMapping("stockprice/codenum/{codeid}")
    public String getCurrentPrice(@PathVariable String codeid) {
        return krStockCrawling.GetPrice(codeid);
    }


}
