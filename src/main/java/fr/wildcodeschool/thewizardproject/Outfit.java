package fr.wildcodeschool.thewizardproject;

public class Outfit 
{
	private String outfit;
	
	public Outfit() 
	{
		this("white");
	}
	
	public Outfit(String outfit)
	{
		this.outfit = outfit;
	}
	
	
	public String toString()
	{
		return "The Wizard's dress is " + this.outfit;
	}

}
