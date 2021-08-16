package _00_Text_Funkifier;

public class CustomString extends SpecialString{
	
	public CustomString(String s) {
		super(s);
	}
	
	public String funkifyText(String s) {
		String returnString = s;
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length/2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length-i-1];
			charArray[charArray.length-i-1]=temp;
		}
		System.out.println(returnString);
		for (int i = 0; i < charArray.length; i++) {
			if(i%2==0) {
				charArray[i] = Character.toLowerCase(charArray[i]);
			}
			else {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}
		returnString = new String(charArray);
		System.out.println(returnString);
		return returnString;
	}
}
