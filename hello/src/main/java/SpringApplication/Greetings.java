package SpringApplication;

/**
 * Created by Batman on 12/8/2015.
 */
public class Greetings {

    private final long id;
    private final String content;

    public Greetings(long id, String content){

        this.id = id;
        this.content = content;

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

