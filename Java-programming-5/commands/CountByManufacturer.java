package test.lab.common.commands;

public class CountByManufacturer extends Command {

    public final CommandReceiver commandReceiver;

    public CountByManufacturer(CommandReceiver commandReceiver) {
        this.commandReceiver = commandReceiver;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length > 2) {
            System.out.println("Введен не нужный аргумент. Команда приведена к базовой команде count_by_manufacturer.");
        }
        commandReceiver.countByManufacturer(args[1]);

    }

    @Override
    protected void writeInfo() {
        System.out.println("Команда count_by_manufacturer - выводит количество элементов, значение поля manufacturer которых равно заданному");
    }


}
