package brownies;

public class MyClass {
	public static void main(String[] args) {
		Brownie Alexie = new Brownie("Alexie");
		Brownie Barbara = new Brownie("Barbara");
		Alexie.sayHello();
		Alexie.setFriends(0,Barbara);
		Brownie[]Alexie_friends = Alexie.getFriends();
		System.out.println("My friend is "+Alexie_friends[0].toString());
		System.out.println("My popularity is "+Alexie.getPopularity());
		
		Brownie Carol = new Brownie("Carol");
		Brownie Debbie = new Brownie("Debbie");
		Carol.sayHello();
		Carol.setFriends(0,Debbie);
		Brownie[]Carol_friends = Carol.getFriends();
		System.out.println("My friend is "+Carol_friends[0].toString());
		
		Alexie.sayHello();
		System.out.println("My friend is "+Alexie_friends[0]);
		
	}
}