package hitchings.evan.ZCWLivingRoom;

/**
 * Created by evanhitchings on 9/10/16.
 */
public class Television {

    // This is the member field volume notice how its value is set to private
    private Integer volume;
    // This is the member field channel notice how its value is set to private
    private Integer channel;

    /**
     * This is the constructor, its job is to initialize any member variables
     * to non null values before they are called.
     */
    public Television(){
        this.volume = 0;
        this.channel = 0;
    }

    /**
     * To access private field values, we use Getters and Setters
     * Notice the name of this method, its name is getVolume. Its job is to return
     * the current value of Volume.
     */
    public Integer getVolume(){
        // Null is being returned here because we are Stubbing this method out.
        // The goal in TDD is to create just enough of the method so that it can compile
        return this.volume;
    }

    /**
     * To set private field values, we use Getters and Setters
     * Notice the name of this method, its name is setVolume. Its job is to set
     * the current value of volume. Setters should not return a value other than VOID
     * unless you have a good reason.
     */
    public void setVolume(Integer amount){
        this.volume = amount;
        // Since the return type is void, we do not have to do anything more to Stubb out this method
    }



}
