
public class motor {

	private double hacim;
	private int silindir;
	private String yakit;
	
	
	public double getHacim() {
		return this.hacim;
	}
	public void setHacim(double hacim) {
		this.hacim = hacim;
	}
	public int getSilindir() {
		return this.silindir;
	}
	public void setSilindir(int silindir) {
		this.silindir = silindir;
	}
	public String getYakit() {
		return this.yakit;
	}
	public void setYakit(String yakit) {
		
		if(yakit=="Benzin" || yakit=="dizel" || yakit=="lpg" ) {
			this.yakit=yakit;
		}
		else {
			System.out.println("Yanlış yakıt türü");
		}
		
	}
	
	public void start() {
		System.out.println("Motor Çalışıyor...");
	}
	
	
	
	

}
