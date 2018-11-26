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
        
        WizardInterface dumb = context.getBean("dumbledore", WizardInterface.class);
        WizardInterface gand = context.getBean("gandalf", WizardInterface.class);
        
        context.close();
        
        System.out.println("******************");
        System.out.println(gand.giveAdvice());
        System.out.println(gand.getDress());
        
        gand.changeDress(clothes);
        
        System.out.println(gand.getDress());
        System.out.println("******************");
	}
}
