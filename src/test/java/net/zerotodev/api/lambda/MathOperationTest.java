package net.zerotodev.api.lambda;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
class MathOperationTest {

    @Test @DisplayName("사칙연산 프로그램")
    void apply() {
        MathOperation mathOperation = (a, b) -> a + b;
        int result = mathOperation.apply(5, 7);
        assertThat(result, is(equalTo(12)));
    }
}