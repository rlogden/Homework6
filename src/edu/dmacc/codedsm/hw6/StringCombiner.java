package edu.dmacc.codedsm.hw6;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class StringCombiner {

    public String combineStrings(String x, String y) {

        return x + " " + y;

    }

    public static String outputDate() {

        SimpleDateFormat format = new SimpleDateFormat();
        return format.format(Date.from(Instant.now()));

    }

    public String dateCombiner(String a, String b) {

        return a + " " + b;

    }

    public static void main(String[] args) {

        StringCombiner a = new StringCombiner();
        System.out.println(a.dateCombiner(a.combineStrings("Today's", "Date:"), outputDate()));

    }
}
