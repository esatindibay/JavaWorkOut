package OOPs;

class poly {
	void eat() {
		System.out.println("poly is eating...");
	}
}

class Dog extends poly {
	void eat() {
		System.out.println("dog is eating...");
	}
}

class polymorphism extends Dog {

	public static void main(String[] args) {
		polymorphism a = new polymorphism();
		a.eat();
	}

}
