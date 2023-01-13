import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class TicTacToe {
	static ArrayList<Integer>Oyuncu1Pozisyon=new ArrayList<Integer>();
	static ArrayList<Integer>Oyuncu2Pozisyon=new ArrayList<Integer>();
	public static void main(String[] args) 
	{
		OyunKontrol o1=new OyunKontrol();
		//Oyun Tahtası
		char [][] OyunTahtası= {{'1','|','2','|','3'},
				{'-','+','-','+','-'},
				{'4','|','5','|','6'},
				{'-','+','-','+','-'},
				{'7','|','8','|','9'},};
		OyunTahtasi t1=new OyunTahtasi();
		t1.OyunTahtası(OyunTahtası);
		Scanner scan =new Scanner(System.in);
		while(true)
		{
			System.out.print("Karakter girmek istediginiz satiri seciniz(1-9): ");
			int oyuncu1deger=scan.nextInt();
			while(Oyuncu1Pozisyon.contains(oyuncu1deger)||Oyuncu2Pozisyon.contains(oyuncu1deger)){
				oyuncu1deger=scan.nextInt();
			}
			Konumlandırma(OyunTahtası,oyuncu1deger,"oyuncu1");
			String oyunsonuc=o1.OyunKontrol(Oyuncu1Pozisyon, Oyuncu2Pozisyon);
			if(oyunsonuc.length()>0)
			{
				System.out.println(oyunsonuc);
				break;
			}
			System.out.print("Karakter girmek istediginiz satiri seciniz(1-9): ");
			int oyuncu2deger=scan.nextInt();
			while(Oyuncu2Pozisyon.contains(oyuncu2deger)||Oyuncu1Pozisyon.contains(oyuncu2deger)){
				oyuncu2deger=scan.nextInt();
			}
			Konumlandırma(OyunTahtası,oyuncu2deger,"oyuncu2");
			oyunsonuc=o1.OyunKontrol(Oyuncu1Pozisyon, Oyuncu2Pozisyon);
			if(oyunsonuc.length()>0)
			{
				System.out.println(oyunsonuc);
				break;
			}
		}
		}
		public static void Konumlandırma(char [][]OyunTahtası,int girilendeger,String Kisi)
		{
			char sembol = ' ';
			if(Kisi.equals("oyuncu1"))
			{
				sembol='X';
				Oyuncu1Pozisyon.add(girilendeger);
			}
			else if(Kisi.equals("oyuncu2"))
			{
				sembol='O';
				Oyuncu2Pozisyon.add(girilendeger);
			}
			switch(girilendeger)
			{
				case 1:
					OyunTahtası[0][0]=sembol;
					break;
				case 2:
					OyunTahtası[0][2]=sembol;
					break;
				case 3:
					OyunTahtası[0][4]=sembol;
					break;
				case 4:
					OyunTahtası[2][0]=sembol;
					break;
				case 5:
					OyunTahtası[2][2]=sembol;
					break;
				case 6:
					OyunTahtası[2][4]=sembol;
					break;
				case 7:
					OyunTahtası[4][0]=sembol;
					break;
				case 8:
					OyunTahtası[4][2]=sembol;
					break;
				case 9:
					OyunTahtası[4][4]=sembol;
					break;
				default:
				System.out.println("Lutfen gecerli bir deger giriniz");
					break;
			}
			OyunTahtasi t1=new OyunTahtasi();
			t1.OyunTahtası(OyunTahtası);
		}
}
