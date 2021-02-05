class XMLP extends  LP{
	XMRel objectiveFunction2;
	public XMLP(double a, double b, int mode,int n,double c0, double c[]){
		/* Linear programming model with objective function being multiple
		 linear i.e having 2 or more independent variables
		*/
		super(a,b,mode,n);
		objectiveFunction =new XMRel(a,b,c0,c);
		objectiveFunction2=(XMRel) objectiveFunction;
	}
	public void optimize(){
		/* mode value 0 for minimize and 1 for maximize*/
		switch(mode){
			case 0://minimize

			break;
			case 1://maximize

			break;
		}
	}
	public static void main(String args[]){

	}
	
}