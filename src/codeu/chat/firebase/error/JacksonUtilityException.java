package codeu.chat.firebase.error;

/**
 * Created by scott on 5/18/17.
 */
import org.apache.log4j.Logger;


public class JacksonUtilityException extends Throwable {

  protected static final Logger LOGGER = Logger.getRootLogger();

  private static final long serialVersionUID = 1L;

  public JacksonUtilityException( String message ) {
    super( message );
  }

  public JacksonUtilityException( String message, Throwable cause ) {
    super( message, cause );
  }

}