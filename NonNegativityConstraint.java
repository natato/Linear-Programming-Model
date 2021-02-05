class NonNegativityConstraint{
	public NonNegativityConstraint(){
	}
	public boolean testForNonNegativity(int val){
		return (val>=0);
	}
	public static void main(String[] args){
		NonNegativityConstraint constraint=new NonNegativityConstraint();
		boolean test=constraint.testForNonNegativity(-1);
		System.out.println("When val is -1, nonnegativity = "+test);
		test=constraint.testForNonNegativity(0);
		System.out.println("When val is 0, nonnegativity = "+test);
		test=constraint.testForNonNegativity(10);
		System.out.println("When val is 10, nonnegativity = "+test);
	}
}