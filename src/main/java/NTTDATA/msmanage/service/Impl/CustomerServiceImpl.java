package NTTDATA.msmanage.service.Impl;

import NTTDATA.msmanage.model.Customer;
import NTTDATA.msmanage.service.CustomerService;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final WebClient.Builder webClientBuilder;
    private final String WEB_CLIENT_URL = "microservice.web.customer";
    private final String BASE;

    public CustomerServiceImpl(WebClient.Builder webClientBuilder, Environment env) {
        this.webClientBuilder = webClientBuilder;
        BASE = env.getProperty(WEB_CLIENT_URL);
    }

    @Override
    public Mono<Customer> findById(String id) {
        return webClientBuilder.baseUrl(BASE).build().get().uri("/{id}", id).retrieve().bodyToMono(Customer.class);
    }
}
