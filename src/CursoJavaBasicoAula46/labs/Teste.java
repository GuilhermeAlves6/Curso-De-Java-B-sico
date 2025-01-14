package CursoJavaBasicoAula46.labs;
//(1)Criar a classe teste
public class Teste {
	
	//(37)Criar o public static void main(String[] args )
	public static void main(String[] args ) {
		
		//(38)Criar um quadrado 
		Quadrado f1 = new Quadrado();
		f1.setLado(2);
		f1.setNome("Quadrado");
		
		//(39)Criar um círculo
		Circulo f2 = new Circulo();
		f2.setRaio(2);
		f2.setNome("Circulo");
		
		//(40)Criar um triângulo
		Triangulo f3 = new Triangulo();
		f3.setAltura(2);
		f3.setBase(3);
		f3.setNome("Triangulo");
		
		//(41)Criar um Cubo
		Cubo f4 = new Cubo();
		f4.setLado(3);
		f4.setNome("Cubo");
		
		//(42)Criar um cilindro
		Cilindro f5 =  new Cilindro();
		f5.setAltura(3);
		f5.setRaio(2);
		f5.setNome("Cilindro");
		
		//(43)Criar uma Pirâmide
		Piramide f6 = new Piramide();
		f6.setAltura(3);
		f6.setApotema(4);
		f6.setArestaBase(2);
		f6.setNumPolibase(4);
		f6.setBase(f1);
		f6.setNome("Piramide");
		
		//(44)Colocar tudo dentro de um Array // USO DO "UPCASTING"
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0] = f1;
		figuras[1] = f2;
		figuras[2] = f3;
		figuras[3] = f4;
		figuras[4] = f5;
		figuras[5] = f6;
		
		//(45)Interar o Exercicio usando o FOR MELHORADO para interar e pegar as INFORÇÕES 
		for (FiguraGeometrica figura : figuras){
			System.out.println("------------------------");
			System.out.println(figura.getNome());
			
			//(46)Polimorfismo na figura2D com IF // USO DO "DOWNCASTING" com o USO DO "INSTANCEOF"
			if (figura instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figura;
				System.out.println(f2d.calcularArea());
			}
			
			//(47)Polimorfismo na figura3D com IF // USO DO "DOWNCASTING" com o USO DO "INSTANCEOF"
			if (figura instanceof Figura3D) {
				Figura3D f3d = (Figura3D) figura;
				System.out.println(f3d.calcularArea());
				System.out.println(f3d.calcularVolume());
			}
			
			
			System.out.println();
		}
		
		

		
		
	}

}
