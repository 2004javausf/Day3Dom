package oh.my.goodness;

import oh.my.goodness.SignificantOther;

public class SigRun {

	public static void main(String[] args) {
		
		SignificantOther p= new SignificantOther();
		p.setName("Tasha");
		p.setHeight(4.9);
		p.setEyeColor("Blue");
		System.out.println(p.getName());
		System.out.println(p.getHeight());
		System.out.println(p.getEyeColor());
	
}
}