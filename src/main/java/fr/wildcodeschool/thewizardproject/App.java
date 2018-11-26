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
        
        Outfit clothes = new Outfit("black");
        
        WizardInterface dumb = context.getBean("Dumbledore", WizardInterface.class);
        WizardInterface gand = context.getBean("Gandalf", WizardInterface.class);
        
        context.close();
        
        System.out.println("******************");
        System.out.println(dumb.giveAdvice());
        System.out.println(dumb.getDress());
        
        dumb.changeDress(clothes);
        
        System.out.println(dumb.getDress());
        System.out.println("******************");
	}
}
