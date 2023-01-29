package AreaOfCircle;

public class Main {

	public static void main(String[] args) {
		AreaOfCircle a,a1,a2;
		a=new AreaOfCircle();
		a1=new AreaOfCircle(70);
		a2=new AreaOfCircle(a);
		a.find();
		a.display();
		a1.find();
		a1.display();
		a2.find();
		a2.display();
	}

}
