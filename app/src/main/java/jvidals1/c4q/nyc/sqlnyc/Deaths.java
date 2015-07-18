package jvidals1.c4q.nyc.sqlnyc;

/**
 * Created by s3a on 7/17/15.
 */
public class Deaths {
    private static String deaths;
    private static String ethnicity;
    private static int year;

    public static String getDeaths() {
        return deaths;
    }

    public static void setDeaths(String deaths) {
        Deaths.deaths = deaths;
    }

    public static String getEthnicity() {
        return ethnicity;
    }

    public static void setEthnicity(String ethnicity) {
        Deaths.ethnicity = ethnicity;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        Deaths.year = year;
    }
}
