package Interfaceee;

public class Document implements printable {
	private String content;

	public Document(String content) {
		this.content = content;
		

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Priting document:");
		System.out.println(content);
		
	}

}
