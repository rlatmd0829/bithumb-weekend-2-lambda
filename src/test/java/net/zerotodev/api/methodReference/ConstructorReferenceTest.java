package net.zerotodev.api.methodReference;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
public class ConstructorReferenceTest {
    @Test @DisplayName("단항식 테스트")
    void apply(){
        Function<Runnable, Thread> function = Thread::new;
        function
                .apply(() -> System.out.println("Task 1 executed "))
                .start();
        function
                .apply(() -> System.out.println("Task 2 executed "))
                .start();
    }
}
