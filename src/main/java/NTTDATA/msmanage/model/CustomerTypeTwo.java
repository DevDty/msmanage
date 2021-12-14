package NTTDATA.msmanage.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class CustomerTypeTwo {
    private String id;

    @NotEmpty
    private String typeTwo;
}
