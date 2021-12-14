package NTTDATA.msmanage.service;

import NTTDATA.msmanage.model.Customer;
import reactor.core.publisher.Mono;

public interface CustomerService {
    public Mono<Customer> findById (String id);

}
