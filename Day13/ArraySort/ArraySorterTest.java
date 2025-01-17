package Day13.ArraySort;

import org.junit.Assert;
import org.junit.Test;
public class ArraySorterTest {
    @Test
    public void testSortArrayWithDuplicates() {
        ArraySorter sorter = new ArraySorter ();
        int[] input = {4, 2, 9, 2, 5, 9, 3};
        int[] expected = {2, 2, 3, 4, 5, 9, 9};
        Assert.assertArrayEquals(expected, sorter.sortArray(input));
    }
    @Test
    public void testSortArrayAlreadySorted() {
        ArraySorter sorter = new ArraySorter();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, sorter.sortArray(input));
    }
    @Test
    public void testSortEmptyArray() {
        ArraySorter sorter = new ArraySorter();
        int[] input = {};
        int[] expected = {};
        Assert.assertArrayEquals( expected, sorter.sortArray(input));
    }
    @Test
    public void testSortArrayWithNegativeNumbers() {
        ArraySorter sorter = new ArraySorter();
        int[] input = {-1, -5, 3, 2, 0};
        int[] expected = {-5, -1, 0, 2, 3};
        Assert.assertArrayEquals( expected, sorter.sortArray(input));
    }

    @Test
    public void testSortNullArray() {
        ArraySorter sorter = new ArraySorter();
        IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class, () -> {
            sorter.sortArray(null);
        });
        Assert.assertEquals("Array cannot be null", exception.getMessage());
    }
}
