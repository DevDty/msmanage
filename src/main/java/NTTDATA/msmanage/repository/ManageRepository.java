package NTTDATA.msmanage.repository;

import NTTDATA.msmanage.model.Manage;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ManageRepository extends ReactiveMongoRepository<Manage, String> {
}
