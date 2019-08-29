import static org.junit.Assert.*;

public class FinderTest {

    //Tests findMax with valid arrays
    @org.junit.Test
    public void test_findMax_valid() {
        Finder testingFinder = new Finder();
        int[] intArray= {1,2,3,4,5};
        Integer expected = 5;
        Integer actual = testingFinder.findMax(intArray);
        assertEquals(expected, actual);

        int[] intArray2= {5,27,17,4,23, -8};
        expected = 27;
        actual = testingFinder.findMax(intArray2);
        assertEquals(expected, actual);

        int[] intArray3= {100,27,17,4,23, -8};
        expected = 100;
        actual = testingFinder.findMax(intArray3);
        assertEquals(expected, actual);

    }

    //Tests findMin wih valid arrays
    @org.junit.Test
    public void test_findMin_valid() {
        Finder testingFinder = new Finder();
        int[] intArray= {1,2,3,4,5};
        Integer expected = 1;
        Integer actual = testingFinder.findMin(intArray);
        assertEquals(expected, actual);

        int[] intArray2= {5,27,17,4,23, -8};
        expected = -8;
        actual = testingFinder.findMin(intArray2);
        assertEquals(expected, actual);

        int[] intArray3= {100,27,17,4,23, 8};
        expected = 4;
        actual = testingFinder.findMin(intArray3);
        assertEquals(expected, actual);
    }

    //Tests the findMax method with empty and null arrays
    @org.junit.Test
    public void test_findMax_null() {
        Finder testingFinder = new Finder();
        int[] emptyArray = null;
        Integer actual = testingFinder.findMax(emptyArray);
        assertNull(actual);

        actual = testingFinder.findMax(null);
        assertNull(actual);

    }

    //Tests the findMin method with empty and null arrays
    @org.junit.Test
    public void test_findMin_null() {
        Finder testingFinder = new Finder();
        int[] emptyArray = null;
        Integer actual = testingFinder.findMin(emptyArray);
        assertNull(actual);

        actual = testingFinder.findMin(null);
        assertNull(actual);

    }
}