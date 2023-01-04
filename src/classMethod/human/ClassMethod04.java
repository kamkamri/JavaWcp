package classMethod.human;

public class ClassMethod04 {
	public static void main(String[] args) {
		//		Human04インスタンスを生成すると、コンストラクタ内の処理が実行される
		Human04 yamada = new Human04("山田");

		//		静的メンバーはインスタンスを生成せずに、特設3章できる
//		静的メンバはクラスに属するフィールドやメソッド
		Human04.staticMethodPrint();

		//		Staticなクラス定数もインスタンスを生成せずに3章できる
		System.out.println(Human04.GREETING);

		//		インスタンスメンバーは直接しようできない　コンパイルエラーになる
		//		Human04.instanceMethodPrint();
		//		System.out.println(Human04.name);

		//		インスタンスメンバーはインスタンス生成してk等しようする
		yamada.instanceMethodPrint();
	}
}
