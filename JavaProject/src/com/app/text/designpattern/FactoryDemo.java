package com.app.text.designpattern;

public class FactoryDemo {

	public static void main(String[] args) {
		HumanFactory humanFactory = new HumanFactory();
		Human human = humanFactory.getHuman("female");
		human.walk();
		human.talk();
	}
}

class HumanFactory {
	
	Human getHuman(String gender) {
		Human human = null;
		if("female".equals(gender)) {
			human = new Girl();
		} else if("male".equals(gender)){
			human = new Boy();
		}
		
		return human;
	}
}

interface Human {
	public void walk();
	public void talk();
}

class Boy implements Human{

	public void walk() {
		System.out.println("Boy is walking");
	}

	public void talk() {
		System.out.println("Boy is talking");
	}
}

class Girl implements Human{

	public void walk() {
		System.out.println("Girl is walking");
	}

	public void talk() {
		System.out.println("Girl is talking");
	}
}
