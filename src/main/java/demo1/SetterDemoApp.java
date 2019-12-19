package demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BaseballCoach theCoach= context.getBean("myBaseballCoach", BaseballCoach.class);

        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getCoach());
        context.close();
    }
}
