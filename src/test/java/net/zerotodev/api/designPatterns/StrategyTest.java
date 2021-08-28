package net.zerotodev.api.designPatterns;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StrategyTest { // 디자인패턴의 꽃, (필터를 많이씀)
    @Test @DisplayName("Strategy Pattern Example")
    void main(){
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("AAPL", 318.65, 10));
        stockList.add(new Stock("MSFT", 166.86, 45));
        stockList.add(new Stock("Google", 99, 12.5));
        stockList.add(new Stock("AMZ", 1866.74, 45));
        stockList.add(new Stock("GOOGL", 1480.20, 3.5));
        stockList.add(new Stock("AAPL", 318.65, 8));
        stockList.add(new Stock("AMZ", 1866.74, 9));
        StockFilters.filter(stockList, stock -> stock.getSymbol().equals("AMZ"))
                .forEach(System.out::println);
    }
    @Data class Stock{
        private final String symbol;
        private final double price;
        private final double units;
    }
}
class StockFilters{
    public static List<StrategyTest.Stock> filter(List<StrategyTest.Stock> list, Predicate<StrategyTest.Stock> predicate){
        List<StrategyTest.Stock> filtersData = new ArrayList<>();
        for(StrategyTest.Stock s : list){
            if(predicate.test(s)) filtersData.add(s);
        }
        return filtersData;
    }
}
