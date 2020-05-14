package day2;

public class AlternateString {

	public static void main(String[] args) {
		String str = "When the world realise its own mistake, corona will dissolve automatically";
		String out = "";
		String arr[] = str.split("\\s");
		int len = arr.length;
		for(int i =0 ; i < len ; i++)
		{
			String word1 = "";
			if(i%2 != 0) {
				String word = arr[i];

				char  letter[] = word.toCharArray();
				for(int j = word.length()-1 ; j >= 0; j--)
				{
					word1 = word1 + letter[j];
				}
			}
			else
			{
				word1 = arr[i];	
			}

			out = out+ " " + word1;

		}

		System.out.println(out);
	}

}
