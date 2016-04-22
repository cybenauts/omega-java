class A{
	int a=100;
}
class B extends A{
	int a=200;
}
class C extends B{
	int a=300;
	void fx(){
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(super.super.a);
	}
}

class Mterm extends C
{
	public static void main(String[] args) {
		C ob=new C();
		ob.fx();

		
	}
}