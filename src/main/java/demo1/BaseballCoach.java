package demo1;

public class BaseballCoach implements Coach {
    FortuneService fortuneService;
    public  BaseballCoach(){
        System.out.println("now inside the constuctor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getCoach() {
        return "Baseball going to do the work";
    }

    @Override
    public String getDailyFortune() {
        return "Message from baseball:" + fortuneService.getFortune();
    }
}
