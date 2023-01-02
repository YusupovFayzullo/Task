package constructors;

public record CompactConstructor(String id, int age) {



}

class Test{
	public static void main(String[] args) {
		CompactConstructor compactConstructor=new CompactConstructor("2",12);

		System.out.println("compactConstructor = " + compactConstructor);
	}
}
