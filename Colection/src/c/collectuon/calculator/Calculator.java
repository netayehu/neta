package c.collectuon.calculator;

public class Calculator {

	
	private  double res;
	
	
	
	public double getRes() {
		return res;
	}
	
	public void add (double val) {
		res+=val;
	}
	public void sub (double val) {
		res-=val;
	}
	public void mul(double val) {
		res*=val;
	}
	public void div(double val) {
		res/=val;
	}
	public void clear() {
		res=0;
	}





}
