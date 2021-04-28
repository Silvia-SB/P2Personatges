package CapaDomini;

public class PersonatgeMag {

	private final int MAXVIDA = 5;
	private int vida;
	private int dany;
	// nombre entre 0 i 1 que representa la probabilitat de beure una Pòcima per recuperar 1 de vida
	private double probPocio; 
	
	public PersonatgeMag(int dany, double probPocio)
	{
		if( dany != 1 && dany != 2) throw new IllegalArgumentException("Valor de dany incorrecte");
		if( probPocio < 0 || probPocio > 0.50 ) throw new IllegalArgumentException("Valor de probabilitat de poció incorrecte");
		
		this.vida = MAXVIDA;
		this.dany = dany;
		this.probPocio = probPocio;
	}
	public int getVida()
	{
		return vida;
	}
	public int getDany()
	{
		return dany;
	}
	public void print()
	{
		System.out.printf("Personatge amb vida %d que fa %d de dany i probabilitat de beure una poció %f%n" , vida, dany, probPocio );
	}
	
	public void updateLife(int danyAtacant)
	{
		this.vida -= danyAtacant;
		if( this.vida <= 0 )
			System.out.println("Personatge ha mort");
		else if( Math.random() <= this.probPocio )
		{
			System.out.println("\t bevem una pòció per recuperar vida");
			this.vida += 1;
		}
	}
	
}
