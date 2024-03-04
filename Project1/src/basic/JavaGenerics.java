package basic;
 class MyClass <T,V>{
	 T ob;
	 V ob2;
	 MyClass( T ob, V ob2){
		 this.ob=ob;
		 this.ob2=ob2;
	 }
	 void showType() {
		 System.out.println(ob.getClass().getName());
		 System.out.println(ob.getClass().getName());
		 
	 }
	 
	
}
 
 class NumericFnsc<T extends Number>{
	 T ob;
	 NumericFnsc(T ob){
		 this.ob=ob;
	 }
	 double square() {
		 return ob.intValue()*ob.doubleValue();
	 }
	 
 }
public class JavaGenerics {

	public static void main(String[] args) {
		MyClass<Integer,Double> obj=new MyClass<>(10,34.44);
		MyClass<Float,Double> obj2=new MyClass<>(20.0f,3.4);
		
		NumericFnsc<Integer> iob=new NumericFnsc<>(4);
		System.out.println(iob.square());
		
		obj.showType();
		obj2.showType();
		
	}

}
