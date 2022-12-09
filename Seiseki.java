package dokugaku.com;
import java.io.*;

class Syosai{

	double Hyo; //合計評価
	int Ave; //平均
	int Tan;//単位合計
	int A =0;
	double GPA;
	
	void show()
	{
		System.out.println("単位と成績(0~4)を入力してください");
	}
	
}


public class Seiseki   {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("科目数はいくつですか");
		String str = br.readLine();
		int n = Integer.parseInt(str);
		
		Syosai S1 = new Syosai();
		S1.show();
		
		for (int i = 0; i < n; i ++) 
		{
		
		System.out.println((i+1) + "個目の科目");
		System.out.print("単位:");
		String str1 = br.readLine();
		System.out.print("成績:");
		String str2 = br.readLine();
	    
		int t = Integer.parseInt(str1); 
		double h = Double.parseDouble(str2);
		
		
		double hyo = t*h;
		S1.Hyo += hyo; //成績の合計
		S1.Tan +=t;//単位合計
		
		if (h == 3 || h == 4) {
			S1.A += t;			
		}
		
		
		if (i == n-1) {
			S1.GPA = S1.Hyo/S1.Tan;
		}
		
		}

		double g = (double)S1.A/S1.Tan*100;
		
		System.out.println("合計単位数は"+S1.Tan);
		System.out.println("合計評価は" + S1.Hyo +"です");
		System.out.println("AとA＋は全体の" + g +"パーセントです");
		
		if(g >= 70)System.out.println("推薦が受けれます");
		else System.out.println("来学期頑張らないとやばいです");
		
		System.out.println("GPAは" + S1.GPA +"です");	
	}

}
