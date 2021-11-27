
class Ractangle{
	private float length;
	private float breadth;
	
	public void setLength(float a) {
		this.length = a;
	}
	
	public float getLength() {
		return length;
	}
	
	public void setBreadth(float b) {
		this.breadth = b;
	}
	
	public float getBreadth() {
		return breadth;
	}
	
	public float getArea() {
		return length*breadth;
	}
	
	public float getPerimeter() {
		return 2*(length+breadth);
	}
}


public class Area{
	public static void main(String[] arg) {
		
		Ractangle area = new Ractangle();
		area.setLength(10.0f);
		area.setBreadth(20.0f);
		System.out.println(area.getArea());
		System.out.println(area.getPerimeter());
		Ractangle r2 = new Ractangle();
		r2 = area;
		System.out.println(r2.getArea());
		System.out.println(r2.getLength());
		
	}
}