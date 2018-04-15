package springdemo;

public class FootballCoach implements Coach{
    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FootballCoach() {
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune()+ " chyba";
    }

    @Override
    public String getDailyWorkout() {
        return "nojrwa";
    }
}
