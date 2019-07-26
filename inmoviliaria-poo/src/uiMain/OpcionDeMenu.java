package uiMain;

public abstract class OpcionDeMenu {
	
	private String key;
	
	protected OpcionDeMenu(String tituloMenu) {
		System.out.println(tituloMenu);
	}

	public void setkey(String key_n){
		this.key = key_n;
	}

	public String getKey(){
		return this.key;
	}

	public abstract void ejecutar ();
	
	public abstract String toString ();
	
}