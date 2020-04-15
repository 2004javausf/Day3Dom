package oh.my.goodness;

public class SignificantOther {

	private String name;
	private double height;
	private String eyeColor;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", eyeColor=" + eyeColor + "]";
}

	
}
