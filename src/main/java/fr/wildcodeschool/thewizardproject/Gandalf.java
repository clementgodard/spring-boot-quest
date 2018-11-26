package fr.wildcodeschool.thewizardproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Gandalf")
public class Gandalf implements WizardInterface{

	private Outfit clothes;
	
	@Autowired
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
	
	public Outfit getOutfit() {
		return this.clothes;
	}

}
