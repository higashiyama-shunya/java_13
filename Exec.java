package pass13_01;

public class Exec {

	public static void main(String[] args) {
		Denpyo denpyo1=new Denpyo();
		denpyo1.date="1月15日";
		denpyo1.item="パソコン";
		denpyo1.price=50000;
		denpyo1.number=1;
		Denpyo denpyo2=new Denpyo();		//オブジェクトを2つ作成しそれぞれ違う値を代入する
		denpyo2.date="1月16日";
		denpyo2.item="コピー用紙";
		denpyo2.price=600;
		denpyo2.number=5;
		
		denpyo1.disp();
		denpyo2.disp();		//2つの変数を表示するメソッドdispを実行する。

	}

}
