package NTTDATA.msmanage.service.Impl;

import NTTDATA.msmanage.model.Manage;
import NTTDATA.msmanage.repository.ManageRepository;
import NTTDATA.msmanage.service.ManageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ManageServiceImpl implements ManageService {

    private final ManageRepository repository;

    @Override
    public Mono<Manage> save(Manage manage) {
        return repository.save(manage);
    }

    @Override
    public Mono<Manage> findById(String id) {
        return repository.findById(id);
    }
}
