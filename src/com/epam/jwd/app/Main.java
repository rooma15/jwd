package com.epam.jwd.app;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import com.epam.jwd.model.Point;

public class Main {
    public static void main(String[] args) {
        private final Logger LOGGER = LogManager.getLogger(Main.class);
        private Point[] pointMass = new Point[4];
        for(int i = 0; i < 4; i++) {
            pointMass[i] = new Point(i, i);
        }
        for(Point var : pointMass){
            LOGGER.info("Point {} included", var.toString());
        }
    }
}
