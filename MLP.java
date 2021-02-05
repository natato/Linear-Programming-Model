class MLP extends  LP{
	MRel objectiveFuntion2;
	public MLP(double a, double b, int mode,int n,double c){
		super(a,b,mode,n);
		objectiveFunction =new MRel(a,b,c);
		objectiveFuntion2=(MRel)objectiveFunction; 
		
	}
	public void optimize(){
		/* mode value 0 for minimize and 1 for maximize*/
		int xVal1, xVal2;
		switch(mode){
			case 0://minimize

			break;
			case 1://maximize

			break;
		}
	}
	public static void main(String args[]){
		MLP model1=new MLP(3.0,5.0,0,2,2);
		model1.addNonNegativityConstraints();
		model1.addConstraintY(101,1);
		model1.addConstraintX(20,1);
		model1.addConstraintX(10,2);
		System.out.println(model1.objectiveFuntion2.getVal(1, 2));

	}
	
}