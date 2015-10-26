class TanhSinh{
	public double PI = 3.14159265358979;

	public double transform(double t){
		return Math.tanh(0.5*PI*Math.sinh(t));
	}

	public double d_transform(double t){
		return PI*Math.cosh(t) / (2*Math.pow(Math.cosh(0.5*PI*Math.sinh(t)),2));
	}

	public void evalIntegrals(){
		int N = 100;
		int n = -N;
		double h = Math.pow(2, -4);
		double sum = 0;

		// Evaluate integral 1.
		while (n < N){
			sum += h * d_transform(n*h) * Integrand.f1(transform(n*h));
			n += 1;
		}
		System.out.println("Integral 1 gives " + sum);

		// Evaluate integral 2.
		n = -N;
		sum = 0;
		while (n < N){
			sum += h * d_transform(n*h) * Integrand.f2(transform(n*h));
			n += 1;
		}
		System.out.println("Integral 2 gives " + sum);

		// Evaluate integral 3.
		n = -N;
		sum = 0;
		while (n < N){
			sum += h * d_transform(n*h) * Integrand.f3(transform(n*h));
			n += 1;
		}
		System.out.println("Integral 3 gives " + sum);
	}
}