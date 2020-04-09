import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import st.BubbleSort;
import org.junit.Test;

public class TestBubbleSort {

	@Test
	public void test() {
		int exp[] = {1,2,2,5,6};
		int arr[] = {1,6,2,2,5};
		Assert.assertArrayEquals(exp, BubbleSort.BubbleSort(arr));
	}

}
