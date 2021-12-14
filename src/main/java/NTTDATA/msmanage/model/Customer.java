package NTTDATA.msmanage.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@Data
public class Customer {

    private String id;

    @NotEmpty
    private String dni;

    @NotEmpty
    private String name;

    @NotEmpty
    private String lastname;

    private String email;

    private String phone;

    private String address;

    @Valid
    private CustomerType customerType;
}
