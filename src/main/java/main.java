//import javafx.application.Application;
//import javafx.stage.Stage;

import java.util.*;

public class main {

    public static void main(String[] args) {
        Random random = new Random();
        int numberOfFigures = (int) Math.ceil(Math.random() * 10 + 5);
        List<Figure> figures = new LinkedList<>();
        for (int i = 0; i < numberOfFigures; i++)
            switch (random.nextInt(3)) {
                case 0: {
                    figures.add(new Circle());
                    break;
                }
                case 1: {
                    figures.add(new Square());
                    break;
                }
                case 2: {
                    figures.add(new Triangle());
                    break;
                }
                case 3: {
                    figures.add(new Trapeze());
                    break;
                }
            }
        {

        }
        for (Figure figure : figures) {
          //  figure.refactorRandom();
            figure.draw();
        }
    }


}
