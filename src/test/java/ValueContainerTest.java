
import org.example.ManyValues;
import org.example.MyList;
import org.example.SingleValue;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ValueContainerTest {

    @Test
    public void testSingleValue() {
        SingleValue value = new SingleValue(5);
        assertEquals(1, value.spliterator().estimateSize());
        assertEquals(5, (int) value.iterator().next());
    }

    @Test
    public void testManyValues() {
        ManyValues values = new ManyValues();
        values.add(1);
        values.add(2);
        values.add(3);
        assertEquals(3, values.spliterator().estimateSize());
        assertEquals(1, (int) values.get(0));
        assertEquals(2, (int) values.get(1));
        assertEquals(3, (int) values.get(2));
    }


    @Test
    public void testSum() {
        MyList list = new MyList(Arrays.asList(new SingleValue(1), new SingleValue(2), new SingleValue(3),new SingleValue(4)));
        int expectedSum = 10;
        int actualSum = list.sum();
        assertEquals(expectedSum, actualSum);
    }

}