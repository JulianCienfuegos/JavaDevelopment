class Trap{
	public int N = 1000;
	public double h = 2.0/N;
	public double lep = -1.0;

	public void evalIntegrals(){
		double sum = 0;
		for(int trap = 0; trap < N-1; trap++){
			sum += h*0.5*(Integrand.f1(lep + trap*h) + Integrand.f1(lep + (trap+1)*h));
		}
		System.out.println("Integral 1 gives " + sum);
		sum = 0;
		for(int trap = 0; trap < N-1; trap++){
			sum += h*0.5*(Integrand.f2(lep + trap*h) + Integrand.f2(lep + (trap+1)*h));
		}
		System.out.println("Integral 2 gives " + sum);
		sum = 0;
		for(int trap = 0; trap < N-1; trap++){
			sum += h*0.5*(Integrand.f3(lep + trap*h) + Integrand.f3(lep + (trap+1)*h));
		}
		System.out.println("Integral 3 gives " + sum);		
	}
}