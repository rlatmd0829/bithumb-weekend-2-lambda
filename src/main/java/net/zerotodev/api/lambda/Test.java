package net.zerotodev.api.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {

   <T> List<T> test1(List<String> l){
        List<T> a = new ArrayList<>();
        return a;
    }

    <T> void print(List<T> list, Consumer<T> consumer){
        for(T t : list){
            consumer.accept(t);
        }
    }
}
