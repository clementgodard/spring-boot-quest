package fr.wildcodeschool.thewizardproject;

public class Dumbledore implements WizardInterface{

	private Outfit clothes;

	public Dumbledore(Outfit clothes) {
		this.changeDress(clothes);
	}

	@Override
	public String giveAdvice() {
		return "May the magic be with you";
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
