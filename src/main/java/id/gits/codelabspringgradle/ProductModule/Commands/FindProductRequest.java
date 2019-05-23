package id.gits.codelabspringgradle.ProductModule.Commands;

import id.gits.codelabspringgradle.BaseCommand;
import id.gits.codelabspringgradle.ProductModule.Models.Product;
import id.gits.codelabspringgradle.ProductModule.Receivers.ProductReceiver;
import id.gits.codelabspringgradle.ProductModule.Repositories.ProductRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class FindProductRequest implements BaseCommand {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductReceiver productReceiver;

    @Setter
    private Long id;

    @Override
    public Product execute() {
        return productReceiver.find(this.id);
    }
}
