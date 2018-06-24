package graphqlsandbox.graphqlsandbox.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    private String name;
    private String manufacturer;

    public Product(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }
}
