package test.lab.common.commands;


public class Add extends Command {
    private final CommandReceiver commandReceiver;

    public Add(CommandReceiver commandReceiver) {
        this.commandReceiver = commandReceiver;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("\"Введен ненужный аргумент. Команда приведена к базовой команде add.");
        }
        commandReceiver.add();
    }

    @Override
    protected void writeInfo() {
        System.out.println("Команда add – добавить новый элемент в коллекцию.");
    }
}
