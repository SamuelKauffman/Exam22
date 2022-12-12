package Fianl;

public class Number39 {
	private int height;
	private int width;
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int areaRec() {
		int area= height*width;
		return area;
	}
	public int periRec() {
		int peri= 2*(height+width);
		return peri;
	}
	public static void main(String[] args) {
		Number39 Rec=new Number39();
		Rec.setHeight(10);
		Rec.setWidth(20);
		System.out.println("The area is: "+ Rec.areaRec());
		System.out.println("The perimeter is: "+ Rec.periRec());
		}	


}
