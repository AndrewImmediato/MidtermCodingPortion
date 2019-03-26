package pkgShape;
import java.util.Comparator;
public class Cuboid extends Rectangle {
	private int iDepth = 0;
	public Cuboid (int iLength, int iWidth, int t) {
	super(iLength, iWidth);
	iDepth = t;
	}
	public int getiDepth() {
		return iDepth;
	}
	public void setiDepth(int newZ) {
		if(newZ < 1) {
	    	throw new IllegalArgumentException();
	    } else { 
	    	this.iDepth = newZ;
	    }
	  }
	public double volume() {
		return (double)(super.getiWidth()*super.getiLength()*iDepth);
	}
	public double area() {
		return (double) (6*super.getiWidth()*super.getiLength());
	}
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	public class SortByArea implements Comparator<Cuboid> {
		public int compare(Cuboid c, Cuboid d) {
			return (int)(c.area()-d.area());
		}
	}
	public class SortByVolume implements Comparator<Cuboid> {
		public int compare(Cuboid c, Cuboid d) {
			return (int)(c.volume()-d.volume());
		}
	}
}


