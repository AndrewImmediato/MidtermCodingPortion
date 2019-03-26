package pkgShape;

public class Rectangle {
	private int iWidth = 0;
	private int iLength = 0;
	public Rectangle (int x, int y) {
		iWidth = x;
		iLength = y;
	}
	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int newX) {
		if(newX < 1) {
	    	throw new IllegalArgumentException();
	    } else { 
	    	this.iWidth = newX;
	    }
	  }
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int newY) {
		if(newY < 1) {
	    	throw new IllegalArgumentException();
	    } else { 
	    	this.iLength = newY;
	    }
	  }
	public double area() {
		return (double)(iWidth*iLength);
	}
	public double perimeter() {
		return (double)((2*iWidth)+(2*iLength));
	}
	public int compareTo(Object block) {
		Rectangle examp = (Rectangle) block;
		return (int)(this.area()-examp.area());
	}
}
