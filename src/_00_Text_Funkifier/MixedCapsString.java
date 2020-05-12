package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String c ="";
		for (int i = 0; i < s.length(); i++) {
			if(i%2==0) {
				String b = "" + s.charAt(i);
				//System.out.print(b.toLowerCase());
			c+=b.toLowerCase();	
				
			}if(i%2==1) {
				String a = "" + s.charAt(i);
				//System.out.print(a.toUpperCase());
				c+=a.toUpperCase();	
			}
		}
	return c ;
	}

}
