package brownies;

public class MyClass {
	public static void main(String[] args) {
		Brownie Alexie = new Brownie("Alexie");
		Alexie.sayHello();
		Alexie.setFriends(0,"Barbara");
		String[]Alexie_friends = Alexie.getFriends();
		System.out.println("My friend is "+Alexie_friends[0]);
		System.out.println("My popularity is "+Alexie.getPopularity());
		
		Brownie Carol = new Brownie("Carol");
		Carol.sayHello();
		Carol.setFriends(0,"Debbie");
		String[]Carol_friends = Carol.getFriends();
		System.out.println("My friend is "+Carol_friends[0]);
		
		Alexie.sayHello();
		System.out.println("My friend is "+Alexie_friends[0]);
		
		
	}
}