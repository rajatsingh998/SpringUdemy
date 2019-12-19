package demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mian {
    public static void main(String args[]){

        //load the spring configuration file
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach= context.getBean("myCoach1", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getCoach());

        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
