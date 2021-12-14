package NTTDATA.msmanage.service;

import NTTDATA.msmanage.model.Manage;
import reactor.core.publisher.Mono;

public interface ManageService {
    public Mono<Manage> save(Manage manage);
    public Mono<Manage> findById(String id);
}
