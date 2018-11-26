package fr.wildcodeschool.thewizardproject;

public class Gandalf implements WizardInterface{

	private Outfit clothes;
	
	public Gandalf(Outfit clothes) {
		this.changeDress(clothes);
	}

	@Override
	public String giveAdvice() {
		return "You shall not pass !";
	}

	@Override
	public void changeDress(Outfit clothes) {
		this.clothes = clothes;
	}
	
	@Override
	public Outfit getDress() {
		return this.clothes;
	}

}
