package id.gits.codelabspringgradle.ProductModule.Commands;

import id.gits.codelabspringgradle.BaseCommand;
import id.gits.codelabspringgradle.ProductModule.Models.Product;
import id.gits.codelabspringgradle.ProductModule.Receivers.ProductReceiver;
import id.gits.codelabspringgradle.ProductModule.Repositories.ProductRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllProductsRequest implements BaseCommand {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductReceiver productReceiver;

    private String name;

    @Override
    public List<Product> execute() {
        if (name == null)
            return productReceiver.getAll();
        return productReceiver.searchByName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
