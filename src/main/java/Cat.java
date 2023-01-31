import org.springframework.context.annotation.Scope;


public class Cat {
    private String name;

    public Cat() {
    } /* Можно не создавать явно */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
