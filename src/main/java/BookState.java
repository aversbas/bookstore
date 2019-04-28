/**
 * Created by alexm on 28.04.2019.
 */
public class BookState {
    private boolean isAvailable = true;
    private boolean isNotAvailable = false;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isNotAvailable() {
        return isNotAvailable;
    }

    public void setNotAvailable(boolean notAvailable) {
        isNotAvailable = notAvailable;
    }
}
