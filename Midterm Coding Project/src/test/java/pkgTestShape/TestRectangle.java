package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.Test;
import pkgShape.Rectangle;

public class TestRectangle {
	@Test
	public void getiWidthTest() {
		int ExpectedWidth = 10;
		Rectangle k = new Rectangle(10, 14);
		int width = k.getiWidth();
		assertTrue(width == ExpectedWidth);
	}
	@Test
	public void getiLengthTest() {
		int ExpectedLength = 14;
		Rectangle k = new Rectangle(10, 14);
		int length = k.getiLength();
		assertTrue(length == ExpectedLength);
	}
	@Test
	public void setiWidthTest() {
		int ExpectedWidth = 10;
		Rectangle k = new Rectangle(9, 2);
		k.setiWidth(10);
		int width = k.getiWidth();
		assertTrue(width == ExpectedWidth);
	}
	@Test
	public void setiLengthTest() {
		int ExpectedLength = 3;
		Rectangle k = new Rectangle(9, 2);
		k.setiLength(3);
		int length = k.getiLength();
		assertTrue(length == ExpectedLength);
	}
	@Test
	public void areaTest() {
		Rectangle k = new Rectangle(9, 2);
		int expectedArea = 18;
		assertTrue(k.area() == expectedArea);
	}
	@Test
	public void perimeterTest() {
		Rectangle k = new Rectangle(9, 2);
		int expectedPerimeter = 22;
		assertTrue(k.perimeter() == expectedPerimeter);
	}
	@Test
	public void compareToTest() {
		Rectangle k = new Rectangle(9, 2);
		Rectangle c = new Rectangle(2,1);
		assertTrue(k.compareTo(Rectangle c) == 16);
	}
	@Test (expected = IllegalArgumentException.class)
	public void illegalArgTest() {
		Rectangle k = new Rectangle(9, 2);
		k.setiWidth(-9);
	}
}
