package springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() + " albo nie";
    }

    @Override
    public String getDailyWorkout() {
        return "mjy";
    }
}
