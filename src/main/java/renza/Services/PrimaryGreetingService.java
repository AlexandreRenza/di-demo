package renza.Services;

import org.springframework.context.annotation.Primary;

public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;


    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
