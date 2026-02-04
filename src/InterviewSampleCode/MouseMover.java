package com.test;

import java.awt.Robot;
import java.util.Random;
import java.util.logging.Logger;

public class MouseMover {

    private static final Logger logger =
            Logger.getLogger(MouseMover.class.getName());

    public MouseMover() {
    }

    public static void main(String... args) throws Exception {
        int count = 0;
        Robot robot = new Robot();
        Random random = new Random();

        while (true) {
            count++;
            logger.info("Jai Sri Ram..! " + count);

            int x = random.nextInt(800);
            int y = random.nextInt(800);

            robot.mouseMove(x, y);
            Thread.sleep(120000); // 2 minutes
        }
    }
}
