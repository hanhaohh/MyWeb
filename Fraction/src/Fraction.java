public class Fraction{
	private int num;
	private int den;
	public Fraction(int n,int d){
	this.num = n;
	this.den = d;
	}
	public Fraction(int n){
	this(n,1);
	}
	public Fraction(){
		this(0,1);
		}
	public String toString(){
		return num + "/"+den;
	}
	
	public void add(Fraction left, Fraction right){
		this.den = left.den*right.den;
		this.num = left.den*right.num+right.den*left.num;
	}
	public static void main(String[] args) {
		Fraction a = new Fraction(1,2);
		Fraction b = new Fraction(3,4);
		Fraction c = new Fraction();
		c.add(a,b);
		System.out.println(c.toString());
	}
} 