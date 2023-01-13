import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class OyunKontrol {
	public static String OyunKontrol(ArrayList<Integer>Oyuncu1Pozisyon,ArrayList<Integer>Oyuncu2Pozisyon)
	{
		List BirinciSatır=Arrays.asList(1,2,3);
		List İkinciSatır=Arrays.asList(4,5,6);
		List ÜcüncüSatır=Arrays.asList(7,8,9);
		
		List BirinciSütun=Arrays.asList(1,4,7);
		List İkinciSütun=Arrays.asList(2,5,8);
		List ÜcüncüSütun=Arrays.asList(3,6,9);
		
		List SolÜstCapraz=Arrays.asList(1,5,9);
		List SagÜstCapraz=Arrays.asList(3,5,7);
		
		List<List> Galibiyet=new ArrayList<List>();
		Galibiyet.add(BirinciSatır);
		Galibiyet.add(İkinciSatır);
		Galibiyet.add(ÜcüncüSatır);
		Galibiyet.add(BirinciSütun);
		Galibiyet.add(İkinciSütun);
		Galibiyet.add(ÜcüncüSütun);
		Galibiyet.add(SolÜstCapraz);
		Galibiyet.add(SagÜstCapraz);
		
		for(List a : Galibiyet)
		{
			if(Oyuncu1Pozisyon.containsAll(a))
			{
				return "Oyuncu1 Kazandi";
			}
			else if(Oyuncu2Pozisyon.containsAll(a))
			{
				return "Oyuncu2 Kazandi";
			}
			else if(Oyuncu1Pozisyon.size()+Oyuncu2Pozisyon.size()==9)
			{
				return "Kazanan Yok";
			}
		}
		return "";
	}
}
