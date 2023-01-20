package polymorphism.human;

//Human 継承のサブクラス　
public class Student extends Human {
	private int score;

	//	コンストラクタ
	public Student(String name, int age, int score) {
		//		親クラスのコンストラクタを呼び出し
		super(name, age);
		this.score = score;
	}

	//	オーバーライドして、Studentクラス用に処理を変更
	@Override
	public String getProfile() {
		String profile = "年齢は" + super.age + "です。";
		profile += "学生で、テストの点数は" + this.score + "です。";
		return profile;
	}

}
