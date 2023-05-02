//P309 通過テスト
package pass13_01;

public class Denpyo {
//フィールド
	String date;
	String item;
	int price;
	int number;	//フィールドにそれぞれの変数を設定する

//メソッド
	public void disp() {
		System.out.println(date+" / "+item+" / "+price+" / "+number);
			//それぞれの変数を出力するメソッドdispを作成する
	}
}
