package net.zerotodev.api.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class LengthOfStringTest {

    @BeforeEach
    void setUp() {
    }

    @Test @DisplayName("문자열의 길이 반환 테스트")
    void apply() {
        LengthOfString lengthOfString = str -> str.length();
        int result = lengthOfString.apply("apple");
        assertThat(result, is(equalTo(5)));
    }
}