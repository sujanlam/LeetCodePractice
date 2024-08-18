package leetcode50.OnetoTen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductButSelfTest {

    @Test
    void productExceptSelf() {
        ProductButSelf productButSelf = new ProductButSelf();
        int[] input = {1, 2, 3, 4, 5};
        int[] expectedOutput = {120, 60, 40, 30, 24};

        int[] result = productButSelf.productExceptSelf(input);

        assertArrayEquals(expectedOutput, result, "The productExceptSelf method should return the correct product array");
    }
}