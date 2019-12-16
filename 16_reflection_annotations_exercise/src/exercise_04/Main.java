package exercise_04;

import exercise_04.interfaces.Repository;
import exercise_04.interfaces.Runnable;
import exercise_04.interfaces.UnitFactory;

import java.util.Scanner;

import exercise_04.core.Engine;
import exercise_04.core.factories.UnitFactoryImpl;
import exercise_04.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
