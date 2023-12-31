package test.lab.common.commands;


import test.lab.common.client.Product;

import java.util.HashMap;

public class CommandInvoker {
    private final HashMap<String, Command> commandMap = new HashMap<>();
    private Product product;


    public void register(String commandName, Command command) {
        commandMap.put(commandName, command);
    }



    public void executeCommand(String[] commandName) {
        try {
            if (commandName.length > 0) {
                Command command = commandMap.get(commandName[0]);
                command.execute(commandName);
            } else {
                System.out.println("Вы не ввели команду");
            }

        } catch (IllegalStateException | NullPointerException ex) {
            System.out.println("Не сущесвтует команды " + commandName[0] + ". Для справки используйте команду - help");
        }
    }

    HashMap<String, Command> getCommandMap() {
        return commandMap;
    }

}
