package sample1;

public class calc {
	public void add(int a,int b) {
	int c=a+b;
	System.out.println("Sum=" +c);
	}
	public int sub(int a,int b) {
		int c=a-b;
		return c;
		}
	public static void main(String[] args) {
		calc sum=new calc();
		sum.add(5, 6);
		sum.add(5, 2);
		int c=sum.sub(5, 1);
		System.out.println("diff="+c);
		sum.sub(5,3);
	}
}
