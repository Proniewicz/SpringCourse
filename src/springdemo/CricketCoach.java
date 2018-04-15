package springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public CricketCoach() {
        System.out.println("inside Cricket constructor");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside cricket setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "qwertyu";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() + " na stopro";
    }
}
