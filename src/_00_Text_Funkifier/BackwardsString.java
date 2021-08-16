package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String returnString = s;
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length/2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length-i-1];
			charArray[charArray.length-i-1]=temp;
		}
		returnString = new String(charArray);
		System.out.println(returnString);
		return returnString;
	}
 
}
