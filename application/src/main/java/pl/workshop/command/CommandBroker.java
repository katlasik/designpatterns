package pl.workshop.command;

interface CommandBroker<T>{
    void addCommand(Command<T> command);
    void executeAll();
}
