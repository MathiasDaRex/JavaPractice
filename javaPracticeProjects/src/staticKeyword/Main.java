package staticKeyword;

public class Main {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		// 		The class "owns" the static member
		
		Friend friend1 = new Friend("Johnny");
		System.out.println(friend1.name);
		System.out.println(Friend.numberOfFriends);
		Friend friend2 = new Friend("Gold");
		System.out.println(friend2.name);
		System.out.println(Friend.numberOfFriends);
		Friend friend3 = new Friend("Bartos");
		System.out.println(friend3.name);
		System.out.println(Friend.numberOfFriends);
		Friend friend4 = new Friend("István");
		
		// We dont need to make an instance of the Friend class, the static variable can be called directly from the class
		System.out.println(Friend.numberOfFriends);
		// we can access it by an instance of the class but it's not recommended
		System.out.println(friend1.numberOfFriends);
		
		// As here, you can access a static method with only the class name, no need to make an instance.
		Friend.displayFriends();
		// Like
		Math.pow(10, 1);
		
	}

}
