package cone;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		cone C = new cone();
		System.out.println("Informe os dados comforme for solicitado: \n Raio(r): ");
		C.setR(read.nextFloat());
		System.out.println("\n Altura(z): ");
		C.setZ(read.nextFloat());
		System.out.println("Escolha o tipo de tinta que você deseja para pintar o cone: "+
		"\n 1 – R$ 238,90 \n 2 – R$ 467,98 \n 3 – R$ 758,34");
		C.setTipoTinta(read.nextInt());
		System.out.println(C.toString());;
	}

}
