package net.zerotodev.api.lambda;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import java.util.function.Supplier;

public class SupplierTest {
    @Test @DisplayName("Supplier Test ")
    void get(){
        Supplier<String> stringSupplier = () -> new String("No Pain, No Gain");
        String result = stringSupplier.get();
        assertThat(result, is(equalTo("No Pain, No Gain")));
        Supplier<Double> doubleSupplier = Math::random;
        double res = doubleSupplier.get();
        System.out.println(res);
    }
}
