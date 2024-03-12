package interfaces.callback;

public interface ICallback {
    void call();
    default void doCall(){
        call();
    }
}
