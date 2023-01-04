
public class Human01 {
	//	メンバ変数（オブジェクトがどんな人かを表す変数）
	public String name;
	public int age;

	//	引数なしのコンストラクタ　クラスをnewした瞬間に実行される
	public Human01() {
		name = "山田";
		age = 20;
	}

	public Human01(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
