public class Container {
	
	String item1;
	String item2;
	
	public Container(String item1, String item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void printItems() {
		System.out.println("Printing the content of the container");
			System.out.println("Item 1: " + item1);
			System.out.println("Item 2: " + item2);
			System.out.println();
	}
}

