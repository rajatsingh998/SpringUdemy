package demo1;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach(FortuneService theFortune){
        fortuneService=theFortune;
    }
    @Override
    public String getCoach() {
        return "Cricket coach ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
