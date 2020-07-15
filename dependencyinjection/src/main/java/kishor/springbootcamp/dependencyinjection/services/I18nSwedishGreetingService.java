package kishor.springbootcamp.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"SE", "default"})
@Service("i18nService")
public class I18nSwedishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Haj Värld - SE";
    }
}
