package org.throwable.Demo;

/**
 * @author zhangjinci
 * @version 2017/2/16 14:34
 * @function
 */
public class Demo {

    private static double maximumLongitudeLimit;
    private static double minimumLongitudeLimit;
    private static double maximumLatitudeLimit;
    private static double minimumLatitudeLimit;

    public static boolean locationRangeFilter(Location location) {
        return location.longitude > maximumLongitudeLimit && maximumLongitudeLimit != 0
                || location.latitude > maximumLatitudeLimit && maximumLatitudeLimit != 0
                || location.longitude < minimumLongitudeLimit && minimumLongitudeLimit != 0
                || location.latitude < minimumLatitudeLimit && minimumLatitudeLimit != 0;
    }

    private static class Location {

        public double longitude;
        public double latitude;
    }
}
