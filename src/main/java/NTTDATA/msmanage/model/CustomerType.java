package NTTDATA.msmanage.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@Data
public class CustomerType {
    private String id;

    @NotEmpty
    private String type;

    @Valid
    private CustomerTypeTwo customerTypeTwo;
}
