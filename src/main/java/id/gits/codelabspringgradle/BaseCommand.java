package id.gits.codelabspringgradle;
public interface BaseCommand<T> {

    T execute() throws Exception;
}
