package jobs.Search;

class Encapsulation extends Encapsul
{
	public static void main(String ar[])
	{
		Encapsul en=new Encapsulation();
		en.getShow();
		en.display();
		en.setShow(6);
	}
}
class Encapsul {
private void show()
{
	System.out.println("From Show");
}
private void show(int n)
{
	System.out.println("From Show"+n);
}

public void getShow()
{
	show();
}
public void setShow(int no)
{
	show(no);
}

public void display()
	{
		System.out.println("From Display");
	}
}

