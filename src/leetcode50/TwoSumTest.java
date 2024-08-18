package leetcode50;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TwoSumTest {
    int[] arr;
    int[] arr2;
    @BeforeEach
    void setUp() {
        arr = new int[]{2, 7, 11, 15};
        arr2= new int[]{};
    }

    @Test
    void twoSum() {
        int[] result = TwoSum.twoSum(arr, 22);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    void testIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () ->{
            TwoSum.twoSum(arr2, 23);
        }, "No such element");
    }

}