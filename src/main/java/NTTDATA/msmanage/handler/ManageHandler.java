package NTTDATA.msmanage.handler;

import NTTDATA.msmanage.model.Manage;
import NTTDATA.msmanage.model.dto.ManageDto;
import NTTDATA.msmanage.service.CustomerService;
import NTTDATA.msmanage.service.ManageService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.net.URI;

@Component
@RequiredArgsConstructor
public class ManageHandler{
    private final ManageService serviceManage;
    private final CustomerService serviceCustomer;

    public Mono<ServerResponse> create (ServerRequest request){
        Mono<ManageDto> manageMonoDto = request.bodyToMono(ManageDto.class);
        return manageMonoDto
                .flatMap(dto -> {
                    return serviceCustomer.findById(dto.getId())
                            .flatMap(c -> {
                                Manage manage = new Manage();
                                manage.setCustomer(c);
                                return Mono.just(manage);
                            });
                })
                .flatMap(serviceManage::save)
                .flatMap(r -> ServerResponse.created(URI.create("/manage/".concat(r.getId())))
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(r)
                ).switchIfEmpty(ServerResponse.notFound().build());
    }
}
