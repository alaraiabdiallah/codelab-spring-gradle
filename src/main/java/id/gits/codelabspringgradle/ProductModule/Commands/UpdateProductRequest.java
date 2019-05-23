package id.gits.codelabspringgradle.ProductModule.Commands;

import id.gits.codelabspringgradle.BaseCommand;
import id.gits.codelabspringgradle.ProductModule.Models.Product;
import id.gits.codelabspringgradle.ProductModule.Receivers.ProductReceiver;
import id.gits.codelabspringgradle.ProductModule.Repositories.ProductRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateProductRequest implements BaseCommand {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductReceiver productReceiver;

    @Setter
    private Long id;

    @Setter
    private Product newData;

    @Override
    public Product execute() throws Exception {
        return productReceiver.update(id,newData);
    }
}
