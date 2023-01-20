package polymorphism.human;

//Human スーパークラス：親クラス
public class Human {
	private String name;
	protected int age;

	//	コンストラクタ　このクラスをnewインスタンスした時に実行されるメソッド
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//final修飾子が設定されているのでサブクラスでオーバーライド禁止
	final public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getProfile() {
		return "名前は" + this.name + "、年齢は" + this.age;
	}

}
