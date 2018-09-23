package brownies;

public class Brownie {
	private String[]friends;
	private String brownie_name;
	private int popularity;
	Brownie(String name){
		brownie_name = name;
		friends = new String[3];
	}
	
	void sayHello() {
		System.out.println("I'm "+brownie_name);
	}
	
	void setName(String name) {
		brownie_name = name;
	}

	public String getName() {
		return brownie_name;
	}
		
	void setPopularity(int popularity_score) {
		popularity = popularity_score;
	}

	public int getPopularity() {
		return popularity;
	}
	
	void setFriends(int i, String name) {
		friends[i] = name;
	}
	
	public String[] getFriends() {
		return friends;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
