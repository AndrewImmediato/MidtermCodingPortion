package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.Test;
import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class TestCuboid {
	@Test
	public void getiWidthTest() {
		int ExpectedWidth = 10;
		Cuboid k = new Cuboid(10, 14, 6);
		int width = k.getiWidth();
		assertTrue(width == ExpectedWidth);
	}
	@Test
	public void getiLengthTest() {
		int ExpectedLength = 14;
		Cuboid k = new Cuboid(10, 14, 6);
		int length = k.getiLength();
		assertTrue(length == ExpectedLength);
	}
	@Test
	public void getiDepthTest() {
		int ExpectedDepth = 6;
		Cuboid k = new Cuboid(10, 14, 6);
		int depth = k.getiDepth();
		assertTrue(depth == ExpectedDepth);
	}
	@Test
	public void setiWidthTest() {
		int ExpectedWidth = 10;
		Cuboid k = new Cuboid(9, 2, 5);
		k.setiWidth(10);
		int width = k.getiWidth();
		assertTrue(width == ExpectedWidth);
	}
	@Test
	public void setiLengthTest() {
		int ExpectedLength = 3;
		Cuboid k = new Cuboid(9, 2, 5);
		k.setiLength(3);
		int length = k.getiLength();
		assertTrue(length == ExpectedLength);
	}
	@Test
	public void setiDepthTest() {
		int ExpectedDepth = 3;
		Cuboid k = new Cuboid(9, 2, 5);
		k.setiDepth(3);
		int depth = k.getiDepth();
		assertTrue(depth == ExpectedDepth);
	}
	@Test
	public void areaTest() {
		Cuboid k = new Cuboid(9, 2, 5);
		int expectedArea = 108;
		assertTrue(k.area() == expectedArea);
	}
	@Test (expected = UnsupportedOperationException.class)
	public void perimeterTest() {
		Cuboid k = new Cuboid(9, 2, 5);
		k.perimeter();
	}
	@Test (expected = IllegalArgumentException.class)
	public void illegalArgTest() {
		Cuboid k = new Cuboid(9, 2, 5);
		k.setiWidth(-9);
	}
	@Test
	public void SortByAreaTest() {
		Cuboid k = new Cuboid(9, 2, 5);
		Cuboid c = new Cuboid(2, 1, 1);
		assertTrue(k.SortByArea(Cuboid c, Cuboid k) == 16);
	}
	@Test
	public void SortByVolumeTest() {
		Cuboid k = new Cuboid(9, 2, 5);
		Cuboid c = new Cuboid(2, 1, 1);
		assertTrue(k.compareTo(Cuboid c, Cuboid k) == 88);
	}
	
}
