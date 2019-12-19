package demo1;

public class TrackCoach implements Coach {
    FortuneService fortuneService;
    public  TrackCoach(FortuneService myFortune){
        fortuneService=myFortune;
    }
    @Override
    public String getCoach() {
        return "Track coach 5k";
    }

    @Override
    public String getDailyFortune() {
        return "from track side:" + fortuneService.getFortune();
    }


}
