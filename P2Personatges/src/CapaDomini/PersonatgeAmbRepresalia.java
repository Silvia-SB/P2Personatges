package CapaDomini;

public class PersonatgeAmbRepresalia {

	private int vida;
	private int dany;
	// nombre entre 0 i 1 que representa la probabilitat de fer una represàlia
	private double probRepresalia; 
	
	public PersonatgeAmbRepresalia(int vida, int dany, double probRepresalia)
	{
		if( vida <= 0 ) throw new IllegalArgumentException("Valor inicial de vida incorrecte");
		if( dany <= 0 || dany > vida) throw new IllegalArgumentException("Valor de dany incorrecte");
		if( probRepresalia < 0 || probRepresalia > 1 ) throw new IllegalArgumentException("Valor de probabilitat de represàlia incorrecte");
		
		this.vida = vida;
		this.dany = dany;
		this.probRepresalia = probRepresalia;
	}
	public int getVida() {
		return this.vida;
	}
	public int getDany()
	{
		return dany;
	}
	public void print()
	{
		System.out.printf("Personatge amb vida %d que fa %d de dany i probabilitat de represàlia %f%n" , vida, dany, probRepresalia );
	}
	
	public void updateLife(int danyAtacant)
	{
		this.vida -= danyAtacant;
		if( this.vida <= 0 )
			System.out.println("Personatge ha mort");
	}
	
	public void somVictimaDUnAtac(PersonatgeAmbRepresalia other)
	{
		System.out.println("Personatge amb Represàlia és atacat");
		this.updateLife(other.getDany());
		if(this.vida > 0 && Math.random() <= this.probRepresalia )
		{
			System.out.println("\t fem una represàlia");
			other.updateLife(1);
		}
	}
}
