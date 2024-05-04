package services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id){
        super("Nao localizamos um usuario com a id" + id);
    }
}
