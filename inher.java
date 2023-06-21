package day9;

//multilevel inheritance 
	class a{
		String name;
		public void msg() {
			System.out.println("cbit");	
		}
	}
	 class b extends  a{
			public void msg(int a) {
				//a=12;
				
			System.out.println("id is "+a);
		}
		
	}
	 class c extends b{
		 public void msg(float k) {
			 k=20;
			 System.out.println("pooji:"+(float)k);
		 }
	 }
class inher extends c{
	public static void main(String args[]) {
	inher s=new inher();
	int a=10;
	float k=20;
	s.name="sri";
	s.msg();
	s.msg(a);
	s.msg(k);
	
}
}