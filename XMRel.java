class XMRel extends Rel{
//mutiple linear relation made up of more than 2 independent variables
 //A class for linear relation in the form Y=aX1+bX2+c
	double c[];
	double c0;
	public XMRel(double a, double b, double c0, double  c[]){
		super(a,b);
		this.c0=c0;
		this.c=c;
	}
	public double getVal(double X1, double X2, double X[]){
		double val= (a*X1)+(b*X2)+c0;
		for(int i=0;i< X.length;i++){
			 val=val+(X[i]*c[i]);
		}
		return val;
	}
	public static void main(String args[]){
		
	}
}