import java.util.Scanner;

class Room {
	double length, breadth, height;

	void set_values(double l, double b, double h) {
		length = l;
		breadth = b;
		height = h;
	}

	double getVolume() {
		return length * breadth * height;
	}
}

class Room_demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height: ");
		double height = sc.nextDouble();
		System.out.print("Enter breadth: ");
		double breadth = sc.nextDouble();
		System.out.print("Enter length: ");
		double length = sc.nextDouble();

		System.out.println("Height: " + height + " Breadth: " + breadth + " Length: " + length);

		Room room = new Room();
		room.set_values(length, breadth, height);

		System.out.println("Area of the room: " + room.getVolume());
	}
}