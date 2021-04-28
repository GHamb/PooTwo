package test;

public class Calculadora {
		public double somar(double n1, double n2) {
			return n1+n2;
		}
		public double subtrair(double n1, double n2) {
			return n1-n2;
		}
		public double multiplicar(double n1, double n2) {
			return n1*n2;
		}
		public double dividir(double n1, double n2) {
			try {
				if(n1/n2 < Double.MAX_VALUE) {
					return n1/n2;
				}
				else {
					System.out.println("divisão por zero");
					return 0;
				}
				
			} catch (ArithmeticException e) {
				System.out.println("num divide por 0"+ e);
				return 0;
			}
			
			
		}
}
