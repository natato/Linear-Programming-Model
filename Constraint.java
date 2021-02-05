class Constraint{
	int limit;
	int condition;
	public Constraint(int limit,int condition){// condition values are 1 for <, 2 for >, 3 for <= and 4 for >=
		this.limit=limit;
		this.condition=condition;
	}
	public static void main(String[] args){
		Constraint constraint1=new Constraint(10,1);
		boolean test=constraint1.testForCondition(10);
		System.out.println("if val = 10 and limit=10 and condition is < test for condition is "+test);

		Constraint constraint2=new Constraint(10,2);
		test=constraint2.testForCondition(10);
		System.out.println("if val = 10 and limit=10 and condition is > test for condition is "+test);

		Constraint constraint3=new Constraint(10,3);
		test=constraint3.testForCondition(10);
		System.out.println("if val = 10 and limit=10 and condition is <= test for condition is "+test);
		
		Constraint constraint4=new Constraint(10,4);
		test=constraint3.testForCondition(10);
		System.out.println("if val = 10 and limit=10 and condition is >= test for condition is "+test);
	}
	public boolean testForCondition(double val){
		boolean test;
		switch(condition){
			case 1:
				test=(val<limit);
			break;
			case 2:
				test=(val>limit);
			break;
			case 3:
				test=(val<=limit);
			break;
			case 4:
				test=(val>=limit);
			break;
			default :
				test=false;
			break;
		}
		return test;
	}
}