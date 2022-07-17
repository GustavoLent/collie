package com.collie.api.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogService {
    private static String now() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        return dateFormat.format(date);
    }

    public static void error(String message) {
        System.out.printf("[%s] Error: %s", LogService.now(), message);
    }
}
