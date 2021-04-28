package CapaDomini;

public class PersonatgeAmbEscut {

	private int vida;
	private int dany;	
	
	public PersonatgeAmbEscut(int vida, int dany)
	{
		if( vida <= 0 ) throw new IllegalArgumentException("Valor de vida inicial incorrecte");
		if( dany <= 0 || dany >= vida) throw new IllegalArgumentException("Valor de dany incorrecte");
		
		this.vida = vida;
		this.dany = dany;
	}
	public int getDany()
	{
		return dany;
	}
	public int getVida()
	{
		return vida;
	}
	
	public void updateLife(int danyAtacant)
	{
		if( danyAtacant > 1) danyAtacant --; //efecte escut
		this.vida -= danyAtacant;
		if( this.vida <= 0 )
			System.out.println("Personatge ha mort");
	}
	
}
