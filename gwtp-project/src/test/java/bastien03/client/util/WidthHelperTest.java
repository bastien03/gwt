package bastien03.client.util;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WidthHelperTest {

	private WidthHelper helper;

	@Before
	public void setUp() {
		helper = new WidthHelper();
	}

	@Test
	public void test() {
		int width = 500;
		assertEquals(width,
				helper.getLeftWidth(width) + helper.getRightWidth(width));
		assertEquals(width,
				helper.getBottomHeight(width) + helper.getTopHeight(width));

		width = 250;
		assertEquals(width,
				helper.getLeftWidth(width) + helper.getRightWidth(width));
		assertEquals(width,
				helper.getBottomHeight(width) + helper.getTopHeight(width));

		width = 125;
		assertEquals(width,
				helper.getLeftWidth(width) + helper.getRightWidth(width));
		assertEquals(width,
				helper.getBottomHeight(width) + helper.getTopHeight(width));

		width = 125 / 2;
		assertEquals(width,
				helper.getLeftWidth(width) + helper.getRightWidth(width));
		assertEquals(width,
				helper.getBottomHeight(width) + helper.getTopHeight(width));
	}
}
