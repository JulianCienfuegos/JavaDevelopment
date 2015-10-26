class Integrator {
	public static void main(String[] args){
		TanhSinh ts = new TanhSinh();
		ts.evalIntegrals();

		Trap trap = new Trap();
		trap.evalIntegrals();
	}	
}