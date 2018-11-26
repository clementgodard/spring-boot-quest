package fr.wildcodeschool.thewizardproject;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

	public App() 
	{
		
	}

	public void start()
	{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        // Book myBook = context.getBean("theBook", Book.class);
        Gandalf wizard = (Gandalf) context.getBean("Gandalf", WizardInterface.class);
        context.close();
        System.out.println("******************");
        System.out.println(wizard.giveAdvice());
        System.out.println(wizard.getOutfit());
        
        Outfit clothes = new Outfit("black");
        
        wizard.changeDress(clothes);
        
        System.out.println(wizard.getOutfit());
        
        System.out.println("******************");
	}
}
