package pl.workshop.command;

public interface Command<T>{
    void execute(T t);
}
