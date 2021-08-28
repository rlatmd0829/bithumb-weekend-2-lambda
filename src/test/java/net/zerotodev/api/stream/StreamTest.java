package net.zerotodev.api.stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
public class StreamTest {
    @Test
    @DisplayName("단항식 테스트")
    void apply(){
        Stream<String> s = Arrays.asList("Apple","Orange","").stream();
        int emptyStrings = (int)s.filter(String::isEmpty).count();
        assertThat(emptyStrings, is(equalTo(1)));
    }
}
