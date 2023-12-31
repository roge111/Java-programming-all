package test.lab.common.commands;

public class ExecuteScript extends Command {
    private static String path;
    private final CommandReceiver commandReceiver;

    public ExecuteScript(CommandReceiver commandReceiver) {
        this.commandReceiver = commandReceiver;
    }

    public static String getPath() {
        return path;

    }

    @Override
    protected void execute(String[] args) throws StackOverflowError {
        try {
            if (args.length == 2) {
                path = args[1];
                commandReceiver.executeScript(args[1]);
            } else {
                System.out.println("Некорректное количество аргументов. Для справки напишите help.");
            }
        } catch (StackOverflowError ex) {
            System.out.println("Ошибка! Обнаружен выход за пределы стека.");
        }
    }

    @Override
    protected void writeInfo() {
        System.out.println("Команда execute_script. Синтаксис: execute_script file_name – считать и исполнить скрипт из указанного файла. " + "В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
    }


}
