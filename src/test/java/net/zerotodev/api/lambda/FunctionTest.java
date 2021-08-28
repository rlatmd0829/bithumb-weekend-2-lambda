package net.zerotodev.api.lambda;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FunctionTest {
    @Test @DisplayName("Function Test")
    void apply(){
        List<String> list = Arrays.asList("Bithumb", "Cooperation", "Market");
        Function<String, Integer> function = String::length;
        int count = function.apply(list.get(0));
        assertThat(count, is(equalTo(7)));
        List<Integer> newList = map(list, function);
        System.out.println(newList);
        assertThat(newList.get(1), is(equalTo(11)));
    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> newList = new ArrayList<>();
        for(T t : list){
            newList.add(function.apply(t));
        }
        return newList;
    }
}
