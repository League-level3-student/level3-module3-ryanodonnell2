package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String returnString = s;
		char[] charArray = s.toCharArray();
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
