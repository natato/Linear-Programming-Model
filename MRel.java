class MRel extends Rel{//mutiple linear relation
 //A class for linear relation in the form Y=aX1+bX2+c
	double c;
	public MRel(double a, double b, double c){
		super(a,b);
		this.c=c;
	}
	public double getVal(double X1,double X2){
		return (a*X1)+(b*X2)+c;
	}
	public static void main(String args[]){
		MRel r=new MRel(0.4,5,10);
		double Y1=r.getVal(10,5);
		System.out.println("Y ="+Y1+" when X1="+10+" X2="+5);
	}
}