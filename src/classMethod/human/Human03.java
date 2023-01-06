package classMethod.human;

public class Human03 {
	//	メンバ変数
	public String name;
	public int age;
	public String profession;

	//	コンストラクタ
	public Human03() {
		this.name = "山田";
		this.age = 20;
		this.profession = "プログラマー";
	}

	//	String型の戻り値を返す引数なしのメソッドを定義
	public String getProfile() {
		return "年齢" + this.age + "で、職業は" + this.profession + "です。";
	}

	//	戻り値を返さないString型の引数を1つとるメソッドを定義
	public void greet(String friend) {
		if (friend == null) {
			System.out.println("挨拶する友達がわかりません！");
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}
