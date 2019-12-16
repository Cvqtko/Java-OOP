package exercise_05;

import exercise_05.interfaces.Repository;
import exercise_05.interfaces.Runnable;
import exercise_05.interfaces.UnitFactory;

import java.util.Scanner;

import exercise_05.interfaces.CommandInterpreter;
import exercise_05.core.CommandInterpreterImpl;
import exercise_05.core.Engine;
import exercise_05.core.factories.UnitFactoryImpl;
import exercise_05.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        CommandInterpreter commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);
        Runnable engine = new Engine(commandInterpreter);
        engine.run();
    }
}
