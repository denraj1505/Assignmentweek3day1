package org.system;

public class Desktop extends Computer {
	
	public void desktopSize()
	{
		System.out.println("My desktop size is: 21");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop mycomp=new Desktop();
		mycomp.computerModel();
		mycomp.desktopSize();

	}

}
