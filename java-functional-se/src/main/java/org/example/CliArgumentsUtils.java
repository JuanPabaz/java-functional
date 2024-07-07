package org.example;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CliArgumentsUtils {

    static void showHelp(CliArguments cliArguments){

        Consumer<CliArguments> consumerHelper = cliArguments1 -> {
            if (cliArguments1.getHelp()){
                System.out.println("Manual solicitado");
            }
        };

        consumerHelper.accept(cliArguments);
    }

    static CliArguments generateCli(){

        Supplier<CliArguments> generator = () -> new CliArguments();

        return generator.get();
    }
}
