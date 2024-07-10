package Interfaceee;

public class Image implements printable {
	private String name;
	private int width;
	private int height;

	public Image(String name , int width , int height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}

	@Override
	public void print() {
		System.out.println("printing image: " + name);
		System.out.println("Dimensions: " + width + " x " + height);
		System.out.println("[Image data]");
	}

}
