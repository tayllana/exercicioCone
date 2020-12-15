package cone;

public class cone {
	
	float r, z;
	int tipoTinta;
	
	public float getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	public int getTipoTinta() {
		return tipoTinta;
	}
	public void setTipoTinta(int tipoTinta) {
		this.tipoTinta = tipoTinta;
	}
	public float volume() {
		return z;
		
	}
	public double g() {
		return Math.sqrt(Math.pow(z, 2) + Math.pow(r, 2));
	}
	public double areaDoFundo() {
		return 3.14 * Math.pow(r, 2);
	}
	public double aLateral() {
		return 3.14*r*g();
	}
	public double aTotal() {
		return 3.14*r*(r+g());
	}
	public double litros() {
		return aTotal()*3.45;
	}
	public double latas() {
		return Math.round(litros()/18);
	}
	public double valTotal() {
		double valTotal = 0;
		switch(tipoTinta) {
		case(1):
			valTotal =  238.90*latas();
		break;
		case(2):
			valTotal = 467.98*latas();
		break;
		case(3):
			valTotal = 758.34*latas();
		break;
		}
		return valTotal;

	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		 builder.append("\n Raio: "+getR());
		 builder.append("\n Altura: "+getZ());
		 builder.append("\n Nível: "+getTipoTinta());
		 builder.append("\n Geratriz: "+g());
		 builder.append("\n Área do Fundo: "+areaDoFundo());
		 builder.append("\n Área lateral: "+aLateral());
		 builder.append("\n Área Total: "+aTotal());
		 builder.append("\n Litros: "+litros());
		 builder.append("\n Latas: "+latas());
		 builder.append("\n Valor Total: "+valTotal());
		 
		 return builder.toString();
	}
	
}
