
public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double length, double width) {

		if (length < 0 || length > 20) {
			this.length = 0;
		} else {
			this.length = length;
		}
		if (width < 0 || width > 20) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	public Rectangle(double length) {

		if (length < 0 || length > 20) {
			this.length = 0;
		} else {
			this.length = length;
		}
	}

	public void setLength(double length) {
		this.length = length;

	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		this.width = width;

	}

	public double getWidth() {
		return width;
	}

	public double getPerimeter() {

		double perimeter = 2 * (length + width);
		return perimeter;

	}

	public double getArea() {
		double area = length * width;
		return area;
	}

	public void printRectangle() {
		System.out.printf("Length: %.2f\n", getLength());
		System.out.printf("Width: %.2f\n", getWidth());
		System.out.printf("Perimeter: %.2f\n", getPerimeter());
		System.out.printf("Area: %.2f\n", getArea());
	}
}
