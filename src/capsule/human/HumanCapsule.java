package capsule.human;

public class HumanCapsule {
	private String name;
	private int age;

	//	コンストラクタ
	public HumanCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//	インスタンスメソッド
	public String getName() {
		return this.name;
	}

	//	インスタンスメソッド
	public void setName(String name) {
		this.name = name;
	}

	//	インスタンスメソッド
	public int getAge() {
		return this.age;
	}
}
