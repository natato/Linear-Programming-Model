class Rel{
 //A class for linear relation in the form Y=aX+b
	double a;
	double b;
	public Rel(double a, double b){
		this.a=a;
		this.b=b;
	}
	public double getVal(double X){
		return (a*X)+b;
	}
	public static void main(String args[]){
		Rel r=new Rel(0.4,5);
		double Y1=r.getVal(2);
		System.out.println("Y ="+Y1+" when X="+2);
	}
}