package NTTDATA.msmanage.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class Manage {
    @Id
    private String id;

    private Customer customer;
    //private Product product;

    //private List<Customer> customerHolder;

    //private List<Customer> customerAuthorizedSigner;

    private double initial;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime manageDate = LocalDateTime.now();
}
