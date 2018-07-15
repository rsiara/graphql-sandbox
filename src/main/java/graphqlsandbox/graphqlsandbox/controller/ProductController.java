package graphqlsandbox.graphqlsandbox.controller;

import graphqlsandbox.graphqlsandbox.model.Product;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")
@RestController
public class ProductController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Product product(){
        return new Product("Miska plastikowa", "Vileda");

    }
}
