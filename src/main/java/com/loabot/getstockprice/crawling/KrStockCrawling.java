package com.loabot.getstockprice.crawling;

import lombok.Getter;
import lombok.Setter;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Getter
@Setter
public class KrStockCrawling {

    public KrStockCrawling(){

    }

    public String GetPrice(String CodeNum){
        String URL = GetURL(CodeNum);
        Connection conn = Jsoup.connect(URL);

        try{
            Document document = conn.get();
            Elements em2 = document.select(" #middle > dl > dd:nth-child(5)");
            return em2.get(0).text().split(" ")[1];

        }catch (IOException e){
            e.printStackTrace();
        }
        return "0";
    }

    private String GetURL(String CodeNum){
        return "https://finance.naver.com/item/main.nhn?code=" + CodeNum; //
    }

}
