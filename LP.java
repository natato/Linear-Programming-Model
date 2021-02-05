class LP{
	Rel objectiveFunction;
	NonNegativityConstraint constraintForX,constraintForY;
	Constraint constrainY;
	Constraint constrainXArray[];
	int mode; //(0 for minimize and 1 for mazimize)
	int n;//number of x constraints
	int i;
	public LP(double a, double b, int mode,int n){
		objectiveFunction =new Rel(a,b);
		this.mode=mode;
		this.n=n;
		constrainXArray=new Constraint[n];
		i=0;
	}
	public void addNonNegativityConstraints(){
		constraintForX=new NonNegativityConstraint();
		constraintForY=new NonNegativityConstraint();
	}
	public void addConstraintY(int limit, int condition){
		constrainY=new Constraint(limit,condition);
	}
	public void addConstraintX(int limit, int condition){
		if(i<n){
			constrainXArray[i]=new Constraint(limit,condition);
			i++;
		}
		
	}
	public void optimize(){
		/* mode value 0 for minimize and 1 for maximize*/
		double val;
		int xVal;
		switch(mode){
			case 0://minimize
				System.out.println("Minimize Problem");
				switch(constrainXArray[0].condition){//1 for <, 2 for>, 3 for <= and 4 for  >=
					case 1:
						val=objectiveFunction.getVal(0);
						if(constrainY.testForCondition(val)){
							System.out.println("Optimized Y= "+val+" And X=0");
						}
						else{
							System.out.println("LP can not be solved");
						}
					break;
					case 2:
						xVal=constrainXArray[0].limit +1;
						val=objectiveFunction.getVal(xVal);
						if(constrainY.testForCondition(val)){
							System.out.println("Optimized Y= "+val+" And X="+xVal);
						}
						else{
							System.out.println("LP can not be solved");
						}
					break;
					case 3:
						xVal=constrainXArray[0].limit;
						val=objectiveFunction.getVal(xVal);
						if(constrainY.testForCondition(val)){
							System.out.println("Optimized Y= "+val+" And X="+xVal);
						}
						else{
							System.out.println("LP can not be solved");
						}

					break;
					case 4:
						xVal=constrainXArray[0].limit;
						val=objectiveFunction.getVal(xVal);
						if(constrainY.testForCondition(val)){
							System.out.println("Optimized Y= "+val+" And X="+xVal);
						}
						else{
							System.out.println("LP can not be solved");
						}

					break;
				}

			break;
			case 1://maximize
				System.out.println("Maximize Problem");
				switch(constrainXArray[0].condition){//1 for <, 2 for>, 3 for <= and 4 for  >=
					case 1:
						xVal=constrainXArray[0].limit -1;
						val=objectiveFunction.getVal(xVal);
						if(constrainY.testForCondition(val)){
							System.out.println("Optimized Y= "+val+" And X="+xVal);
						}
						else{
							System.out.println("LP can not be solved");
						}
					break;
					case 2:
						xVal=constrainXArray[0].limit+1;
						val=-1;
						for(int i=xVal;i<constrainY.limit;i++){
							xVal=xVal+1;
							val=objectiveFunction.getVal(xVal);
							System.out.println("val: "+val+" ");
							if(val>=constrainY.limit){
							//break
								i=constrainY.limit;
								val=objectiveFunction.getVal(--xVal);
							}
							
						}
						if(constrainY.testForCondition(val) && val!=-1){
							System.out.println("Optimized Y= "+val+" And X="+xVal);
						}
						else if(val==-1){
							System.out.println("LP can not be solved: -1");
						}
						else {
							System.out.println("LP can not be solved");
						}
					break;
					case 3:
						xVal=constrainXArray[0].limit;
						val=objectiveFunction.getVal(xVal);
						if(constrainY.testForCondition(val)){
							System.out.println("Optimized Y= "+val+" And X="+xVal);
						}
						else{
							System.out.println("LP can not be solved");
						}
						
					break;
					case 4:
						xVal=constrainXArray[0].limit;
						val=-1;
						for(int i=xVal;i<constrainY.limit;i++){
							xVal=xVal+1;
							val=objectiveFunction.getVal(xVal);
							System.out.println("val: "+val+" ");
							if(val>=constrainY.limit){
								//break
								i=constrainY.limit;
								val=objectiveFunction.getVal(--xVal);
							}
							
						}
						if(constrainY.testForCondition(val)){
							System.out.println("Optimized Y= "+val+" And X="+xVal);
						}
						else if(val==-1){
							System.out.println("LP can not be solved: -1");
						}
						else{
							System.out.println("LP can not be solved");
						}
					break;
				}
			
			break;
		}

	}
	public static void main(String args[]){
		System.out.println("Model 1");
		LP model1=new LP(3.0,5.0,0,1);
		model1.addNonNegativityConstraints();
		model1.addConstraintY(101,2);
		model1.addConstraintX(20,1);
		model1.optimize();
		System.out.println("Model 2");
		LP model2=new LP(10.0,5.0,0,1);
		model2.addNonNegativityConstraints();
		model2.addConstraintY(50,2);
		model2.addConstraintX(10,2);
		model2.optimize();
		System.out.println("Model 3");
		LP model3=new LP(3.0,5.0,1,1);
		model3.addNonNegativityConstraints();
		model3.addConstraintY(101,1);
		model3.addConstraintX(20,3);
		model3.optimize();
		System.out.println("Model 4");
		LP model4=new LP(3.0,5.0,1,1);
		model4.addNonNegativityConstraints();
		model4.addConstraintY(200,3);
		model4.addConstraintX(20,4);
		model4.optimize();
	}
	
}