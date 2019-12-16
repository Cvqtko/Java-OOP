package exercise_03;

import exercise_03.interfaces.Repository;
import exercise_03.interfaces.Runnable;
import exercise_03.interfaces.UnitFactory;

import java.util.Scanner;

import exercise_03.core.Engine;
import exercise_03.core.factories.UnitFactoryImpl;
import exercise_03.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
