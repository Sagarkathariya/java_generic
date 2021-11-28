
public class java_generic<T>{
	T t;
	public java_generic(T t){
		this.t=t;
		
	}
	T getT(){
		return t;
		
	}
	void setT(T t) {
		this.t=t;
	}
	public void displayT() {
		System.out.println(t.getClass().getName());
	}
	public static void main(String[] args) {
		java_generic<String> a=new java_generic<>("NAST");
		a.displayT();
		
//		a.t="NAST";
//		a.t=98;
//		a.setT("college");
		System.out.println(a.getT());
	}
}
