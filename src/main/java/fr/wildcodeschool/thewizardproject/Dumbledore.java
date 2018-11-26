package fr.wildcodeschool.thewizardproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Dumbledore")
public class Dumbledore implements WizardInterface{

	private Outfit clothes;
	
	@Autowired
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
