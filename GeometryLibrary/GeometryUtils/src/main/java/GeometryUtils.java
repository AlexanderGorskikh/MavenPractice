public class GeometryUtils {
    public static double convertSquareMetersToSquareCentimeters(double areaInSquareMeters) {
        return areaInSquareMeters * 10_000;
    }

    public static double convertSquareCentimetersToSquareMeters(double areaInSquareCentimeters) {
        return areaInSquareCentimeters / 10_000;
    }
}
